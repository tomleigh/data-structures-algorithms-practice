package data.structures.algorithms.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationTest {

    @Test void isPermutationSimple() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertTrue(checkPermutation.isPermutation("abcd", "abc"));
    }

    @Test void isPermutationReverse() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertTrue(checkPermutation.isPermutation("abcd", "cba"));
    }
    @Test void isPermutationSingle() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertTrue(checkPermutation.isPermutation("abcd", "a"));
    }
    @Test void isPermutationEquivalent() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertTrue(checkPermutation.isPermutation("abcd", "abcd"));
    }
    @Test void isPermutationEquivalentReverse() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertTrue(checkPermutation.isPermutation("abcd", "dcba"));
    }
    @Test void isPermutationLargerSecondString() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertTrue(checkPermutation.isPermutation("eab", "abcde"));
    }
    @Test void isPermutationWrong1() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertFalse(checkPermutation.isPermutation("abcd", "e"));
    }
    @Test void isPermutationWrong2() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertFalse(checkPermutation.isPermutation("e", "123"));
    }
}