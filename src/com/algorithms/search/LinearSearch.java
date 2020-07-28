package com.algorithms.search;

public class LinearSearch {
    @SuppressWarnings("ForLoopReplaceableByForEach")
    public static boolean linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return true;
        } return false;
    }
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 5;
        System.out.println(linearSearch(nums, target));
    }
}
