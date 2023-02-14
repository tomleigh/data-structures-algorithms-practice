package data.structures.algorithms.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

    @Test
    void isPermutationOfPalindromeSimpleTrue() {
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        assertTrue(palindromePermutation.isPermutationOfPalindrome("Tact Coa"));
    }

    @Test
    void isPermutationOfPalindromeSimpleFalse() {
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        assertFalse(palindromePermutation.isPermutationOfPalindrome("Test"));
    }

    @Test
    void isPermutationOfPalindromeInvalidChars() {
        PalindromePermutation palindromePermutation = new PalindromePermutation();
        assertFalse(palindromePermutation.isPermutationOfPalindrome("123123"));
    }
}