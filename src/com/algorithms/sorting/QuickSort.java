package com.algorithms.sorting;

public class QuickSort {
    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        int[] result = new int[nums.length];
        System.arraycopy(nums, 0, result, 0, nums.length);
        return result;
    }

    public static void quickSort(int[] nums, int lhs, int rhs) {
        if(lhs >= rhs) return;
        int mid = partition(nums, lhs, rhs);
        quickSort(nums, lhs, mid);
        quickSort(nums, mid + 1, rhs);
    }

    public static void swap(int[] nums, int lhs, int rhs) {
        int temp = nums[lhs];
        nums[lhs] = nums[rhs];
        nums[rhs] = temp;
    }

    public static int partition(int[] nums, int lhs, int rhs) {
        int pivot = nums[lhs];
        while(lhs < rhs) {
            while(lhs < rhs && nums[rhs] >= pivot) rhs--;
            swap(nums, lhs, rhs);
            while(lhs < rhs && nums[lhs] <= pivot) lhs++;
            swap(nums, rhs, lhs);
        }
        nums[lhs] = pivot;
        return lhs;
    }

    public static void main(String[] args) {
        int[] nums = {5, 2, 3, 9, 1};
        int[] result = sortArray(nums);
        System.out.println(java.util.Arrays.toString(result));
    }
}

// Worst Time Complexity = O(n^2)
// Best Time Complexity = O(nlogn)



