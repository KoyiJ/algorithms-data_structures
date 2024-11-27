package com.koyi;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @auther jiangtianhe
 * @date 2024/11/27
 */
public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1); // 入队
//        queue.add(1);  // 入队
        Integer value = queue.poll();  // 出队
//        Integer value = queue.remove();  // 出队
        queue.peek();   // 查看队首元素，不出队
    }
}
