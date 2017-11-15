package com.sky.algs4.exercise.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by zhouff on 14/11/2017.
 */
public class e3 {


    public static void main(String[] args) {
        if(args.length==3){
            if(args[0].equals(args[1])&&args[1].equals(args[2])){
                StdOut.println("equal");
            }
            else {
                StdOut.println("not equal");
            }
        }
    }
}
