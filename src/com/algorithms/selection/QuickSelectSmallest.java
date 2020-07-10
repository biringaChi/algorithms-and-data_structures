package com.algorithms.selection;

public class QuickSelectSmallest {
    public static int quickSelect(int[] nums, int k) {
        quickSortSmallest(nums, 0, nums.length - 1);
        return nums[k - 1];
    }
    public static void quickSortSmallest(int[] nums, int lhs, int rhs) {
        if(lhs >= rhs) return;
        int mid = partitionSmallest(nums, lhs, rhs);
        quickSortSmallest(nums, lhs, mid);
        quickSortSmallest(nums, mid + 1, rhs);
    }
    public static void swap(int[] nums, int lhs, int rhs) {
        int temp = nums[lhs];
        nums[lhs] = nums[rhs];
        nums[rhs] = temp;
    }

    public static int partitionSmallest(int[] nums, int lhs, int rhs) {
        int pivot = nums[lhs];
        while(lhs < rhs) {
            while(lhs < rhs && nums[rhs] >= nums[lhs]) rhs--;
            swap(nums, lhs, rhs);
            while(lhs < rhs && nums[lhs] <= pivot) lhs++;
            swap(nums, rhs, lhs);
        }
        nums[lhs] = pivot;
        return lhs;
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 12, 8, 4};
        int k = 2;
        int kthSmallestNo = quickSelect(nums, k);
        System.out.println("The Kth Smallest Number: " + kthSmallestNo);
    }
}

// Worst Time Complexity = O(n^2)