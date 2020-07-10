package com.algorithms.selection;

public class QuickSelectMedian {
    public static double quickSelect(int[] nums) {
        int mid;
        quickSortSmallest(nums, 0, nums.length - 1);;
        if(nums.length % 2 == 0) {
            mid = nums[nums.length / 2] + nums[nums.length / 2 - 1];
            return ((double) mid / 2);
        } else return nums[nums.length / 2];
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
        int[] nums = {6, 9, 12, 1};
        double median = quickSelect(nums);
        System.out.println("The Median Value: " + median);
    }
}
