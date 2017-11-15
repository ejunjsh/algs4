package com.sky.algs4.exercise.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zhouff on 14/11/2017.
 */
public class e09 {

    public static String BinaryString(int N){
        String s="";
        for(int n=N;n>0;n/=2){
            s=(n%2)+s;
        }
        return s;
    }

    public static void main(String[] args){
        StdOut.println(BinaryString(123));
        StdOut.println(Integer.toBinaryString(123));
    }
}
