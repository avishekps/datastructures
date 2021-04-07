package com.ds.heap;

import java.util.Arrays;

public class MinHeap {

    private int size;

    private final int capacity;

    private int[] arr;

    public MinHeap(final int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public void insert(final int num) throws HeapOverflowException {
        if (size == capacity) {
            throw new HeapOverflowException("Heap size is equal to capacity, please delete before inserting.");
        }
        this.arr[size] = num;
        size++;
        heapifyBottomToTop(size-1);
    }

    private void heapifyBottomToTop(int index) {
        int parent = (index-1)/2;
        if (parent >=0 && arr[parent] > arr[index]) {
            swap(parent, index);
            heapifyBottomToTop(parent);
        }
    }

    private void heapifyTopToBottom(int index) {
        int lChldIdx = (2*index)+1;
        int rChldIdx = (2*index)+2;
        int smallIdx = index;
        if (lChldIdx < size && arr[lChldIdx] < arr[index] && arr[lChldIdx] < arr[rChldIdx]) {
            smallIdx = lChldIdx;
        }
        if (rChldIdx < size && arr[rChldIdx] < arr[index] && arr[rChldIdx] < arr[lChldIdx]) {
            smallIdx = rChldIdx;
        }
        if (smallIdx != index) {
            swap(smallIdx, index);
            heapifyTopToBottom(smallIdx);
        }
    }

    private void swap(final int index1, final int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public int getMin() {
        return arr[0];
    }

    public int deleteMin() {
        int min = arr[0];
        swap(0, size-1);
        size--;
        heapifyTopToBottom(0);
        printHeap();
        return min;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int[] getArr() {
        return Arrays.copyOf(arr, arr.length);
    }

    public void printHeap() {
        for (int i=0;i<size;i++) {
            System.out.println("Index: " + i + " value: " + arr[i]);
        }
    }
}
