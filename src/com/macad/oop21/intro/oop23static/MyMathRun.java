package com.macad.oop21.intro.oop23static;

import java.util.Arrays;

public class MyMathRun {
    public static void main(String[] args) {
        double[] array = {4.3, .3, 2.1, 100, 22.3};
        double max = MyMath.findMax(array);
        System.out.println(max);
        MyMath mm = new MyMath();

        double min = mm.findMin(new double[]{4.5, 2.4, 4.3, 1});
        System.out.println(min);

        Arrays.fill(array, 1.0);

    }
}
