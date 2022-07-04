package com.inclass;

public class DoublyLinkedList {

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

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
    }

    public void displayReverse() {
        Node temp = tail;
        System.out.print("end");
        while (temp != null) {
            System.out.print(" -> " + temp.val);
            temp = temp.prev;
        }
        System.out.println();
    }

    public void insertFirst(int var) {
        Node node = new Node(var);
        node.prev = null;
        if (head == null) {
            node.next = null;
            head = tail = node;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }

    public void insertLast(int var) {
        Node node = new Node(var);
        node.next = null;
        if (tail == null) {
            node.prev = null;
            head = tail = node;
            return;
        }
        node.prev = tail;
        tail.next = node;
        tail = node;
    }

    public void insert(int index, int var) {
        Node node = new Node(var);
        if (head == null || index == 0) {
            insertFirst(var);
            return;
        }
        Node temp = head;
        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == tail) {
            insertLast(var);
            return;
        }
        temp.next = node;
        node.prev = temp;
        node.next = temp.next;
        temp.next.prev = node;
    }

    public int deleteFirst() {
        int var = head.val;
        head.next.prev = null;
        head = head.next;
        return var;
    }

    public int deleteLast() {
        int var = tail.val;
        tail.prev.next = null;
        tail = tail.prev;
        return var;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        Node temp = head;
        int count = 0;
        while (count < index - 1) {
            count++;
            temp = temp.next;
        }

        if (temp == tail) {
            return deleteLast();
        }

        int var = temp.next.val;
        if (temp.next == tail) {
            temp.next = null;
            tail = temp;
            return var;
        }

        temp.next.next.prev = temp;
        temp.next = temp.next.next;
        return var;
    }

    public static void main (String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(3);
        list.display();
        list.displayReverse();
        System.out.println();

        list.insertFirst(1);
        list.display();
        list.displayReverse();
        System.out.println();

        list.insertLast(5);
        list.display();
        list.displayReverse();
        System.out.println();

        list.insert(0, 7);
        list.display();
        list.displayReverse();
        System.out.println();

        list.deleteFirst();
        list.display();
        list.displayReverse();
        System.out.println();

        list.deleteLast();
        list.display();
        list.displayReverse();
        System.out.println();

        list.insertLast(7);
        list.display();
        list.displayReverse();
        System.out.println();


        list.delete(2);
        list.display();
        list.displayReverse();
        System.out.println();

    }
}
