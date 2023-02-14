package data.structures.algorithms.practice;

import java.util.*;
/*
 * Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at
 * the end to hold the additional characters, and that you are given the "true" length of the string. (note: if
 * implementing in Java, please use a character array so that you can perform this operation in place.)
 *
 * EXAMPLE
 *
 * Input: "Mr John Smith      ", 13
 * Output: "Mr%20John%20Smith"
 *
 */

public class URLify {

    /* Example1:
     * Input: "  Hello ", 14
     * Output: "%20%20Hello%20
     *
     * Example Simple:
     * Input: "Hello World   ",
     * Output: "Hello%20World", 13
     */

    public char[] ConvertToURL (char[] inputChars) {
        // First count the number of spaces
        // Next iterate backwards through the characters starting at the end
        // Move each char forward by the number of spaces
        // If a space, replace with '%20' and reduce the number of spaces remaining
        int spaceCount = 0;
        for(int i = 0; i < inputChars.length; i++) {
            if(inputChars[i] == ' ') {
                spaceCount++;
            }
        }
        System.out.println(inputChars);
        System.out.println(spaceCount);

        for(int i = (inputChars.length - 1); i > 0; i--) {
            if(inputChars[i] == ' ') {
                // replace with '%20'
                inputChars[i + (spaceCount * 2)] = '0';
                inputChars[i + (spaceCount * 2) - 1] = '2';
                inputChars[i + (spaceCount * 2) - 2] = '%';
                spaceCount --;
            }
            else if (inputChars[i] != '\0') {
                // Move this char forward spaces
                inputChars[i + (spaceCount * 2)] = inputChars[i];
            }
        }
        System.out.println(inputChars);
        return inputChars;
    }




}
