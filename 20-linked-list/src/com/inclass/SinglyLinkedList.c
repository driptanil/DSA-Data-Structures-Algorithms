# include <stdio.h>
# include <stdlib.h>

typedef struct node {
    int val;
    struct node * next;
}node;

node * init(int val) {
    node * newNode = (node *) malloc(sizeof (node));
    newNode->val=val;
    newNode->next=NULL;
    return newNode;
}

void insertFirst(node ** head, int val) {
    if (*head == NULL) {
        node * newNode = init(val);
        *head = newNode;
        return;
    }
    node * newNode = init(val);
    newNode->next = *head;
    *head = newNode;
}

void insertLast(node ** head, int val) {
    if (*head == NULL) {
        insertFirst(head, val);
        return;
    }
    node * temp = *head;
    while(temp->next != NULL) {
        temp = temp->next;
    }
    node * newNode = init(val);
    temp->next = newNode;
}

int deleteFirst (node ** head) {
    if (*head == NULL) {
        printf("\nEmpty Linked List !!!");
        return -1;
    }
    int val = (*head)->val;
    *head = (*head)->next;
    return val;
}

int deleteLast (node ** head) {
    node * temp = *head;
    while (temp->next->next != NULL) {
        temp = temp->next;
    }
    int val = temp->next->val;
    temp->next = temp->next->next;
    return val;
}

void display(node * head) {
    node * temp = head;
    printf("\n");
    while (temp != NULL) {
        printf("[%d] --> ", temp->val);
        temp = temp->next;
    }
    printf("null");
}

int main () {
    node * head = NULL;
    int choice,val;
    while (1) {
        printf("\n1.InsertFirst\t2.InsertLast\n3.DeleteFirst\t4.DeleteLast\t5.Exit\n");
        printf("Enter a choice : ");
        scanf("%d", &choice);
        switch(choice)
        {
            case 1: printf("enter a element : ");
                    scanf("%d",&val);
                    insertFirst(&head,val);
                    display(head);
                    break;
            case 2: printf("enter a element : ");
                    scanf("%d",&val);
                    insertLast(&head,val);
                    display(head);
                    break;
            case 3: deleteFirst(&head);
                    display(head);
                    break;
            case 4: deleteLast (&head);
                    display(head);
                    break;
            case 5: 
                    printf("\nExiting !!!");
                    return 0;
            default: 
                    printf("Wrong Input !!!\n");
        }
        
    }
    return 0;
}
