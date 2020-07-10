package com.algorithms.selection;
import java.util.Arrays;
import java.util.Collections;

public class KthElement {
    // Find the Kth smallest number
    public static int kthSmallest(Integer[] nums, int k) {
        Arrays.sort(nums);
        return nums[k - 1];
    }

    public static int kthLargest(Integer[] nums, int k) {
        Arrays.sort(nums, Collections.reverseOrder());
        return nums[k - 1];
    }

    public static void main(String[] args) {
        Integer[] nums = {6, 5, 12, 8, 4};
        int k = 2;
        int kthSmallestNo = kthSmallest(nums, 2);
        int kthLargestNo = kthLargest(nums, k);
        System.out.println("The Kth Smallest Number: " + kthSmallestNo);
        System.out.println("The Kth Largest Number: " + kthLargestNo);
    }
}
