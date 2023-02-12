package data.structures.algorithms.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {

    @Test
    void checkIfUnique() {
    }

    @Test void simpleTestAlphanumeric() {
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.checkIfUnique("abcd1234"));
    }
    @Test void simpleTestSymbols() {
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.checkIfUnique("!@#$"));
    }
    @Test void testEmpty() {
        IsUnique isUnique = new IsUnique();
        assertTrue(isUnique.checkIfUnique(""));
    }
    @Test void testDuplicate() {
        IsUnique isUnique = new IsUnique();
        assertFalse(isUnique.checkIfUnique("aaaa"));
    }
    @Test void testSeparatedDuplicate() {
        IsUnique isUnique = new IsUnique();
        assertFalse(isUnique.checkIfUnique("abcdefa"));
    }
}