package com.test;

public class HeapSort {

    public static void main(String[] args) {
    int[] arr = { 50, 10, 90, 30, 70, 40, 80, 60, 20 };
    System.out.println("排序之前：");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }

    // 堆排序
    buildHeap(arr);
    heapSort1(arr);
    
    System.out.println();
    System.out.println("排序之后：");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

static void heapSort1(int[] tree) {
        for (int i = tree.length - 1; i >= 0; i--) {
            swap(tree, i, 0);
            heapify(tree, i, 0);
        }
    }

    static void buildHeap(int[] tree) {
        int lastParent = (tree.length-2) / 2;
        for (int i = lastParent; i >= 0; i--) {
            heapify(tree, tree.length, i);
        }
    }

    static void heapify(int[] tree, int n, int i) {
        // recursive exit
        if (i >= n) return;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int max = i;
        if (left < n && tree[left] > tree[max]) {
            max = left;
        }
        if (right < n && tree[right] > tree[max]) {
            max = right;
        }
        if (max != i) {
            swap(tree, max, i);
            heapify(tree, n, max);
        }
    }
    // 交换元素位置
    private static void swap(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
    }
}
