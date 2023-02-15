package data.structures.algorithms.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateMatrixTest {

    @Test void rotateMatrixTestSimple() {
        RotateMatrix rotateMatrix = new RotateMatrix();

        int[][] testInputMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] testOutputMatrix = rotateMatrix.RotateMatrix(testInputMatrix);

        int[][] testExpectedMatrix = {
                {7, 4, 1},
                {8, 5, 2},
                {9, 6, 3},
        };

        for(int i = 0; i < testInputMatrix.length; i++) {
            assertArrayEquals(testOutputMatrix[i], testExpectedMatrix[i]);
        }
    }
    @Test void rotateMatrixTestLarge() {
        RotateMatrix rotateMatrix = new RotateMatrix();

        int[][] testInputMatrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25},
        };
        int[][] testOutputMatrix = rotateMatrix.RotateMatrix(testInputMatrix);

        int[][] testExpectedMatrix = {
                {21, 16, 11, 6, 1},
                {22, 17, 12, 7, 2},
                {23, 18, 13, 8, 3},
                {24, 19, 14, 9, 4},
                {25, 20, 15, 10, 5},
        };

        for(int i = 0; i < testInputMatrix.length; i++) {
            assertArrayEquals(testOutputMatrix[i], testExpectedMatrix[i]);
        }
    }
    @Test void rotateMatrixTestTiny() {
        RotateMatrix rotateMatrix = new RotateMatrix();

        int[][] testInputMatrix = {
                {1, 1},
                {2, 2}
        };
        int[][] testOutputMatrix = rotateMatrix.RotateMatrix(testInputMatrix);

        int[][] testExpectedMatrix = {
                {2, 1},
                {2, 1},
        };

        for(int i = 0; i < testInputMatrix.length; i++) {
            assertArrayEquals(testOutputMatrix[i], testExpectedMatrix[i]);
        }
    }
}