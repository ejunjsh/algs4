package com.sky.algs4.exercise.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zhouff on 17/11/2017.
 */
public class e14 {
    public static int lg(int N) {
        int i, n;
        for (i = 0, n = 1; n <= N; i++) {
            n *= 2;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        StdOut.println(lg(256));
    }
}
