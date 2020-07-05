package com.algorithms.search;

public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] nums, int low, int high,  int target) {
        if (low > high) return -1;

        int mid = ((low + high) / 2);
        if(target == nums[mid]) return nums[mid];
        else if(target < nums[mid]) return recursiveBinarySearch(nums, low, mid - 1, target);
        else return recursiveBinarySearch(nums, mid + 1, high, target);
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 6, 10, 15, 20, 27};
        int target = 15;
        int low = 0, high = nums.length - 1;
        int result = recursiveBinarySearch(nums, low, high, target);
        System.out.println(result);
    }
}

// Worst Time Complextiy = O(logn)