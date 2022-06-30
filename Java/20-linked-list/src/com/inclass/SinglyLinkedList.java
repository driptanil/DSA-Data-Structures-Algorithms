package com.inclass;

public class SinglyLinkedList {

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
    public static class ListNode {
        int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {
            this.val = 0;
        }
    }

    public static ListNode head;
    public ListNode tail;

    public SinglyLinkedList() {
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
=======
>>>>>>> Stashed changes
    public static void main (String[] args) {
        /*LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);*/

        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(10);
        list.display();

        list.insertLast(1);
        list.display();

        list.insert(3, 0);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();

        list.delete(2);
        list.display();

        System.out.println(list.get(2));
    }

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
<<<<<<< Updated upstream
=======
>>>>>>> 26cb4d1de4c58af983f4c6b258cb129327a5f10c
>>>>>>> Stashed changes
            temp = temp.next;
        }
        System.out.println("end");
    }
<<<<<<< Updated upstream
=======
<<<<<<< HEAD

    public void insertFirst(int var) {
        ListNode listNode = new ListNode(var);
        if (head == null) {
            tail = head = listNode;
            listNode.next = null;
            return;
        }

        listNode.next = head;
        head = listNode;
    }

    public void insertLast(int var) {
        ListNode listNode = new ListNode(var);
        if (head == null) {
            tail = head = listNode;
            listNode.next = null;
            return;
        }

        tail.next = listNode;
        listNode.next = null;
        tail = listNode;
    }

    public void insert(int index, int var) {
        if (head == null) {
            insertLast(var);
            return;
        }

        ListNode listNode = new ListNode(var);

        int count = 0;
        ListNode temp = head;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }

        if (temp == tail) {
            insertLast(var);
            return;
        }
        listNode.next = temp.next;
        temp.next = listNode;
    }

    public int deleteLast() {
        ListNode temp = head;
        ListNode temp2 = head;
        while (temp != tail) {
            temp2 = temp;
            temp = temp.next;
        }
        temp2.next = null;
        tail = temp2;
        return temp.val;
    }

    public int deleteFirst() {
        int var = head.val;
        head = head.next;
        return var;
    }

    public int delete(int index) {
        ListNode temp = head;
        int count = 0;
        while (count < index - 2) {
            temp = temp.next;
            count++;
        }

        int var = temp.next.val;
        temp.next = temp.next.next;
        return var;
    }

    /**
     * <b><p>83. Remove Duplicates from Sorted List</p></b>
     * https://leetcode.com/problems/remove-duplicates-from-sorted-list
     *
     * <p>Runtime: 1 ms, faster than 65.15% of Java online submissions for Remove Duplicates from Sorted List.</p>
     * Memory Usage: 45 MB, less than 5.96% of Java online submissions for Remove Duplicates from Sorted List.
     * @param listNode
     * @return
     */
    public ListNode deleteDuplicates(ListNode listNode) {
        if (listNode == null)
            return listNode;
        ListNode temp = listNode;
        while (listNode.next != null) {
            if (listNode.val == listNode.next.val)
                listNode.next = listNode.next.next;
            else
                listNode = listNode.next;
        }
        return temp;
    }

    /**
     * <b><p>1290. Convert Binary Number in a Linked List to Integer</p></b>
     * https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/
     * <p>Runtime: 1 ms, faster than 34.22% of Java online submissions for Convert Binary Number in a Linked List to Integer.</p>
     * Memory Usage: 41 MB, less than 70.78% of Java online submissions for Convert Binary Number in a Linked List to Integer.
     *
     * @param
     * @return
     */
    public int getDecimalValue() {
        int val = head.val;
        while (head.next != null) {
            head = head.next;
            val = val << 1;
            val += head.val;
        }
        return val;
    }

    /**
     * <p><b>21. Merge Two Sorted Lists</b></p>
     * https://leetcode.com/problems/merge-two-sorted-lists/submissions/
     * <p>Runtime: 1 ms, faster than 66.92% of Java online submissions for Merge Two Sorted Lists.</p>
     * <p>Memory Usage: 42.5 MB, less than 69.11% of Java online submissions for Merge Two Sorted Lists.</p>
     * @param listNode1
     * @param listNode2
     * @return
     */
    public ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        ListNode head = new ListNode();
        ListNode temp = head;


        while (listNode1 != null && listNode2 != null) {
            if (listNode1.val <= listNode2.val) {
                temp.next = listNode1;
                listNode1 = listNode1.next;
            } else {
                temp.next = listNode2;
                listNode2 = listNode2.next;
            }
            temp = temp.next;
        }

        if (listNode1 != null) {
            temp.next = listNode1;
        }

        if (listNode2 != null) {
            temp.next = listNode2;
        }
        return head.next;
    }

    /**
     * <p><b>206. Reverse Linked List</b></p>
     * <p>https://leetcode.com/problems/reverse-linked-list/</p>
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.</p>
     * Memory Usage: 42.8 MB, less than 60.13% of Java online submissions for Reverse Linked List.
     */
    public ListNode reverse(ListNode head) {
        if (head == null)
            return head;
        ListNode prev = head;
        ListNode temp = head.next;
        while (temp != null) {
            ListNode store = temp.next;
            temp.next = prev;
            prev = temp;
            temp = store;
        }
        head.next = null;
        return prev;
    }

    /**
     * <p><b>206. Reverse Linked List</b></p>
     * <p>https://leetcode.com/problems/reverse-linked-list/</p>
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.</p>
     * Memory Usage: 42.8 MB, less than 60.13% of Java online submissions for Reverse Linked List.
     * @param prev
     * @param temp
     */
    public void reverseRec(ListNode prev, ListNode temp) {
        if (temp == null) {
            head.next = null;
            head = prev;
            return;
        }

        ListNode store = temp.next;
        temp.next = prev;
        reverseRec(temp, store);
    }

    /**
     * <p><b>92. Reverse Linked List II</b></p>
     * https://leetcode.com/problems/reverse-linked-list-ii/
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List II.</p>
     * Memory Usage: 42.2 MB, less than 18.11% of Java online submissions for Reverse Linked List II.
     * @param left
     * @param right
     */
    public void reverseII(int left, int right) {
        if (left == right) {
            return;
        }
        int count = 0;
        ListNode lead = new ListNode();
        lead.next = head;
        head = lead;
        ListNode end = head;

        while (count < left) {
            end = end.next;
            count++;
        }
        ListNode start = end;

        while (count <= right) {
            end = end.next;
            count++;
        }
        ListNode prev = start.next;
        ListNode temp = start.next.next;
        ListNode store;
        while (prev != end) {
            store = temp.next;
            temp.next = prev;
            prev = temp;
            temp = store;
        }
        start.next.next = temp;
        start.next = prev;
        head = head.next;
    }

    /**
     * <p><b>141. Linked List Cycle</b></p>
     * https://leetcode.com/problems/linked-list-cycle/submissions/
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.</p>
     * <p>Memory Usage: 45.7 MB, less than 57.29% of Java online submissions for Linked List Cycle.</p>
     * @param
     * @return
     */
    public boolean hasCycle() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * return the length of cycle in a linked list
     * @return
     */
    public int cycleSize() {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int len = 0;
                do {
                    slow = slow.next;
                    len++;
                } while (slow == fast);
                return len;
            }

        }

        return 0;
    }

    /**
     * <p><b>142. Linked List Cycle II</b></p>
     * https://leetcode.com/problems/linked-list-cycle-ii/submissions/
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle II.</p>
     * Memory Usage: 42.7 MB, less than 87.40% of Java online submissions for Linked List Cycle II.
     * @return
     */
    public ListNode detectCycle() {
        ListNode slow = head, fast = head;
        int length = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                do {
                    slow = slow.next;
                    length++;
                }
                while (slow != fast);
                break;
            }
        }

        if (length == 0)
            return null;

        slow = fast = head;
        while (length > 0) {
            slow = slow.next;
            length--;
        }

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    /**
     * <p><b>876. Middle of the Linked List</b></p>
     * https://leetcode.com/problems/middle-of-the-linked-list/
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.</p>
     * Memory Usage: 41.4 MB, less than 54.45% of Java online submissions for Middle of the Linked List.
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head;
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next.next;
            temp2 = temp2.next;
        }
        return temp2;
    }

    /**
     * <p><b>148. Sort List</b></p>
     * <p>https://leetcode.com/problems/sort-list/</p>
     * <p>Runtime: 12 ms, faster than 82.08% of Java online submissions for Sort List.</p>
     * Memory Usage: 50.4 MB, less than 90.78% of Java online submissions for Sort List.
     * @param head
     * @return
     */
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode temp = mid.next;
        mid.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(temp);

        return mergeTwoLists(left, right);
    }

    public void swap(int index) {

        if (index == 0) {
            ListNode temp = head.next;
            head.next = head.next.next;
            temp.next = head;
            head = temp;
            return;
        }

        ListNode temp = head;

        int count = 0;
        while (count < index - 1) {
            temp = temp.next;
            count++;
        }

        ListNode temp2 = temp.next.next;
        temp.next.next = temp.next.next.next;
        temp2.next = temp.next;
        temp.next = temp2;
    }

    // Time limit exceeded sort list in leetcode
    public void bubbleSort() {
        ListNode start = new ListNode(0);
        if (head == null || head.next == null)
            return;
        start.next = head;
        head = start;
        ListNode temp2 = null;
        do {
            ListNode temp = head;
            while (temp.next.next != temp2) {
                if (temp.next.val > temp.next.next.val) {
                    ListNode store = temp.next.next;
                    temp.next.next = temp.next.next.next;
                    store.next = temp.next;
                    temp.next = store;
                }
                temp = temp.next;
            }
            temp2 = temp.next;
        }
        while (head.next.next != temp2);
        head = head.next;
    }

    /*does not work for long linked lists*/
    public boolean isPalindrome() {
        long n = toInteger();
        long temp = n;
        long rev = 0;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if (n == rev)
            return true;
        return false;
    }

    /* converts linked list to integer */
    public long toInteger() {
        ListNode temp = head;
        long n = 0;
        while (temp != null) {
            n = n * 10 + temp.val;
            temp = temp.next;
        }
        return n;
    }

    /*does not work for very long linked lists*/
    public boolean isPalindromeII() {
        int count = 0;
        int size = size(head);
        ListNode temp = head;
        while (count <= size / 2) {
            if (temp.val != getVal(size - count)) {
                return false;
            }
            temp = temp.next;
            count++;
        }
        return true;
    }

    public int size(ListNode head) {
        int len = 0;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
            len++;
        }
        return len;
    }

    public int getVal(int i) {
        ListNode temp = head;
        int count = 0;
        while (count < i) {
            temp = temp.next;
            count++;
        }
        return temp.val;
    }


    /**
     * <p><b>234. Palindrome Linked List</b></p>
     * https://leetcode.com/problems/palindrome-linked-list/
     * <p>Runtime: 6 ms, faster than 74.49% of Java online submissions for Palindrome Linked List.</p>
     * Memory Usage: 103.7 MB, less than 30.79% of Java online submissions for Palindrome Linked List.
     * @return
     */
    public boolean isPalindromeIII() {
        if (head == null || head.next == null)
            return true;
        ListNode temp = head;
        ListNode temp2 = head;
        while (temp2.next.next != null && temp2.next.next.next != null) {
            temp = temp.next;
            temp2 = temp2.next.next;
        }
        ListNode prev = temp.next;
        ListNode mid = temp.next.next;
        ListNode next;
        while (mid != null) {
            next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        temp.next.next = null;
        temp.next = prev;

        ListNode half = prev;
        while (head != half) {
            if (head.val != prev.val)
                return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }

    /**
     * <p><b>143. Reorder List</b></p>
     * https://leetcode.com/problems/reorder-list/
     * <p>Runtime: 1070 ms, faster than 5.01% of Java online submissions for Reorder List.</p>
     * Memory Usage: 45.2 MB, less than 87.45% of Java online submissions for Reorder List.
     */
    public void reOrder() {
        ListNode temp = head;
        while (temp.next.next != null) {
            ListNode prev = temp.next;
            ListNode mid = prev.next;
            ListNode next;
            while (mid != null) {
                next = mid.next;
                mid.next = prev;
                prev = mid;
                mid = next;
            }
            temp.next.next = null;
            temp.next = prev;
            temp = temp.next;
        }
    }

    /**
     * <p><b>143. Reorder List</b></p>
     * https://leetcode.com/problems/reorder-list/
     * <p>Runtime: 1389 ms, faster than 5.01% of Java online submissions for Reorder List.</p>
     * Memory Usage: 45.1 MB, less than 87.45% of Java online submissions for Reorder List.
     */
    public void reOrderII() {
        ListNode start = head;
        long size = size(head);
        ListNode end = getNode(size - 1);
        while (start != end && start.next.next != null) {
            ListNode temp2 = start.next;
            start.next = end.next;
            ListNode temp = end.next.next;
            end.next.next = temp2;
            end.next = temp;
            start = start.next.next;
            end = getNode(size - 1);
        }
    }

    public ListNode getNode(long i) {
        ListNode temp = head;
        long count = 0;
        while (count < i) {
            temp = temp.next;
            count++;
        }
        return temp;
    }

    /**
     * <p><b>143. Reorder List</b></p>
     *https://leetcode.com/problems/reorder-list/
     * <p>Runtime: 2 ms, faster than 71.78% of Java online submissions for Reorder List.</p>
     * Memory Usage: 54.5 MB, less than 28.79% of Java online submissions for Reorder List.
     */
    public void reOrderIII() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode mid = middleNode(head);
        ListNode midStart = reverse(mid);
        ListNode start = head;

        while (midStart != null && start != null) {
            ListNode temp = start.next;
            start.next = midStart;
            start = temp;

            temp = midStart.next;
            midStart.next = start;
            midStart = temp;
        }

        if (start != null) {
            start.next = null;
        }
    }

    /**
     * <p><b>25. Reverse Nodes in k-Group</b></p>
     * https://leetcode.com/problems/reverse-nodes-in-k-group/
     * <p>Runtime: 1 ms, faster than 58.81% of Java online submissions for Reverse Nodes in k-Group.</p>
     * Memory Usage: 45.3 MB, less than 70.51% of Java online submissions for Reverse Nodes in k-Group.
     * @param head
     * @param k
     * @return
     */

    public ListNode reverseKGroup(ListNode head, int k) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode node = new ListNode();
        node.next = head;
        head = node;

        int count = 1;
        ListNode prev = head.next;
        ListNode mid = head.next.next;
        ListNode temp = head;

        while (mid != null) {
            ListNode next = mid.next;
            mid.next = prev;
            count++;
            prev = mid;
            mid = next;

            if (count == k) {
                ListNode store = temp.next;
                temp.next = prev;
                store.next = mid;
                temp = store;
                prev = temp.next;
                if (temp.next == null) {
                    return head.next;
                }
                mid = temp.next.next;
                count = 1;
            }
        }
        while (temp.next != prev) {
            ListNode store = prev.next;
            prev.next = mid;
            mid = prev;
            prev = store;
        }

        return head.next;
    }

    /**
     * <p><b>61. Rotate List</b></p>
     * https://leetcode.com/problems/rotate-list/
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate List.</p>
     * Memory Usage: 41.8 MB, less than 87.88% of Java online submissions for Rotate List.
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = size(head) + 1;
        k = len - (k % -len);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        while (k > 1) {
            k--;
            head = head.next;
        }
        temp = head.next;
        head.next = null;
        head = temp;
        return head;
    }
    public void insertRec (int index, int var, ListNode temp) {
        ListNode listNode = new ListNode(var);
        if (index == 0) {
            listNode.next = head;
            head = listNode;
            return;
        }
        if (index <= 1) {
            listNode.next = temp.next;
            temp.next = listNode;
            return;
        }
        ListNode temp2 = temp.next;
        insertRec(index - 1, var, temp2);
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(5);
        list.display();

        list.insertLast(7);
        list.display();

        list.insertLast(9);
        list.display();

        list.insertFirst(3);
        list.display();

        list.insert(3, 8);
        list.display();

        /*System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.delete(2));
        list.display();*/

        list.insertRec(2, 6, head);
        list.display();

        list.swap(1);
        list.display();

        list.mergeSort(head);
        list.display();

        list.reverseRec(head, head.next);
        list.display();

        list.reverseII(0, 3);
        list.display();

        list.reOrder();
        list.display();

        long size = list.size(head);
        System.out.println(size);
        System.out.println(list.getNode(size - 1).val);

        list.reOrderIII();
        list.display();

        head = list.rotateRight(head, 2);
        list.display();
    }
=======
>>>>>>> 26cb4d1de4c58af983f4c6b258cb129327a5f10c
>>>>>>> Stashed changes
}
