package com.inclass;

public class SinglyLinkedList {
    private class Node {
        public int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size = 0;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        if (head == null) {
            head = tail;
        }
        size++;
    }

    public void insert(int index, int val) {
        Node node = new Node(val);
        Node temp = head;

        if (index == 0) {
            insertFirst(val);
            return;
        }

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == tail) {
            insertLast(val);
            return;
        }

        node.next = temp.next;
        temp.next = node;

        size++;
    }

    public Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int get(int index) {
        Node node = getNode(index);
        return node.value;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty Linked List !");
        }
        head = head.next;
        size--;
    }

    public void deleteLast() {
        if (tail == null) {
            System.out.println("Empty linked list");
        }

        Node node = getNode(size - 2);

        node.next = null;
        tail = node;
        size--;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
        }
        Node node = getNode(index - 1);

        node.next = node.next.next;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
}
