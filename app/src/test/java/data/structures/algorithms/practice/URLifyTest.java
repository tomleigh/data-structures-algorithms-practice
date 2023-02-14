package data.structures.algorithms.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    @Test void convertToURLTestSimple() {
        URLify urlify = new URLify();
        char[] inputChars = new char[13];
        String str = "HELLO WORLD";
        for(int i = 0 ; i < str.length(); i++) {
            inputChars[i] = str.charAt(i);
        }
        char[] expectedOutput = {'H', 'E', 'L', 'L', 'O', '%','2','0', 'W', 'O', 'R', 'L', 'D'};

        assertEquals(String.valueOf(expectedOutput), String.valueOf(urlify.ConvertToURL(inputChars)));
    }

    @Test void convertToURLTestMultiSpace() {
        URLify urlify = new URLify();
        char[] inputChars = new char[16];
        String str = "HELLO  WORLD";
        for(int i = 0 ; i < str.length(); i++) {
            inputChars[i] = str.charAt(i);
        }
        char[] expectedOutput = {'H', 'E', 'L', 'L', 'O', '%','2','0', '%','2','0', 'W', 'O', 'R', 'L', 'D'};

        assertEquals(String.valueOf(expectedOutput), String.valueOf(urlify.ConvertToURL(inputChars)));
    }

    @Test void convertToURLTestTrailingSpace() {
        URLify urlify = new URLify();
        char[] inputChars = new char[8];
        String str = "HELLO ";
        for(int i = 0 ; i < str.length(); i++) {
            inputChars[i] = str.charAt(i);
        }
        char[] expectedOutput = {'H', 'E', 'L', 'L', 'O', '%','2','0'};

        assertEquals(String.valueOf(expectedOutput), String.valueOf(urlify.ConvertToURL(inputChars)));
    }
    @Test void convertToURLTestPrefixSpace() {
        URLify urlify = new URLify();
        char[] inputChars = new char[8];
        String str = " HELLO";
        for(int i = 0 ; i < str.length(); i++) {
            inputChars[i] = str.charAt(i);
        }
        char[] expectedOutput = {'%','2','0', 'H', 'E', 'L', 'L', 'O'};

        assertEquals(String.valueOf(expectedOutput), String.valueOf(urlify.ConvertToURL(inputChars)));
    }
    @Test void convertToURLTestPrefixSuffixSpace() {
        URLify urlify = new URLify();
        char[] inputChars = new char[11];
        String str = " HELLO ";
        for(int i = 0 ; i < str.length(); i++) {
            inputChars[i] = str.charAt(i);
        }
        char[] expectedOutput = {'%','2','0', 'H', 'E', 'L', 'L', 'O', '%', '2', '0'};

        assertEquals(String.valueOf(expectedOutput), String.valueOf(urlify.ConvertToURL(inputChars)));
    }
    @Test void convertToURLTestOnlySpaces() {
        URLify urlify = new URLify();
        char[] inputChars = new char[9];
        String str = "   ";
        for(int i = 0 ; i < str.length(); i++) {
            inputChars[i] = str.charAt(i);
        }
        char[] expectedOutput = {'%','2','0', '%','2','0', '%', '2', '0'};

        assertEquals(String.valueOf(expectedOutput), String.valueOf(urlify.ConvertToURL(inputChars)));
    }
}