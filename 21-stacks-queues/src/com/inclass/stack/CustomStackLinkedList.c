/* Program that implements Stack Data Structure using Linked List */

#include <stdio.h>
#include <stdlib.h>

// Create Node Structure (Consisting of Data, and a pointer to next node)
typedef struct node
{
    int data;
    struct node *link;
} NODE;

void push(NODE **head)
{
    /*
     * Function that pushes an element into the stack
     */

    // Create a new node
    NODE *newnode = (NODE *)malloc(sizeof(NODE));

    // If there is no more free space to allocate memory
    if (newnode == NULL)
    {
        printf("\nStack Overflow!!!\n\n");
    }
    else
    {
        newnode->link = NULL;
        printf("Enter the element to be pushed : ");
        scanf("%d", &newnode->data);
        printf("%d pushed to the stack\n\n", newnode->data);
        // If the stack is empty
        if (*head == NULL)
        {
            *head = newnode;
        }
        // If the stack is not empty
        else
        {
            newnode->link = *head;
            *head = newnode;
        }
    }
}

void pop(NODE **head)
{
    /*
     * Function that pops an element from the stack
     */

    // If the stack is empty
    if (*head == NULL)
    {
        printf("Stack Underflow!!!\n\n");
    }
    // If the stack is not empty
    else
    {
        NODE *temp = *head;
        printf("Element Popped : %d\n\n", temp->data);
        *head = (*head)->link;
        temp->link = NULL;
        free(temp);
    }
}
void peek(NODE *head)
{
    /*
     * Function that displays the top element of the stack
     */

    (head == NULL) ? printf("Stack is empty!!!\n\n") : printf("Top of the stack : %d\n\n", head->data);
}

void display(NODE *head)
{
    /*
     * Function that displays the contents of the Stack
     */

    // If the Stack is not empty
    if (head != NULL)
    {
        printf("Stack : \n\n");
        while (head != NULL)
        {
            printf("%d\n", head->data);
            head = head->link;
        }
        printf("\n");
    }
}

void exit_p(NODE **head)
{
    /*
     * Function that frees the memory allocated to the Stack
     */

    NODE *temp;
    while ((*head) != NULL)
    {
        temp = (*head)->link;
        (*head)->link = NULL;
        free((*head));
        *head = temp;
    }
    exit(EXIT_SUCCESS);
}

int main()
{
    int choice = 0;
    NODE *head = NULL;
    while (1)
    {
        printf("1. Push\t\t2. Pop\n3. Peek\t\t4. Exit\nChoice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            // Performs Push operation
            push(&head);
            display(head);
            break;

        case 2:
            // Performs Pop Operation
            pop(&head);
            display(head);
            break;

        case 3:
            // Performs Peek Operation
            peek(head);
            display(head);
            break;

        case 4:
            // Exit Operation
            display(head);
            exit_p(&head);
            break;

        default:
            printf("Invalid Input!\n\n");
        }
    }
}
