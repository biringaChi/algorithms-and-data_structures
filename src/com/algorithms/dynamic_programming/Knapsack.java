package com.algorithms.dynamic_programming;

public class Knapsack {
    public static int max(int v1, int v2) {
        return Math.max(v1, v2);
    }

    public static int knapSack(int maxWeight, int[] weights, int[] profits) {
        int[][] knapsackTable = new int[profits.length + 1][maxWeight + 1];

        for (int i = 0; i <= profits.length; i++) {
            for (int weight = 0; weight <= maxWeight; weight++) {
                if(i == 0 || weight == 0) knapsackTable[i][weight] = 0;
                else if(weights[i - 1] <= weight) {
                    knapsackTable[i][weight] = max(profits[i - 1] + knapsackTable[i - 1][weight - weights[i - 1]],
                            knapsackTable[i - 1][weight]);
                }
                else knapsackTable[i][weight] = knapsackTable[i - 1][weight];
            }
        }
        return knapsackTable[profits.length][maxWeight];
    }

    public static void main(String[] args) {
        int[] profits = {1, 2, 5, 6}, weights = {2, 3, 4, 5};
        int maxWeight = 8;
        int maxProfit = knapSack(maxWeight, weights, profits);
        System.out.println("Maximum Profit = " + maxProfit);
    }
}