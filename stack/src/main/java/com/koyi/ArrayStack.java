package com.koyi;

/**
 * 顺序栈
 */
public class ArrayStack {
    private int[] items;
    private int count;  // 栈中元素的个数
    private int n;   // 栈的大小

    public ArrayStack(int n) {
        this.items = new int[n];
        this.n = n;
        this.count = 0;
    }

    public boolean push(int item) {
        if (count == n) return false; // 栈已满

        items[count] = item;
        count++;
        return true;
    }

    public int pop() {
        if (count == 0) return -1;  // 栈为空
        int value = items[count - 1];
        count--;
        return value;
    }

    public int peek() {
        if (count == 0) return -1;
        return items[count - 1];
    }
}
