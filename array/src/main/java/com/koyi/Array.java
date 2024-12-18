package com.koyi;

/**
 * 支持动态扩容的数组
 */
public class Array {

    public int[] data;

    /**
     * 数组初始容量
     */
    private int size = 10;

    /**
     * 数组中元素个数计数
     */
    private int count = 0;

    public Array() {
        this.data = new int[size];
    }

    public void add(int value) {
        if (count == size) {
            resize();
        }
        data[count] = value;
        count++;
    }

    public void resize() {
        int[] newData = new int[size * 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        size = size * 2;
    }

}
