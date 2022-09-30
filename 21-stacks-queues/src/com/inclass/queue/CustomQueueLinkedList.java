package com.inclass.queue;

import com.inclass.ListNode;

public class CustomQueueLinkedList<T> {

    ListNode head;

    public void add(T val) {
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

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Object remove() throws Exception {
        if (head == null)
            throw new Exception ("Queue Empty !!!");
        ListNode temp = head.next;
        Object val = head.val;
        head.next = null;
        head = temp;
        return val;
    }

    public static void main (String[] args) throws Exception {
        CustomQueueLinkedList<String> list = new CustomQueueLinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.display();

        System.out.println(list.remove());
        list.display();
    }
}
