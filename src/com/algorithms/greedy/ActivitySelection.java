package com.algorithms.greedy;

import java.util.ArrayList;
import java.util.Arrays;

public class ActivitySelection {
    public static void activitySelection(int max_activity, int[] start_time, int[] finish_time) {
        Arrays.sort(finish_time);
        ArrayList<Integer> result = new ArrayList<>();
        int j = 0;
        result.add(j);
        for(int i = 1; i < max_activity; ++i) {
            if(start_time[i] > finish_time[j]) {
                result.add(i);
                j = i;
            }
        }
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
        int[] start_time=  {1, 3, 0, 5, 8, 5};
        int[] finish_time =  {2, 4, 6, 7, 9, 9};
        int max_activity = 5;
        activitySelection(max_activity, start_time, finish_time);
    }
}
