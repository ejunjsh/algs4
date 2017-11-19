package com.sky.algs4.exercise.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zhouff on 17/11/2017.
 */
public class e12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = 9 - i;
        }
        for (int i = 0; i < 10; i++) {
            a[i] = a[a[i]];
        }
        // I don't understand why the author asks this
        for (int i = 0; i < 10; i++) {
            StdOut.println(i);
        }
        StdOut.println("-------------------------");
        // I think the author should ask this
        for (int i = 0; i < 10; i++) {
            StdOut.println(a[i]);
        }
    }
}
