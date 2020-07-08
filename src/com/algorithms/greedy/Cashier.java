package com.algorithms.greedy;

import java.util.ArrayList;

public class Cashier {
    public static ArrayList<Integer> cashierAlgorithm(int amount, int[] denominations) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = denominations.length - 1; i >= 0; i--) {
            while (amount >= denominations[i]) {
                amount -= denominations[i];
                result.add(denominations[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] denominations = {1, 10, 21, 34, 70, 100, 350, 1225, 1500};
        int amount = 140;
        ArrayList<Integer> result = cashierAlgorithm(amount, denominations);
        System.out.println("Amount: " + amount + " " + "\n" + result.toString());
    }
}

// Time Complexity: O(n^2)