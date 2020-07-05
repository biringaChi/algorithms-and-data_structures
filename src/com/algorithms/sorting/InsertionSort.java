package com.algorithms.sorting;

public class InsertionSort {
    public static void insertionSort(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int temp_value = nums[i];
            int temp_position = i;
            while(temp_position > 0 && nums[temp_position - 1] > temp_value) {
                nums[temp_position] = nums[temp_position - 1];
                temp_position = temp_position - 1;
            }
            nums[temp_position] = temp_value;
        }
        System.out.println(java.util.Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int[] nums = {9, 4, 7, 2, 6};
        insertionSort(nums);
    }
}

// Worst Time Complexity = O(n^2)