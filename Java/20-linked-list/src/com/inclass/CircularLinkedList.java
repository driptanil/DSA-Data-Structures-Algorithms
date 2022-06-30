package com.inclass;

public class CircularLinkedList {

    public static class Node {
        int var;
        Node next;

        public Node(int var) {
            this.var = var;
        }
    }

    Node head;
    private long size;

    public CircularLinkedList() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        System.out.print(">>=");
        System.out.print(" " + temp.var + " ->");
        while (temp.next != head) {
            temp = temp.next;
            System.out.print(" " + temp.var + " ->");
        }
        System.out.println(">");
    }

    public void insertFirst(int var) {
        Node node = new Node(var);
        size++;
        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        node.next = head;

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        head = node;
    }

    public void insertLast(int var) {
        if (head == null) {
            insertFirst(var);
            return;
        }

        size++;
        Node node = new Node(var);
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
    }

    public void insert(int index, int var) {
        if (index == 0) {
            insertFirst(var);
            return;
        }

        Node temp = head;
        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp.next == head) {
            insertLast(var);
            return;
        }

        Node node = new Node(var);
        node.next = temp.next;
        temp.next = node;
    }

    public int deleteFirst() {
        int var = head.var;
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        return var;
    }

    public int deleteLast() {
        Node temp = head;
        Node temp2 = head;
        while (temp.next != head) {
            temp2 = temp;
            temp = temp.next;
        }
        int var = temp.var;
        temp2.next = head;
        return var;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        Node temp = head;
        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
        }

        if (temp.next == head) {
            return deleteLast();
        }

        int var = temp.next.var;
        temp.next = temp.next.next;
        return var;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insertFirst(5);
        list.display();

        list.insertLast(7);
        list.display();

        list.insertFirst(1);
        list.display();

        list.insertLast(9);
        list.display();

        list.insert(1, 3);
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(1));
        list.display();
    }

}
