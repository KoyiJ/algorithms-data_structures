package com.koyi;

/**
 * 具有头尾指针的单链表，尾插法实现的时间复杂度降至O(1)
 */
public class LinkedList2 {

    public class Node {

        public int data;
        public Node next;

        public Node(int data,Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * 指向头结点，用于拎起整个链表
     */
    private Node head = null;

    private Node tail = null;

    public void insertAtTail(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }
}
