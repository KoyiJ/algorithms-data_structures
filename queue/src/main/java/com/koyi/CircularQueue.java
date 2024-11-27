package com.koyi;

/**
 * @auther jiangtianhe
 * @date 2024/11/27
 */
public class CircularQueue {

    private String[] items;
    private int n;
    private int head;  // 指向队首元素
    private int tail;  // 指向队尾元素的下一个位置

    public CircularQueue(int n) {
        this.items = new String[n];
        this.n = n;
    }

    public boolean enqueue(String item) {
        if ((tail + 1) % n == head) return false; // 队列已满，留一个位置不存，视为满了，不然若是真的存满，head就会=tail，就无法区分是空还是满  （增加一个count变量记录队列元素个数判断依然可行，并且可以存满）
        items[tail] = item;
        tail = (tail + 1) % n;
        return true;
    }

    public String dequeue() {
        if (head == tail) return null; // 队列为空
        String ret = items[head];
        head = (head + 1) % n;
        return ret;
    }
}
