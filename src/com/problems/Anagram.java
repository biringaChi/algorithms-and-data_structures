package com.problems;

import java.util.Arrays;

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
    public static void main(String[] args) {
        String[] strings = new String[] {"print", "ntrip"};
        System.out.println(anagram(strings[0], strings[1]));
    }
}
