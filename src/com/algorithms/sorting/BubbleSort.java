package com.algorithms.sorting;

public class BubbleSort {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
    public static void bubbleSort(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            boolean flag = false;
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    swap(nums, i, j);
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
    public static void main(String[] args) {
        int[] nums = {9, 4, 7, 2, 6};
        bubbleSort(nums);
        System.out.println(java.util.Arrays.toString(nums));
    }
}
