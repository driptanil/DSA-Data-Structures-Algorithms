// Circular queue implementation in C
#include <stdio.h>
#include <stdlib.h>
#define MAX 50
void insert();
void delete ();
void display();
int queue_array[MAX];
int rear = -1;
int front = -1;

void insert(int x)
{
    if (front == -1 && rear == -1)
    {
        front = rear = 0;
        queue_array[rear] = x;
    }
    else if ((rear + 1) % MAX == front)
    {
        printf("Queue is full\n");
    }
    else
    {
        rear = (rear + 1) % MAX;
        queue_array[rear] = x;
    }
}
void delete ()
{
    if (front == -1 && rear == -1)
    {
        printf("Queue is empty\n");
    }
    else if (front == rear)
    {
        front = rear = -1;
    }
    else
    {
        printf("Element Deleted: %d\n", queue_array[front]);
        front = (front + 1) % MAX;
    }
}
void display()
{
    if (front != -1 && rear != -1)
    {
        printf("Queue is: ");
        for (int i = front; i != rear; i = (i + 1) % MAX)
        {
            printf("%d ", queue_array[i]);
        }
        printf("%d\n", queue_array[rear]);
    }
}

int main()
{
    int choice;
    int a;
    while (1)
    {
        printf("1. Enqueue    ");
        printf("2. Dequeue    ");
        printf("3. Exit     ");
        printf("Enter your choice : ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter the element to be inserted: ");
            scanf("%d", &a);
            insert(a);
            display();
            break;
        case 2:
            delete ();
            display();
            break;
        case 3:
            exit(1);
            break;
        default:
            printf("Wrong choice \n");
        }
    }
}
