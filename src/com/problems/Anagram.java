package com.problems;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static boolean anagram(String a, String b) {
        char[] stringA = a.toCharArray();
        char[] stringB = b.toCharArray();
        if(stringA.length != stringB.length) return false;
        else {
            Arrays.sort(stringA);
            Arrays.sort(stringB);
            return Arrays.equals(stringA, stringB);
        }
    }
    public static boolean anagram1(String a, String b) {
        if (a.length() != b.length()) return false;
        int[] frequencies = new int[26];
        for (int i = 0; i < a.length(); i++) {
            frequencies[a.charAt(i) - 'a']++;
            // What characters represent in numbers
//            System.out.print(a.charAt(i) - 'a');
//            System.out.println(a.charAt(i) + " ");
            frequencies[b.charAt(i) - 'a']--;
        }
        for (int frequency : frequencies) {
            if (frequency != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strings = new String[] {"print", "ntrip"};
        System.out.println(anagram1(strings[0], strings[1]));
    }
}
