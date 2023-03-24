import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CustomBinaryTree<T> {
    class TreeNode {
        T val = null;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(T val) {
            this.val = val;
        }

        public TreeNode() {

        }
    }

    TreeNode root = new TreeNode();

    static int index = -1;
    public TreeNode arrayToTree(T[] array) {
        if (array[++index] == null) {
            return null;
        }

        TreeNode treeNode = new TreeNode(array[index]);
        treeNode.left = arrayToTree(array);
        treeNode.right = arrayToTree(array);

        return treeNode;
    }

    public ArrayList<T> preOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return new ArrayList<>();
        }
        ArrayList<T> result = new ArrayList<>();
        result.add(treeNode.val);
        result.addAll(preOrderTraversal(treeNode.left));
        result.addAll(preOrderTraversal(treeNode.right));
        return result;
    }

    public ArrayList<T> inOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return new ArrayList<>();
        }
        ArrayList<T> result = new ArrayList<>(inOrderTraversal(treeNode.left));
        result.add(treeNode.val);
        result.addAll(inOrderTraversal(treeNode.right));

        return result;
    }

    public ArrayList<T> postOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return new ArrayList<>();
        }
        ArrayList<T> result = new ArrayList<>(postOrderTraversal(treeNode.left));
        result.addAll(postOrderTraversal(treeNode.right));
        result.add(treeNode.val);

        return result;
    }

    public ArrayList<T> levelOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            return new ArrayList<>();
        }
        ArrayList<T> result = new ArrayList<>();
        if (treeNode.left != null)
            result.add(treeNode.left.val);
        if (treeNode.right != null)
            result.add(treeNode.right.val);

        result.addAll(levelOrderTraversal(treeNode.left));
        result.addAll(levelOrderTraversal(treeNode.right));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.remove();
            if (treeNode == null) {
                b.append("\n");
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                b.append(treeNode.val).append(" ");
                if (treeNode.left != null)
                    queue.add(treeNode.left);
                if (treeNode.right != null)
                    queue.add(treeNode.right);
            }
        }

        return b.toString();
    }

    public int count(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        return 1 + count(treeNode.left) + count(treeNode.right);
    }

    public Integer sum(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        return (Integer) treeNode.val + sum(treeNode.left) + sum(treeNode.right);
    }

    public int height(TreeNode treeNode) {
        if (treeNode == null)
            return 0;
        int leftHeight = height(treeNode.left);
        int rightHeight = height(treeNode.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public int[] diameter(TreeNode treeNode) {
        if (treeNode == null)
            return new int[2];
        int[] left = diameter(treeNode.left);
        int[] right = diameter(treeNode.right);
        int hei = left[1] + right[1] + 1;
        int dia = Math.max(hei, Math.max(left[0], right[0]));
        return new int[] {dia, hei};
    }

    public Integer maximum(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        return Math.max((Integer) root.val, Math.max(maximum(root.left), maximum(root.right)));
    }

    public Integer minimum(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        return Math.min((Integer) root.val, Math.min(minimum(root.left), minimum(root.right)));
    }

    public ArrayList<T> leftNodes(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<T> left = new ArrayList<>();
        if (root.left != null) {
            left.add(root.left.val);
        }
        left.addAll(leftNodes(root.left));
        left.addAll(leftNodes(root.right));
        return left;
    }

    public ArrayList<T> rightNodes(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        ArrayList<T> right = new ArrayList<>();
        if (root.right != null) {
            right.add(root.right.val);
        }
        right.addAll(rightNodes(root.left));
        right.addAll(rightNodes(root.right));
        return right;
    }

    public ArrayList<T> leftView (TreeNode left) {

    }

    public static void main(String[] args) {
        CustomBinaryTree<Integer> tree = new CustomBinaryTree<>();

        // Integer[] arr = new Integer[] {1, 2, 4, null, null, 5, null, null, 3, null, 6, null, null};
        Integer[] arr = new Integer[] {4, 7, null, null, 6, null, 2, 5, null, null, 1, 3, null, null, null};

        tree.root = tree.arrayToTree(arr);
        System.out.println("Root = " + tree.root.val);

        ArrayList<Integer> preOrder = tree.preOrderTraversal(tree.root);
        System.out.println("PreOrder Traversal = " + preOrder);

        ArrayList<Integer> inOrder = tree.inOrderTraversal(tree.root);
        System.out.println("InOrder Traversal = " + inOrder);

        ArrayList<Integer> postOrder = tree.postOrderTraversal(tree.root);
        System.out.println("PostOrder Traversal = " + postOrder);

        ArrayList<Integer> levelOrder = new ArrayList<>();
        levelOrder.add(tree.root.val);
        levelOrder.addAll(tree.levelOrderTraversal(tree.root));
        System.out.println("Level Order Traversal = " + levelOrder);

        System.out.println(tree);

        System.out.println("No of nodes = " + tree.count(tree.root));

        System.out.println("Sum = " + tree.sum(tree.root));

        System.out.println("Max Height = " + tree.height(tree.root));

        int[] arr2 =  tree.diameter(tree.root);
        System.out.println("Diameter = " + (arr2[0] - 1));

        System.out.println("Maximum = " + tree.maximum(tree.root));
        System.out.println("Minimum = " + tree.minimum(tree.root));

        System.out.println("Left View = " + tree.leftNodes(tree.root));
        System.out.println("Right View = " + tree.rightNodes(tree.root));

    }
}
