package com.koyi;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[i]) {
                    flag = false;

                }
            }
        }
    }
}
