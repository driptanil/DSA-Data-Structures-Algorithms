# include <stdio.h>
# include <stdlib.h>

typedef struct binaryTree {
    int val;
    struct binaryTree * left;
    struct binaryTree * right;
}tree;

tree * init (int val) {
    tree * node = (tree *) malloc (sizeof(tree));
    node->val = val;
    node->left = NULL;
    node->right = NULL;
    return node;
}


int i = -1;
tree * arrayToTree(int arr[]) {
    if (arr[++i] == 0) {
        return NULL;
    }

    tree * node = init(arr[i]);
    node->left = arrayToTree(arr);
    node->right = arrayToTree(arr);

    return node;
}

void preOrderTraversal(tree * node) {
    if (node == NULL) {
        return;
    }
    printf("[%d] ", node->val);
    preOrderTraversal(node->left);
    preOrderTraversal(node->right);
}

void inOrderTraversal(tree * node) {
    if (node == NULL) {
        return;
    }
    inOrderTraversal(node->left);
    printf("[%d] ", node->val);
    inOrderTraversal(node->right);
}

void postOrderTraversal(tree * node) {
    if (node == NULL) {
        return;
    }
    postOrderTraversal(node->left);
    postOrderTraversal(node->right);
    printf("[%d] ", node->val);
}

int search(int arr[], int target, int start, int end) {
    for(int i = start; i <= end; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
}

void output(int arr[], int start, int end) {
    for(int i = start; i <= end; i++) {
        printf("[%d] ", arr[i]);
    }
}

int j = 0;
void reconstructionTree(tree * node, int preOrder[], int preSize, int inOrder[], int inStart, int inEnd) {
    
    if (j > preSize || inStart > inEnd){
        return;
    }

    int index = search(inOrder, preOrder[j], inStart, inEnd);
    j++;
    node = init(inOrder[index]);
    
    // printf("\n\n::left %d -> %d\t", inStart, index - 1);
    // output(inOrder, inStart, index - 1);
    
    // printf("\n::mid [%d]", inOrder[index]);

    // printf("\n::right %d -> %d\t", index + 1, inEnd);
    // output(inOrder, index + 1, inEnd);

    reconstructionTree(node->left, preOrder, preSize, inOrder, inStart, index - 1);
    reconstructionTree(node->right, preOrder, preSize, inOrder, index + 1, inEnd);
}

void display (tree * root) {
    printf("\n\n:: Pre-Order :: ");
    preOrderTraversal(root);

    printf("\n\n:: In-Order :: ");
    inOrderTraversal(root);

    printf("\n\n:: Post-Order :: ");
    postOrderTraversal(root);
}

int main () {

    tree * root = NULL;
    int arr[]={1,2,4,0,0,5,8,0,0,9,0,0,3,6,0,0,7,0,0};
    int exit = 0;
    while(exit == 0){
        printf("\n1.Create using Array\t2.PreOrder Traverse\n3.InOrder Traverse\t4.PostOrder Traverse\t5.Exit\nEnter choice: ");
        int choice;
        scanf("%d",&choice);
        switch(choice){
            case 1:
                root = arrayToTree(arr);
                break;
            case 2:
                preOrderTraversal(root);
                break;
            case 3:
                inOrderTraversal(root);
                break;
            case 4:
                postOrderTraversal(root);
                break;
            case 5:
                exit = 1;
                break;
            default:
                printf("Enter valid I/P ");
        }    
    }
    display(root);
    return 0;
}
