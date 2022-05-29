package com.inclass;

public class Main {
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
}
