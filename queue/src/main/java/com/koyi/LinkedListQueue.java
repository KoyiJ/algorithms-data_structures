package com.koyi;

/**
 * @auther jiangtianhe
 * @date 2024/11/27
 */
public class LinkedListQueue {

    private Node head = null;
    private Node tail = null;

    public void enqueue(String item) {
        Node node = new Node(item, null);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    public String dequeue() {
        if (head == null){
            return null;
        }
        String data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }


    private class Node {
        public String data;
        public Node next;

        public Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
