package com.inclass;

import java.util.Stack;

public class SinglyLinkedList {
    public static class ListNode {
        public int val;
        private ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode() {
            val = 0;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode head;

    public ListNode getNode(int index) {
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int get(int index) {
        ListNode listNode = getNode(index);
        return listNode.val;
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

    public void insertFirst(int var) {
        ListNode listNode = new ListNode(var);
        if (head == null) {
            head = listNode;
            listNode.next = null;
            return;
        }

        listNode.next = head;
        head = listNode;
    }

    public void insertLast(int var) {
        ListNode node = new ListNode(var);
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    public void insert(int index, int var) throws Exception{
        if (head == null) {
            insertLast(var);
            return;
        }

        ListNode listNode = new ListNode(var);

        int count = 0;
        ListNode temp = head;
        while (count < index - 1) {
            if (temp == null) {
                throw new Exception("index > size of Linked List !!!");
            }
            temp = temp.next;
            count++;
        }
        listNode.next = temp.next;
        temp.next = listNode;
    }

    public int deleteLast() throws Exception {
        if (head == null) {
            throw new Exception("Empty Linked List !!!");
        }
        ListNode temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = null;
        return val;
    }

    public int deleteFirst() throws Exception{
        if (head == null) {
            throw new Exception ("Empty Linked List !!!");
        }
        int var = head.val;
        head = head.next;
        return var;
    }

    public int delete(int index) throws Exception{
        if (head == null) {
            throw new Exception ("Empty Linked List !!!");
        }
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
     * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list"><h1>83. Remove Duplicates from Sorted List</h1></a>
     * <p>Runtime: 1 ms, faster than 65.15% of Java online submissions for Remove Duplicates from Sorted List.</p>
     * Memory Usage: 45 MB, less than 5.96% of Java online submissions for Remove Duplicates from Sorted List.
     * @param
     * @return
     */
    public ListNode deleteDuplicates() {
        if (head == null)
            return head;
        ListNode temp = head;
        while (head.next != null) {
            if (head.val == head.next.val)
                head.next = head.next.next;
            else
                head = head.next;
        }
        return temp;
    }

    /**
     * <a href="https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/"><h1>1290. Convert Binary Number in a Linked List to Integer</h1></a>
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
     * <a href="https://leetcode.com/problems/merge-two-sorted-lists/submissions/"><h1>21. Merge Two Sorted Lists</h1></a>
     * <p>Runtime: 1 ms, faster than 66.92% of Java online submissions for Merge Two Sorted Lists.</p>
     * <p>Memory Usage: 42.5 MB, less than 69.11% of Java online submissions for Merge Two Sorted Lists.</p>
     * @param listNode1
     * @param listNode2
     * @return
     */
    public ListNode mergeTwoLists(ListNode listNode1, ListNode listNode2) {
        ListNode head = new ListNode(0);
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
     * <h1><a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a></h1>
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.</p>
     * Memory Usage: 42.8 MB, less than 60.13% of Java online submissions for Reverse Linked List.
     */
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode store = temp.next;
            temp.next = prev;
            prev = temp;
            temp = store;
        }

        return prev;
    }

    /**
     * <h1><a href="https://leetcode.com/problems/reverse-linked-list/">206. Reverse Linked List</a></h1>
     * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.</p>
     * Memory Usage: 42.8 MB, less than 60.13% of Java online submissions for Reverse Linked List.
     * @param head
     * @param prev
     */
    public ListNode reverseRec(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }
        ListNode store = head.next;
        head.next = prev;
        return reverseRec(store, head);
    }

    /**
     * <a href="https://leetcode.com/problems/reverse-linked-list-ii/"><h1>92. Reverse Linked List II</h1></a>
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
     * <a href="https://leetcode.com/problems/linked-list-cycle/submissions/"><h1>141. Linked List Cycle</h1></a>
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
     * <a href="https://leetcode.com/problems/linked-list-cycle-ii/"><h1>142. Linked List Cycle II</h1></a>
     *
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
     * <a href="https://leetcode.com/problems/middle-of-the-linked-list/"><h1>876. Middle of the Linked List</h1></a>
     *
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
     * <a href="https://leetcode.com/problems/sort-list/"><h1>148. Sort List</h1></a>
     *
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
     * <a href="https://leetcode.com/problems/palindrome-linked-list/"><h1>234. Palindrome Linked List</h1></a>
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
     * <a href="https://leetcode.com/problems/reorder-list/"><h1>143. Reorder List</h1></a>
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
     * <a href="https://leetcode.com/problems/reorder-list/"><h1>143. Reorder List</h1></a>
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
     * <a href="https://leetcode.com/problems/reorder-list/"><h1>143. Reorder List</h1></a>
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
     * <a href="https://leetcode.com/problems/reverse-nodes-in-k-group/"><h1>25. Reverse Nodes in k-Group</h1></a>
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
     * <a href="https://leetcode.com/problems/rotate-list/"><h1>61. Rotate List</h1></a>
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

    /**
     * <a href="https://leetcode.com/problems/add-two-numbers/"><h1>2. Add Two Numbers</h1></a>
     * <p>Runtime: 3 ms, faster than 76.78% of Java online submissions for Add Two Numbers.</p>
     * Memory Usage: 47.5 MB, less than 67.79% of Java online submissions for Add Two Numbers.
     *
     * @param head
     * @param head2
     */
    public void addTwoNumbers(ListNode head, ListNode head2) {
        ListNode temp = head;
        ListNode temp2 = head2;
        ListNode stop = head;
        int carry = 0;
        while (temp != null && temp2 != null) {
            int store = temp.val + temp2.val + carry;
            temp.val = store % 10;
            carry = store / 10;
            if (temp.next == null) {
                stop = temp;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        if (temp2 != null) {
            temp = stop;
            temp.next = temp2;
            temp = temp.next;
        }

        while (temp != null) {
            int store = temp.val + carry;
            temp.val = store % 10;
            carry = store / 10;
            if (temp.next == null) {
                stop = temp;
            }
            temp = temp.next;
        }

        if (carry != 0) {
            temp = stop;
            temp.next = new ListNode(carry);
            temp.next.next = null;
        }
    }


    /**
     * <a href="https://leetcode.com/problems/merge-k-sorted-lists/"><h1>23. Merge k Sorted Lists</h1></a>
     * <p>Runtime: 113 ms, faster than 20.02% of Java online submissions for Merge k Sorted Lists.</p>
     * Memory Usage: 44 MB, less than 95.08% of Java online submissions for Merge k Sorted Lists.
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }
        int i = 1;
        while (i < lists.length) {
            if (lists[i] != null) {
                lists[0] = mergeTwoLists(lists[0], lists[i]);
            }
            i++;
        }
        return lists[0];
    }

    /**
     * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list"><h1>19. Remove Nth Node From End of List</h1></a>
     *
     * <p>Runtime 0 ms Beats 100% </p>
     * Memory 43.7 MB Beats 5.50%
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode store = reverseRec(head, null);
        ListNode temp = store;
        while(n != 2) {
            if (temp == null) {
                store = store.next;
                return reverseRec(store, null);
            }
            n--;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return reverseRec(store, null);
    }


    /**
     * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list"><h1>19. Remove Nth Node From End of List</h1></a>
     * using Stack
     * <p>Runtime 1 ms Beats 19.61% </p>
     * Memory 41 MB Beats 15.99%
     */
    public ListNode removeNthFromEndStack(ListNode head, int n) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp);
            temp= temp.next;
        }

        while (n != 0) {
            n--;
            stack.pop();
        }
        if (stack.isEmpty()) {
            return head.next;
        }
        temp = stack.pop();
        temp.next = temp.next.next;
        return head;
    }

    /**
     * <a href="https://leetcode.com/problems/swap-nodes-in-pairs/"><h1>24. Swap Nodes in Pairs</h1></a>
     * Runtime 0 ms Beats 100%
     * Memory 40.4 MB Beats 19%
     * @param head
     * @return
     */

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode start = temp;

        while (head != null && head.next != null) {
            ListNode store = head.next.next;
            head.next.next = head;
            start.next = head.next;
            head.next = store;


            start = head;
            head = start.next;
        }

        return temp.next;
    }

    /**
     * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/"><h1>82. Remove Duplicates from Sorted List II</h1></a>
     * Runtime 0 ms Beats 100%
     * Memory 41.8 MB Beats 76.48%
     * @param head
     * @return
     */

    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode prev = temp;

        while (head != null && head.next != null) {

            if (head.val == head.next.val) {
                while (head != null && head.next != null) {
                    if (head.val != head.next.val) {
                        break;
                    }
                    head = head.next;
                }
                prev.next = head.next;
            } else {
                prev = head;
            }
            head = head.next;

        }
        return temp.next;
    }

    /**
     * <a href="https://leetcode.com/problems/partition-list/"><h1>86. Partition List</h1></a>
     *
     * <p>Runtime 0 ms Beats 100%</p>
     * Memory 42.5 MB Beats 11.48%
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        ListNode min = new ListNode(0);
        ListNode max = new ListNode(0);

        ListNode tempMin = min;
        ListNode tempMax = max;

        while (head != null) {
            ListNode next = head.next;
            head.next = null;
            if (head.val < x) {
                tempMin.next = head;
                tempMin = tempMin.next;
            } else {
                tempMax.next = head;
                tempMax = tempMax.next;
            }
            head = next;
        }

        tempMin.next = max.next;

        return min.next;
    }

    /**
     * <a href="https://leetcode.com/problems/remove-nodes-from-linked-list/"><h1>2487. Remove Nodes From Linked List</h1></a>
     *
     * <p>Runtime 6 ms Beats 95.19%</p>
     * Memory 68.2 MB Beats 34.47%
     * @param head
     * @return
     */

    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        ListNode temp = head;
        while (head.next != null) {
            if (head.val > head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return reverse(temp);
    }

    /**
     * <a href="https://leetcode.com/problems/odd-even-linked-list"><h1>328. Odd Even Linked List</h1></a>
     *
     * <p>Runtime 0 ms Beats 100%</p>
     * Memory 42 MB Beats 43.65%
     */

    public ListNode oddEvenList(ListNode head) {
        ListNode one = new ListNode(0);
        ListNode two = new ListNode(0);

        ListNode temp = one;
        ListNode temp2 = two;

        boolean bool = true;
        while(head != null) {
            if (bool) {
                temp.next = head;
                temp = temp.next;
            } else {
                temp2.next = head;
                temp2 = temp2.next;
            }
            head = head.next;
            bool = !bool;
        }

        temp.next = two.next;
        temp2.next = null;

        return one.next;
    }

    /**
     * <a href="https://leetcode.com/problems/add-two-numbers-ii"><h1>445. Add Two Numbers II</h1></a>
     *
     * <p>Runtime 2 ms Beats 100%</p>
     * Memory 43.3 MB Beats 16.2%
     * @param l1
     * @param l2
     * @return
     */

    public ListNode addTwoNumbersII(ListNode l1, ListNode l2) {
        ListNode one = reverse(l1);
        ListNode two = reverse(l2);

        ListNode head = new ListNode(0);
        ListNode temp = head;

        int carry = 0;
        while (one != null && two != null) {
            int val = carry + (one.val + two.val);
            carry = val / 10;
            temp.next = new ListNode(val % 10);
            temp = temp.next;
            one = one.next;
            two = two.next;
        }

        while (one != null) {
            int val = carry + (one.val);
            carry = val / 10;
            temp.next = new ListNode(val % 10);
            one = one.next;
            temp = temp.next;
        }

        while (two != null) {
            int val = carry + (two.val);
            carry = val / 10;
            temp.next = new ListNode(val % 10);
            two = two.next;
            temp = temp.next;
        }

        if (carry != 0) {
            temp.next = new ListNode(carry);
        }

        return reverse(head.next);
    }

    /**
     * <a href="https://leetcode.com/problems/add-two-numbers-ii"><h1>445. Add Two Numbers II</h1></a>
     *
     * <p>Runtime 32 ms Beats 5.81%</p>
     * Memory 42.6 MB Beats 34.70%
     * @param l1
     * @param l2
     * @return
     */

    public ListNode addTwoNumbersIIinplace(ListNode l1, ListNode l2) {
        ListNode one = reverse(l1);
        ListNode two = reverse(l2);

        ListNode head = one;
        ListNode prev = null;

        int carry = 0;
        while (one != null && two != null) {
            int val = carry + (one.val + two.val);
            carry = val / 10;
            one.val = val % 10;
            prev = one;
            System.out.println(one.val);
            one = one.next;
            two = two.next;
        }

        while (one != null) {
            int val = carry + (one.val);
            carry = val / 10;
            one.val = val % 10;
            System.out.println(one.val);
            prev = one;
            one = one.next;

        }

        while (two != null) {
            int val = carry + (two.val);
            carry = val / 10;
            if (one == null) {
                one = prev;
            }
            one.next = new ListNode(val % 10);
            one = one.next;
            two = two.next;
        }

        if (carry != 0) {
            if (one == null) {
                one = prev;
            }
            one.next = new ListNode(carry);
        }

        return reverse(head);
    }

    /**
     * <a href="https://leetcode.com/problems/swapping-nodes-in-a-linked-list/"><h1>1721. Swapping Nodes in a Linked List</h1></a>
     *
     * <p>Runtime 2 ms Beats 100%</p>
     * Memory 57 MB Beats 68.98%
     * @param head
     * @param k
     * @return
     */

    public ListNode swapNodes(ListNode head, int k) {

        ListNode slow  = head;
        ListNode fast = head;

        for (int i = 1; i < k; i++) {
            fast = fast.next;
        }
        ListNode temp = fast;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        int store = temp.val;
        temp.val = slow.val;
        slow.val = store;

        return head;

    }
    public static void main(String[] args) {

    }
}
