package com.koyi;

public class BinaryTree {
    public class Node {
        public int data;
        public Node left;
        public Node right;
    }
    private Node root;

    /**
     * 前序遍历
     * @param root
     */
    public void preOrder(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 中序遍历
     * @param root
     */
    public void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    /**
     * 后序遍历
     * @param root
     */
    public void postOrder(Node root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }
}
