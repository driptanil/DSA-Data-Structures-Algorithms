#include <stdio.h>
#include <stdlib.h>

struct Node
{
    struct Node *prev;
    int data;
    struct Node *next;
};

struct Node *head = NULL, *tail = NULL, *curr=NULL;

void inserteFirst(int k){
    curr = (struct Node *)malloc(sizeof(struct Node));
    curr->data = k;
    curr->next = NULL;
    if (head == NULL) {
        head = tail = curr;
    }    
    else {
        curr->next = head;
        head->prev = curr;
        head = curr;
    } 
} 

void insertLast(int k){
    curr = (struct Node *)malloc(sizeof(struct Node));
    curr->prev = NULL;
    curr->data = k;
    curr->next = NULL;
    if (head == NULL) {
        head = tail = curr;
    }    
    else {
        tail->next = curr;
        curr->prev = tail;
        tail = curr;
    } 
} 

void deleteFirst(void){
    if (head == NULL){
        printf("\nThe list is empty");
    }                      
    else if (head == tail) {
        head = tail = NULL;
    }    
    else {
        curr = head; 
        head = head->next;
        head->prev = NULL;
        free(curr); 
    }               
} 

void deleteLast(void){
    if (head == NULL){
        printf("\nThe list is empty");
    }
    else if (head == tail){
        head = tail = NULL;
    }
    else {
        curr = tail;
        tail = tail->prev;
        tail->next = NULL;
        free(curr);
    } 
} 

struct Node* init(int k){
    curr=(struct Node *)malloc(sizeof(struct Node));
    curr->prev=NULL;
    curr->next=NULL;
    curr->data=k;
    return curr;
}

void display(){
    if (head == NULL){
        printf("\nlist is empty");
    } 
    else{
        curr = head;
        while (curr != tail) {
            printf("%d ", curr->data);
            curr = curr->next;
        } 
        printf("%d", curr->data);
    } 
    printf("\n");    
} 

void main(){
    int position, element, key, choice;

    while(1){
        printf("1. InsertFirst \n");
        printf("2. InsertLast \n");
        printf("3. DeleteFirst \n");
        printf("4. DeleteLast \n");
        printf("5. Display \n");
        printf("6. Exit\n");

        printf("\nEnter your choice:");
        scanf("%d", &choice);

        switch (choice){
        case 1:
            printf("\nEnter the element:");
            scanf("%d", &element);
            inserteFirst(element);
            break;
        case 2:
            printf("\nEnter the element:");
            scanf("%d", &element);
            insertLast(element);
            break;
        case 3:
            deleteFirst();
            break;
        case 4:
            deleteLast();
            break;
        case 5:
            display();
            break;
        case 6:
            exit(0);

        default:
            printf("\nInvalid...\n");
            break;
        } 
    }     
} 