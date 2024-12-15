package com.koyi;

public class Heap {
    private int[] a; // 数组，从下标1开始存储数据
    private int n; // 堆可以存储的最大数据个数
    private int count; // 堆中已经存储的元素个数

    public Heap(int capacity) {
        a = new int[capacity + 1];
        this.n = capacity;
        count = 0;
    }

    public void insert(int value) {
        if (count >= n) return; // 堆已满
        ++count;
        a[count] = value;
        int i = count;
        while (i / 2 > 0 && a[i] > a[i / 2]) {  // 自下往上堆化
            swap(a, i, i / 2);
            i = i / 2;
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public int top() {
        if (count == 0) return Integer.MIN_VALUE;
        return a[1];
    }

    public void remove() {
        if (count == 0) return;
        a[1] = a[count];
        count--;
        heapify(a, count, 1);
    }

    private void heapify(int[] a, int n, int i) {   // 自上往下堆化
        while (true) {
            int maxPos = i;
            if (i * 2 <= n && a[i] < a[i * 2]) {
                maxPos = i * 2;
            }
            if (i * 2 + 1 <= n && a[maxPos] < a[i * 2 + 1]) {
                maxPos = i * 2 + 1;
            }
            if (maxPos == i) break;
            swap(a, maxPos, i);
            i = maxPos;
        }
    }
}
