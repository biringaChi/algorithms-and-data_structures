package com.problems;
import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrence {
    public static void characterOccurrence(String s) {
        char[] cArray = s.toCharArray();
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char c : cArray) {
            if(!hm.containsKey(c)) hm.put(c, 1);
            else hm.put(c, hm.get(c) + 1);
        }
        Map.Entry<Character, Integer> max = null;
        for(Map.Entry<Character, Integer> hmExtract : hm.entrySet()) {
            System.out.println(hmExtract.getKey() + " = " + hmExtract.getValue());
            if(max == null || hmExtract.getValue() > max.getValue()) {
                max = hmExtract;
            }
        }
        System.out.println("Character with maximum occurrence: " + max);
    }
    public static void main(String[] args) {
        characterOccurrence("UmassD");
    }
}
