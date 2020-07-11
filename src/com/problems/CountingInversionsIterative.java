package com.problems;

public class CountingInversionsIterative {
    public static int countingInversions(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[j] < nums[i]) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {4, 6, 1, 3, 8, 12, 5, 7};
        int result = countingInversions(nums);
        System.out.println("Number of Inversions = " + result);
    }
}

// Time Complexity: O(n^2)