package com.questions;

public class OrderTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
    }

    public void increasingBST(TreeNode root) {
        if (root.left == null) {
            return;
        }
        increasingBST(root.left);
        System.out.print(root.val + " ");
        increasingBST(root.right);
    }

    static int index = -1;

    public TreeNode arrayToTree(Integer[] array) {
        if (array[++index] == null) {
            return null;
        }

        TreeNode treeNode = new TreeNode(array[index]);
        treeNode.left = arrayToTree(array);
        treeNode.right = arrayToTree(array);

        return treeNode;
    }




    public static void main (String[] args) {
        OrderTree orderTree = new OrderTree();
        Integer[] arr = new Integer[] {5,3,6,2,4,null,8,1,null,null,null,7,9};
        TreeNode root = orderTree.arrayToTree(arr);
        orderTree.increasingBST(root);
    }
}
