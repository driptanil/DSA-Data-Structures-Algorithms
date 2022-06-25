package com.inclass;

public class DoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(5);
        list.display();

        list.insertLast(6);
        list.display();

        list.insert(1, 7);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();
    }

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.prev = null;
        node.next = head;
        head = node;

        if (tail == null)
            tail = head;

        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        node.prev = tail;
        node.next = null;
        tail.next = node;
        tail = node;
        if (head == null)
            head = tail;

        size++;
    }

    public void insert(int index, int val) {
        Node node = new Node(val);

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            insertLast(val);
            return;
        }
        node.next = temp.next;
        node.prev = temp;
        if (temp.next.next != null)
            temp.next.next.prev = node;
        temp.next = node;

        size++;
    }

    public void deleteFirst() {
        head.next.prev = null;
        head = head.next;

        size--;
    }

    public void deleteLast() {
        tail.prev.next = null;
        tail = tail.prev;
        tail.prev = null;
        size--;
    }

    public void delete(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        temp.next.next.prev = temp;
        temp.next = temp.next.next.next;
        size--;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }
}
