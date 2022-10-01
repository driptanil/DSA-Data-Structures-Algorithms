package com.inclass;

public class CircularLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    ListNode head;
    private long size;

    public CircularLinkedList() {
        this.size = 0;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "null";
        }
        StringBuilder b = new StringBuilder();
        ListNode temp = head;
        do {
            b.append(temp.val).append(" -> ");
            temp = temp.next;
        } while (temp != head);
        return b.append("null").toString();
    }

    public void insertFirst(int var) {
        ListNode listNode = new ListNode(var);
        size++;
        if (head == null) {
            head = listNode;
            listNode.next = head;
            return;
        }

        listNode.next = head;

        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = listNode;
        head = listNode;
    }

    public void insertLast(int var) {
        if (head == null) {
            insertFirst(var);
            return;
        }

        size++;
        ListNode listNode = new ListNode(var);
        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = listNode;
        listNode.next = head;
    }

    public void insert(int index, int var) {
        if (index == 0) {
            insertFirst(var);
            return;
        }

        ListNode temp = head;
        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }
        if (temp.next == head) {
            insertLast(var);
            return;
        }

        ListNode listNode = new ListNode(var);
        listNode.next = temp.next;
        temp.next = listNode;
    }

    public int deleteFirst() throws Exception{
        if (head == null) {
            throw new Exception ("Empty Circular Linked List !!!");
        }
        int var = head.val;
        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        return var;
    }

    public int deleteLast() throws Exception{
        if (head == null) {
            throw new Exception ("Empty Circular Linked List !!!");
        }
        ListNode temp = head;
        ListNode temp2 = head;
        while (temp.next != head) {
            temp2 = temp;
            temp = temp.next;
        }
        int var = temp.val;
        temp2.next = head;
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
            temp = temp.next;
        }

        if (temp.next == head) {
            return deleteLast();
        }

        int var = temp.next.val;
        temp.next = temp.next.next;
        return var;
    }

    public static void main(String[] args) throws Exception{
        CircularLinkedList list = new CircularLinkedList();

        list.insertFirst(5);
        System.out.println(list);

        list.insertLast(7);
        System.out.println(list);

        list.insertFirst(1);
        System.out.println(list);

        list.insertLast(9);
        System.out.println(list);

        list.insert(1, 3);
        System.out.println(list);

        System.out.println(list.deleteFirst());
        System.out.println(list);

        System.out.println(list.deleteLast());
        System.out.println(list);

        System.out.println(list.delete(1));
        System.out.println(list);
    }

}
