package com.macad.oop21.intro.oop23static;

import java.util.Arrays;

public class MyPyramid {

    public static void printPyramid(int height) {
        String leftAccumulator = "";
        String rigthAccumulator = "";
        for (int i = 1; i <= height; i++) {
            char[] spaces = new char[height - i];
            Arrays.fill(spaces, ' ');
            leftAccumulator += i;
            if (i != 1) {
                rigthAccumulator = (i - 1) + rigthAccumulator;
            }
            System.out.println(new String(spaces) + leftAccumulator + rigthAccumulator);
        }
    }


    public static void main(String... args) {
        printPyramid(5);
    }
}
