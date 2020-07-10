package com.algorithms.selection;

public class QuickSelectLargest {
    public static int quickSelect(int[] nums, int k) {
        quickSortLargest(nums, 0, nums.length - 1);
        return nums[k - 1];
    }
    public static void quickSortLargest(int[] nums, int lhs, int rhs) {
        if(lhs >= rhs) return;
        int mid = partitionLargest(nums, lhs, rhs);
        quickSortLargest(nums, lhs, mid);
        quickSortLargest(nums, mid + 1, rhs);
    }
    public static void swap(int[] nums, int lhs, int rhs) {
        int temp = nums[lhs];
        nums[lhs] = nums[rhs];
        nums[rhs] = temp;
    }

    public static int partitionLargest(int[] nums, int lhs, int rhs) {
        int pivot = nums[lhs];
        while(lhs < rhs) {
            while(lhs < rhs && nums[rhs] <= pivot) rhs--;
            swap(nums, lhs, rhs);
            while(lhs < rhs && nums[lhs] >= pivot) lhs++;
            swap(nums, rhs, lhs);
        }
        nums[rhs] = pivot;
        return rhs;
    }
    public static void main(String[] args) {
        int[] nums = {6, 5, 12, 8, 4};
        int k = 2;
        int kthSmallestNo = quickSelect(nums, k);
        System.out.println("The Kth Largest Number: " + kthSmallestNo);
    }
}
// Worst Time Complexity = O(n^2)
