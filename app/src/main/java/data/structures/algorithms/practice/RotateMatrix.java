package data.structures.algorithms.practice;

import java.lang.reflect.Array;
import java.util.*;

/*
 * Given an image represented by an N x N matrix, where each pixel in the image is represented by an integer,
 * write a method to rotate the image by 90 degrees. Can you do this in place?
 *
 * EXAMPLE (N = 3)
 * Input:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 *
 * Output:
 * 7 4 1
 * 8 5 2
 * 9 6 3
 *
 */

public class RotateMatrix {
    /*
     * To rotate the matrix 90 degrees clockwise, each row becomes a column in reverse order.
     * E.g., For (N = 3) --> row 1: [1, 2, 3] becomes column 3: [1, 2, 3]
     */

    /* Example
    * [0][0] == [(N - 1) - j][0]
    * [0][1] == [(N - 1) - j][0]
    * [0][2] == [(N - 1) - j][0]

    * [1][0] == [(N - 1) - j][1]
    * [1][1] == [(N - 1) - j][1]
    * [1][2] == [(N - 1) - j][1]

    * [2][0] == [(N - 1) - j][2]
    * [2][1] == [(N - 1) - j][2]
    * [2][2] == [(N - 1) - j][2]
    */

    public int[][] RotateMatrix(int[][] inputMatrix) {
        int N = inputMatrix.length;
        int[][] outputMatrix = new int[N][N];

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                outputMatrix[i][j] = inputMatrix[(N - 1) - j][i];
            }
        }
        return outputMatrix;
    }
}
