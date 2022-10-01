#include<stdio.h>
#include<stdlib.h>
typedef struct node
{
    int val;
    struct node *next;
}node;
node *head=NULL;
node *init(int ele)
{
    node *temp;
    temp=(node*)malloc(sizeof(node));
    temp->val=ele;
    temp->next=NULL;
    return temp;
}
void insertFirst()
{
   node *ptr,*current;
   int i;
   printf("\nEnter the new element:");
   scanf("%d",&i);
   ptr=(init(i));
   if(head==NULL)
   {
      head=ptr;
      ptr->next=head;
   }
   else
   {
      current=head;
      while(current->next!=head)
       current=current->next;
      ptr->next=head;
      current->next=ptr;
      head=ptr;
   }
}
void insertLast()
{
   node *ptr,*current;
   int i;
   printf("\nEnter the new element:");
   scanf("%d",&i);
   ptr=init(i);
   current=head;
   if(head==NULL)
   {
      head=ptr;
      ptr->next=head;
   }
   else
   {
     while(current->next!=head)
       current=current->next;
     current->next=ptr;
     ptr->next=head;
   }
}
void deleteFirst()
{ 
    node *ptr,*current;
    ptr=head;
    if(head==NULL)
      printf("Empty Linked List !!!");
    else if(ptr->next==head)
    {
        printf("%d",ptr->val);
        head=NULL;
        free(ptr);
    }
    else
    {
     ptr=head;
     current=head;
     while(current->next!=head)
      current=current->next;
     current->next=ptr->next;
     head=ptr->next;
     printf("%d",ptr->val);
     free(ptr);
    }
}
void deleteLast()
{
    node *current,*prev;
    current=head;
    if(head==NULL)
      printf("Empty Linked List !!!");
    else if(current->next==head)
    {
        printf("%d",current->val);
        head=NULL;
        free(current);
    }
    current=head;
    while(current->next!=head)
    {
      prev=current;
      current=current->next;
    }
    printf("%d\n",current->val);
    prev->next=current->next;
    free(current);
}
void display()
{
    node *ptr;
    if(head==NULL)
      printf("NULL");
    else
    {
    ptr=head;
    while(ptr->next!=head)
    {
      printf("%d->",ptr->val);
      ptr=ptr->next;
    }
    printf("%d",ptr->val);
    }
}
int main()
{
    int choice;
    while(1)
    {
      printf("\n 1. InsertFirst            2. InsertLast");
      printf("\n 3. DeleteFirst            4.  DeleteLast         5. Exit");
      printf("\n Enter the choice:");
      scanf("%d",&choice);
      switch(choice)
      {
        case 1:
           insertFirst();
           break;
        case 2:
           insertLast();
           break;
        case 3:
           deleteFirst();
           break;
        case 4:
           deleteLast();
           break;
        case 5:
           display();
           return 0;
        default:
           printf("Enter valid choice");
      }
    }
    return 0;
}
