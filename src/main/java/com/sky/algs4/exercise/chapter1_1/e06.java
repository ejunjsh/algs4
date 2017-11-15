package com.sky.algs4.exercise.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zhouff on 14/11/2017.
 */
public class e06 {

    public static void main(String[] args) {
        int f=0;
        int g=1;
        for(int i=0;i<=15;i++){
            StdOut.println(f);
            f=f+g;
            g=f-g;
        }
    }
}
