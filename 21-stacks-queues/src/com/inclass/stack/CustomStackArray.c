#include<stdio.h>
#include<stdlib.h>
#define MAX 5

int stack[MAX];
int top = -1;

void push(int item)
{
   if(top == MAX - 1)
   {
        printf("Stack OverFlow !!!\n");
   }
   else
   {
       top = top + 1;
       stack[top] =  item;
    }
}

void pop()
{
    int ele;
    if(top == -1)
    {
         printf("Stack OverFlow !!!\n");
    }
    else
    {
        ele = stack[top];
        printf("%d is deleted ",ele);
        top  = top  - 1;
    }
}

void display()
{
      if (top == -1)
      {
        printf("Stack UnderFlow !!!\n");
      }
      else
      {
            printf("[ ");
           for(int i = 0;i < top;i++)
           {
                printf("%d, ",stack[i]);
           }
           printf("%d ]\n", stack[top]);
      }
}
void peek()
{
    if (top > 0) 
    {
      int ans = stack[top];
      printf("peek = %d\n",ans);
    }
    else
    {
        printf("Empty Stack !!!\n");
    }
}
int main()
{
     int ele,ch;
     while(1)
     {
          printf("\n1. Push             2. Pop");
          printf("\n3. Peek             4. Exit");
          printf("\nEnter a choice :  ");
          scanf("%d",&ch);
          switch(ch)
          {
                case 1: 
                    printf("Enter element : ");
                    scanf("%d",&ele);
                    push(ele);
                    display();
                    break;
                case 2: 
                    pop();
                    display();
                    break;
                case 3: 
                    peek();
                    display();
                    break;
                case 4: 
                    printf("\nExiting !!!");
                    return 0;

                default: 
                    printf("Wrong Input !!!\n");
          }
     }
     return 0;
}
