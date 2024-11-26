package com.koyi;

/**
 * 链栈
 */
public class LinkedListStack {

    public void push(int value){
        Node node = new Node(value,null);
        node.next = head;
        head = node;
    }

    public int pop(){
        if (head == null) return -1;

        int value = head.data;
        head = head.next;
        return value;
    }

    public int peek(){
        if (head == null) return -1;
        return head.data;
    }


    public class Node{

        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    private Node head = null;


}
