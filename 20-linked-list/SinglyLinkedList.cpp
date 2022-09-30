#include <iostream>
using namespace std;

class node
{
public:
    int data;
    node *next;

    node(int data)
    {
        this->data = data;
        this->next = NULL;
    }

    ~node()
    {
        int value = this->data;
        if (this->next!=NULL)
        {
            this->next = NULL;
            delete next;
        }
        cout<<"Memory is free for node with data "<<value<<endl;
    }
};

int getlength(node *&head)
{
    int cnt=0;
    node *temp = head;
    while (temp != NULL)
    {
        cnt++;
        temp=temp->next;
    }
    return cnt;
}

void traverse(node *head)
{
    node *temp = head;
    while (temp != NULL)
    {
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}

void insAtHead(node* &head, node* &tail, int data)
{
    if(head==NULL)
    {
        node *newNode = new node(data);
        tail = newNode;
        head = newNode;
    }
    else
    {
        
        node *newNode = new node(data);
        newNode->next = head;
        head = newNode;
    }
}

void deleteNode(node* &head,int value, int pos)
{
    if(head==NULL)
    {
        cout<<"List is empty!"<<endl;
        return;
    }
    if(pos>(getlength(head)))
    {
        cout<<"Please enter a valid position!"<<endl;
        return;
    }
    
    cout<<"Before Deleting:"<<endl;
    traverse(head);
    cout<<endl;

    node* temp = head;
    // For first node/Deleting node from head
    if (value==temp->data && pos==1)
    {
        head=temp->next;
        temp->next=NULL;
        delete temp;
    }
    // For deleting nodes(including the node at tail) other than first node(node at head)
    else
    {
        node* prev=NULL;
        while (temp!= NULL && temp->data != value)
        {
            prev=temp;
            temp=temp->next;
        }
        if(temp==NULL)
        {
            cout<<"Node not found!"<<endl;
            return;
        }
        else
        {
            prev->next=temp->next;
            temp->next=NULL;
            delete temp;
        }
    }
}

int main()
{
    node *first = new node(1);
    node *head = first;
    node *tail = first;

    // Inserting nodes at head
    insAtHead(head,tail, 2);
    insAtHead(head,tail, 3);
    insAtHead(head,tail, 4);
    insAtHead(head,tail, 5);

    // Printing the nodes present in the singly linked list
    traverse(head);

    // //Deleting the kth node present in the singly linked list
    // deleteNode(head,3,1);
    // cout<<"After Deleting:"<<endl;
    // traverse(head);

    return 0;
}