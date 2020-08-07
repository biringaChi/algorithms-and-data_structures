package com.algorithms.sorting;

public class MergeSort {
    public static void mergeSort(int[] nums, int low, int high) {
        if(low < high) {
            int mid = ((low + high) / 2);
            mergeSort(nums, low, mid);
            mergeSort(nums, mid + 1, high);
            merge(nums, low, mid, high);
        }
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int i = low;
        int k = low;
        int j = mid + 1;
        int[] merged = new int[nums.length];
        while(i <= mid && j <= high) {
            if(nums[i] < nums[j]) {
                merged[k] = nums[i];
                i++;
            } else {
                merged[k] = nums[j];
                j++;
            }
            k++;
        }
        // Edge case 1
        if(i > mid) {
            while(j <= high) {
                merged[k] = nums[j];
                j++;
                k++;
            }
        }
        // Edge case 2
        else {
            while(i <= mid) {
                merged[k] = nums[i];
                i++;
                k++;
            }
        }
        for(k = low; k <= high; k++) {
            nums[k] = merged[k];
        }

    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 8, 6, 25};
        int low = 0;
        int high = nums.length - 1;
        mergeSort(nums, low, high);
        System.out.println("Sorted Array: " + java.util.Arrays.toString(nums));
    }
}

// Time Complexity = O(nlogn)