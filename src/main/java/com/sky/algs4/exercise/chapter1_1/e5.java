package com.sky.algs4.exercise.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zhouff on 14/11/2017.
 */
public class e5 {

public  static  boolean check(double x,double y){
    if(x<=1&&x>=0&&y<=1&&y>=0){
        return true;
    }
    return  false;
}

    public static void main(String[] args) {
        StdOut.println(check(1.2,2));
        StdOut.println(check(1.2,3));
        StdOut.println(check(1.2,4));
        StdOut.println(check(0.2,1));

    }
}
