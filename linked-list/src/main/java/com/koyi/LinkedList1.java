package com.koyi;

/**
 * 仅有头指针的单链表
 */
public class LinkedList1 {

    public class Node {

        public int data;
        public Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /**
     * 指向头结点，用于拎起整个链表
     */
    private Node head = null;

    /**
     * 遍历
     */
    public void travel() {
        Node p = head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }
    }

    /**
     * 查找
     *
     * @return
     */
    public Node find(int value) {
        Node p = head;
        while (p != null) {
            if (p.data == value) {
                return p;
            }
            p = p.next;
        }
        return null;
    }

    /**
     * 链表头部插入
     *
     * @param value
     */
    public void insertAtHead(int value) {
        Node newNode = new Node(value, null);
        newNode.next = head;
        head = newNode;
    }

    /**
     * 链表尾部插入
     *
     * @param value
     */
    public void insertAtTail(int value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
        } else {
            Node p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }
    }

    /**
     * 在给定结果之后插入
     * @param p
     * @param value
     */
    public void insertAfter(Node p, int value) {
        if (p == null) {
            return;
        }
        Node newNode = new Node(value, null);
        newNode.next = p.next;
        p.next = newNode;
    }

    /**
     * 删除给定节点之后的节点
     *
     * @param p
     */
    public void deleteNextNode(Node p) {
        if (p == null || p.next == null) {
            return;
        }
        p.next = p.next.next;
    }

    /**
     * 删除给定节点
     * @param p
     * @return
     */
    public Node deleteThisNode(Node p) {

    }
}
