package com.algorithms.search;

public class IterativeBinarySearch {
    public static int binarySearch(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while(low <= high) {
            int mid = ((low + high) / 2);
            if(target == nums[mid]) return nums[mid];
            if(target < nums[mid]) high = mid - 1;
            if(target > nums[mid]) low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 3;
        int result = binarySearch(nums, target);
        System.out.println(result);
    }
}

// Worst Time Complexity = O(logn)