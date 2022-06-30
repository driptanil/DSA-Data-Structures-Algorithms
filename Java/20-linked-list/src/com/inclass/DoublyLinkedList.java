package com.inclass;

public class DoublyLinkedList {

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
    public static class Node {
        int var;
        Node prev;
        Node next;

        public Node(int var) {
            this.var = var;
=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
>>>>>>> 26cb4d1de4c58af983f4c6b258cb129327a5f10c
>>>>>>> Stashed changes
        }
    }

    private Node head;
    private Node tail;
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
    private long size;

    public DoublyLinkedList() {
        size = 0;
=======
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
=======
>>>>>>> 26cb4d1de4c58af983f4c6b258cb129327a5f10c
>>>>>>> Stashed changes
    }

    public void display() {
        Node temp = head;
<<<<<<< Updated upstream
        while (temp != null) {
            System.out.print(temp.val + " -> ");
=======
<<<<<<< HEAD
        while(temp != null) {
            System.out.print(temp.var + " -> ");
=======
        while (temp != null) {
            System.out.print(temp.val + " -> ");
>>>>>>> 26cb4d1de4c58af983f4c6b258cb129327a5f10c
>>>>>>> Stashed changes
            temp = temp.next;
        }
        System.out.println("end");
    }
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

    public void displayReverse() {
        Node temp = tail;
        System.out.print("end");
        while (temp != null) {
            System.out.print(" -> " + temp.var);
            temp = temp.prev;
        }
        System.out.println();
    }

    public void insertFirst(int var) {
        Node node = new Node(var);
        size++;
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
        size++;
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
        size++;
    }

    public int deleteFirst() {
        int var = head.var;
        head.next.prev = null;
        head = head.next;
        size--;
        return var;
    }

    public int deleteLast() {
        int var = tail.var;
        tail.prev.next = null;
        tail = tail.prev;
        size--;
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

        int var = temp.next.var;
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
=======
>>>>>>> 26cb4d1de4c58af983f4c6b258cb129327a5f10c
>>>>>>> Stashed changes
}
