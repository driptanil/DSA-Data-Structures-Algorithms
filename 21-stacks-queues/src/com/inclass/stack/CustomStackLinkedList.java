package com.inclass.stack;

import com.inclass.ListNode;

public class CustomStackLinkedList<T> {

    public ListNode head;

    public CustomStackLinkedList() {
        this.head = null;
    }

    public void push(T val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            head.next = null;
            return;
        }
        node.next = head;
        head = node;
    }

    public Object pop() throws Exception{
        if (head == null) {
            throw new Exception("Stack Empty !!!");
        }
        ListNode temp = head.next;
        Object val = head.val;
        head.next = null;
        head = temp;
        return val;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void pushBottom(T val) {
        ListNode node = new ListNode(val);
        if (head == null) {
            head = node;
            return;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void reverse() {
        ListNode prev = null;
        ListNode mid = head;
        while (mid != null) {
            ListNode next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        head = prev;
    }


    public static void main(String[] args) throws Exception {
        CustomStackLinkedList<String> list = new CustomStackLinkedList<>();

//        list.pop();

        list.push("One");
        list.display();

        list.push("Two");
        list.push("Three");
        list.display();

        System.out.println(list.pop());
        list.display();

        list.pushBottom("Four");
        list.display();

        list.reverse();
        list.display();
    }
}
