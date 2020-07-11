package com.problems;

public class StringPermutations {
    public static void stringPermutate(String string, int leftIndex, int rightIndex) {
        if (leftIndex == rightIndex) System.out.println(string);
        else {
            for (int i = leftIndex; i <= rightIndex; i++) {
                stringPermutate(swap(string, leftIndex, i), leftIndex + 1, rightIndex);
            }
        }
    }

    public static String swap(String string, int charA, int charB) {
        char[] charArray = string.toCharArray();
        char temp = charArray[charA];
        charArray[charA] = charArray[charB];
        charArray[charB] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        String string = "MIT";
        stringPermutate(string, 0, string.length() - 1);
    }
}

// Time Complexity: n!(factorial)