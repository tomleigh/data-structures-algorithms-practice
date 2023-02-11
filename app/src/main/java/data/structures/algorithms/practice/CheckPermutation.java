package data.structures.algorithms.practice;

import java.util.HashMap;
import java.util.Map;

/* 
 * 1.2 CHECK PERMUTATIONS
 * Description: Given two strings, write an algorithm to determine if one string
 * is a permutation of the other.
 * 
 * Target Runtime: O(N)
 * 
 */


public class CheckPermutation {
    public boolean isPermutation(String str1, String str2) {
        if(str1.equals(str2)) {
            return true;
        } 
        else if(str2.length() > str1.length()) {
            return isPermutation(str2, str1);
        }

        // We know str1 is longer, check if str2 is a permutation of str1
        // HashMap <Character, Number-Of-Occurences>
        HashMap<Character, Integer> occurencesStr1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> occurencesStr2 = new HashMap<Character, Integer>();

        for(int i = 0; i < str1.length(); i++) {
            if(occurencesStr1.containsKey(str1.charAt(i))) {
                occurencesStr1.put(str1.charAt(i), occurencesStr1.get(str1.charAt(i)) + 1);
            } 
            else {
                occurencesStr1.put(str1.charAt(i), 1);
            }

            if(i < str2.length()) {
                if(occurencesStr2.containsKey(str2.charAt(i))) {
                    occurencesStr2.put(str2.charAt(i), occurencesStr1.get(str2.charAt(i)) + 1);
                } 
                else {
                    occurencesStr2.put(str2.charAt(i), 1);
                }
            }
        }
        // Go through occurencesStr2, check that occurencesStr1 has every char
        // and at least the same amount of occurences for each
        for (Map.Entry<Character, Integer> occurs : occurencesStr2.entrySet()) {
            if(occurencesStr1.containsKey(occurs.getKey())) {
                if(occurencesStr1.get(occurs.getKey()) > occurs.getValue()) {
                    return false;
                } 
                else {
                    continue;
                }
            } else {
                return false;
            }
        }
        return true;  
    } 
}
