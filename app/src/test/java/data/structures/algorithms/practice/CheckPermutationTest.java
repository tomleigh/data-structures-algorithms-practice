package data.structures.algorithms.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationTest {

    @Test void isPermutationSimple() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertEquals(checkPermutation.isPermutation("abcd", "abc"), true);
    }

    @Test void isPermutationReverse() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertEquals(checkPermutation.isPermutation("abcd", "cba"), true);
    }
    @Test void isPermutationSingle() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertEquals(checkPermutation.isPermutation("abcd", "a"), true);
    }
    @Test void isPermutationEquivalent() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertEquals(checkPermutation.isPermutation("abcd", "abcd"), true);
    }
    @Test void isPermutationEquivalentReverse() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertEquals(checkPermutation.isPermutation("abcd", "dcba"), true);
    }
    @Test void isPermutationLargerSecondString() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertEquals(checkPermutation.isPermutation("eab", "abcde"), true);
    }
    @Test void isPermutationWrong1() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertEquals(checkPermutation.isPermutation("abcd", "e"), false);
    }
    @Test void isPermutationWrong2() {
        CheckPermutation checkPermutation = new CheckPermutation();
        assertEquals(checkPermutation.isPermutation("e", "123"), false);
    }
}