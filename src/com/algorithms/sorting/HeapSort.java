package com.algorithms.sorting;

public class HeapSort {
    public static void swap(int[] nums, int largest, int i) {
        int temp = nums[i];
        nums[i] = nums[largest];
        nums[largest] = temp;
    }

    public static void maxHeapify(int[] nums, int n, int i) {
        int largest = i;
        int left = (2 * i);
        int right = (2 * i) + 1;
        if(left < n && nums[left] > nums[largest]) largest = left;
        if(right < n && nums[right] > nums[largest]) largest = right;
        if(largest != i) {
            swap(nums, largest, i);
            maxHeapify(nums, n, largest);
        }
    }

    public static void heapSort(int[] nums, int n) {
        // Build max heap
        for(int i = n / 2; i >= 0; i--) maxHeapify(nums, n, i);
        // Delete max heap
        for(int i = n - 1; i >= 0; i--) {
            swap(nums, i, 0);
            maxHeapify(nums, i, 0);
        }
    }

    public static void main(String[] args) {
        int[] nums = {9, 4, 7, 2, 6};
        heapSort(nums, nums.length);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(nums));
    }
}

/*
 Time Complexity for building a maxheap = O(n);
 Time Complexity of heapsort = O(nlogn)
*/
