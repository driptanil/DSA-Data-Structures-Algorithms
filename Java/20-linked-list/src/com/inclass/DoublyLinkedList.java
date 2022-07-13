package com.inclass;

public class DoublyLinkedList {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    private ListNode head;
    private ListNode tail;

    public DoublyLinkedList() {
        head = null;
        tail = null;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "null";
        }
        StringBuilder b = new StringBuilder();
        ListNode temp = head;
        while (temp != null) {
            b.append(temp.val).append(" -> ");
            temp = temp.next;
        }
        return b.append("null").toString();
    }

    public void displayReverse() {
        ListNode temp = tail;
        System.out.print("end");
        while (temp != null) {
            System.out.print(" -> " + temp.val);
            temp = temp.prev;
        }
        System.out.println();
    }

    public void insertFirst(int var) {
        ListNode listNode = new ListNode(var);
        listNode.prev = null;
        if (head == null) {
            listNode.next = null;
            head = tail = listNode;
            return;
        }
        listNode.next = head;
        head.prev = listNode;
        head = listNode;
    }

    public void insertLast(int var) {
        ListNode listNode = new ListNode(var);
        listNode.next = null;
        if (tail == null) {
            listNode.prev = null;
            head = tail = listNode;
            return;
        }
        listNode.prev = tail;
        tail.next = listNode;
        tail = listNode;
    }

    public void insert(int index, int var) {
        ListNode listNode = new ListNode(var);
        if (head == null || index == 0) {
            insertFirst(var);
            return;
        }
        ListNode temp = head;
        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp == tail) {
            insertLast(var);
            return;
        }
        temp.next = listNode;
        listNode.prev = temp;
        listNode.next = temp.next;
        temp.next.prev = listNode;
    }

    public int deleteFirst() throws Exception{
        if (head == null) {
            throw new Exception("Empty double linked list !!!");
        }
        int var = head.val;
        head.next.prev = null;
        head = head.next;
        return var;
    }

    public int deleteLast() throws Exception{
        if (head == null) {
            throw new Exception("Empty double linked list !!!");
        }
        int var = tail.val;
        tail.prev.next = null;
        tail = tail.prev;
        return var;
    }

    public int delete(int index) throws Exception{
        if (head == null) {
            throw new Exception ("Empty Circular Linked List !!!");
        }
        if (index == 0) {
            return deleteFirst();
        }
        ListNode temp = head;
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

    public static void main (String[] args) throws Exception{
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertFirst(3);
        System.out.println(list);
        list.displayReverse();
        System.out.println();

        list.insertFirst(1);
        System.out.println(list);
        list.displayReverse();
        System.out.println();

        list.insertLast(5);
        System.out.println(list);
        list.displayReverse();
        System.out.println();

        list.insert(0, 7);
        System.out.println(list);
        list.displayReverse();
        System.out.println();

        list.deleteFirst();
        System.out.println(list);
        list.displayReverse();
        System.out.println();

        list.deleteLast();
        System.out.println(list);
        list.displayReverse();
        System.out.println();

        list.insertLast(7);
        System.out.println(list);
        list.displayReverse();
        System.out.println();


        list.delete(2);
        System.out.println(list);
        list.displayReverse();
        System.out.println();

    }
}
