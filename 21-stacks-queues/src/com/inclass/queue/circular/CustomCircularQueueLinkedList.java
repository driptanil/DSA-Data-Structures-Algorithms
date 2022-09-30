package com.inclass.queue.circular;

import com.inclass.ListNode;

public class CustomCircularQueueLinkedList<T> {

    ListNode head;

    public void add(T val) {
        if (head == null) {
            head = new ListNode(val);
            head.next = head;
            return;
        }
        ListNode temp = head.next;
        head .next= new ListNode(val);
        head.next.next = temp;
        head = head.next;
    }

    public Object remove() throws Exception {
        if (head == null) {
            throw new Exception("Empty Circular Queue Linked List !!!");
        }
        Object val = head.next.val;
        head.next = head.next.next;
        return val;
    }

    public Object peek() throws Exception {
        if (head == null) {
            throw new Exception("Empty Circular Queue Linked List !!!");
        }
        return head.next.val;
    }

    @Override
    public String toString() {
        if (head == null) {
            return "null";
        }
        StringBuilder b = new StringBuilder();
        b.append(" =|> ").append(head.next.val).append(" -> ");
        ListNode temp = head.next.next;
        while (temp != head) {
            b.append(temp.val).append(" -> ");
            temp = temp.next;
        }
        b.append(temp.val).append(" =|> ");
        return b.toString();
    }

    public static void main(String[] args) throws Exception {
        CustomCircularQueueLinkedList<Integer> list = new CustomCircularQueueLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        System.out.println(list.remove());

        System.out.println(list.peek());

        System.out.println(list);
    }
}
