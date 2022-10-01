#include<stdio.h>
#include<stdlib.h>
typedef struct queue
{
    int val;
    struct queue *next;
}q;
q *front=NULL;
q *rear=NULL;
void enqueue(int ele)
{
    q *temp;
    temp=(q*)malloc(sizeof(q));
    temp->val=ele;
    if(front==NULL && rear==NULL)
    {
        front=temp;
        rear=temp;
        rear->next=NULL;
    }
    else
    {
        rear->next=temp;
        rear=temp;
        rear->next=NULL;
    }
}
void dequeue()
{
    q *del;
    if(front==NULL && rear==NULL)
    {
        printf("\nUnderflow");
    }
    else
    {
        del=front;
        front=front->next;
        free(del);
    }
}
void display()
{
    if(front==NULL && rear==NULL)
       printf("\nUnderflow");
    q *dis;
    dis=front;
    while(dis!=NULL)
    {
        printf("%d\n",dis->val);
        dis=dis->next;
    }
}
int main()
{
    int c,i;
    while(1)
    {  
       printf("\n 1.Enqueue 2.Dequeue 3.Display 4.Exit");
       printf("\n enter the choice");
       scanf("%d",&c);
       switch(c)
       {
        case 1:
           printf("Enter the element to insert");
           scanf("%d",&i);
           enqueue(i);
           break;
        case 2:
           dequeue();
           break;
        case 3:
           display();
           break;
        case 4:
           return 0;
        default:
            printf("Please enter a valid choice");
            break;
       }
    }
    return 0;
}
