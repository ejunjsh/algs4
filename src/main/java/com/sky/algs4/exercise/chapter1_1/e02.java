package com.sky.algs4.exercise.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zhouff on 14/11/2017.
 */
public class e02 {
    public static String getType(Object o){
        return o.getClass().toString();
    }

    public static void main(String[] args){
        //a
        StdOut.println(getType((1+2.236)/2));
        StdOut.println((1+2.236)/2);
        //b
        StdOut.println(getType(1+2+3+4.0));
        StdOut.println(1+2+3+4.0);
        //c
        StdOut.println(getType(4.1>=4));
        StdOut.println(4.1>=4);
        //d
        StdOut.println(getType(1+2+"3"));
        StdOut.println(1+2+"3");
    }
}
