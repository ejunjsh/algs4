package com.sky.algs4.exercise.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zhouff on 17/11/2017.
 */
public class e13 {
    public static void printTransposedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                StdOut.printf("%4d", matrix[j][i]);
            }
            StdOut.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 100, 200, 300 }, { 400, 500, 600 } };
        printTransposedMatrix(a);
    }
}
