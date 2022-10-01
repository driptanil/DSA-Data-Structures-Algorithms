#include<stdio.h>
#include <stdlib.h>
#define size 5
#define true 1
#define false 0

int currentSize=0;
int front=0,rear=-1;
int isFull(){
    if(currentSize==size){
        return true;
    }else return false;
}

int isEmpty(){
    if(currentSize==0){
        return true;
    }else return false;
}

void enqueue(int * arr,int value){
    if (!isFull()){
        rear=(rear+1)%size;
        arr[rear]=value;
        currentSize++;
    }else{
        printf("%s","Queue is full\n");
    }
}

int dequeue(int * arr){
    if (!isEmpty()){
       int temp =arr[front];
       front=(front+1)%size;
       currentSize--;
    }else{
        printf("%s","Queue is empty\n");
    }
}

void display(int * arr){
    if (!isEmpty()){
            for(int i =0;i<currentSize;i++){
               if(i==0){
                    printf("[%d",arr[i]);
                } else printf(",%d",arr[i]);

            }
            printf("]\n");
    }else{
        printf("%s","Null\n");
    }
}

void main(){

    int * arr = (int *)malloc(sizeof(int)*size);

    while(1) {
        int selection;

        printf("%s","\n\n1. Enqueue\t2. Dequeue\t3. Exit\n");
        printf("%s","\nEnter your selection: ");
        scanf("%d",&selection);

        switch(selection){
            int value;
            case(1):

                    printf("%s","Enter value to be inserted: ");
                    scanf("%d",&value);
                    enqueue(arr,value);
                    display(arr);
                    break;

            case(2):dequeue(arr);
                    display(arr);
                    break;
            case(3):
                printf("%s","Exited successfully");
                return;
            default:
                printf("%s","Invalid selection\n");
        }

   }


}
