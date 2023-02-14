package data.structures.algorithms.practice;

/*
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
 * that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need
 * to be limited to just dictionary words. You can ignore casing and non-letter characters.
 */

import java.util.HashMap;
import java.util.*;

public class PalindromePermutation {


    public String convertToLowerCaseNoWhitespace(String inputStr) {
        String newStr = inputStr;
        newStr = newStr.toLowerCase();
        newStr = newStr.trim();
        newStr = newStr.replaceAll(" ","");
        return newStr;

    }

    /// Function to determine if letters occur in pairs or not/
    /// If odd length, then allows for one letter without a pair.
    public boolean isPermutationOfPalindrome(String inputStr) {
        /*
         * For a string to be a palindrome, the first and last characters must match
         * i.e., index 0 and length, 1 and length - 1, 2 and length - 2, etc...
         * Therefore, for each unique char, there must be duplicates, with exception of the middle index
         * (if odd length).
         */
        String formattedInputStr = convertToLowerCaseNoWhitespace(inputStr);
        System.out.println(formattedInputStr);

        boolean isOddLength = true;
        if(formattedInputStr.length() % 2 == 0) {
            isOddLength = false;
        }

        HashMap<Character, Integer> letterOccurences = new HashMap<Character, Integer>();
        for(int i = 0; i < formattedInputStr.length(); i++) {
            if(letterOccurences.containsKey(formattedInputStr.charAt(i))) {
                letterOccurences.replace(formattedInputStr.charAt(i), letterOccurences.get(formattedInputStr.charAt(i)) + 1);
            }
            else {
                letterOccurences.put(formattedInputStr.charAt(i), 1);
            }
        }
        System.out.println(letterOccurences);

        boolean seenOdd = false;
        for(Map.Entry<Character, Integer> map : letterOccurences.entrySet()) {
            if(isOddLength) {
                if(map.getValue() % 2 != 0 && seenOdd == false) {
                    seenOdd = true;
                } else if(seenOdd) {
                    return false;
                }
            } else if(map.getValue() % 2 != 0) {
                return false;
            }

        }
        return true;
    }
}
