package com.inclass;

public class DoublyCircularLinkedLIst {

    private static class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        public ListNode (int val) {
            this.val = val;
        }

        public ListNode (int val, ListNode next, ListNode prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    private ListNode head;

    public DoublyCircularLinkedLIst() {
        head = null;
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        ListNode temp = head;
        do {
            b.append(temp.val).append(" -> ");
            temp = temp.next;
        } while (temp != head);
        return b.append("null").toString();
    }


    public static void main(String[] args) {

    }
}
