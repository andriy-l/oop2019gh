package com.macad.oop21.intro.oop23static;

public class MyMath {
    final static double PI = 3.14;

    private int nonStaticValue;
    static int staticValue;

    public MyMath() {
        this.nonStaticValue++;
        staticValue++;
    }

    public double getMyAreaOfCircle(int radius) {
        return MyMath.PI * radius * radius;
    }

    public double getAreaOfCircle(int radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "MyMath{" +
                "nonStaticValue=" + this.nonStaticValue +
                "\t staticValue=" + MyMath.staticValue +
                '}';
    }

    public double findMin(double[] values) { // null
        double min = values[0];
        for (int i = 1; i < values.length; i++) {
            min = values[i] < min ? values[i] : min;
        }
        return min;
    }

    public static double findMax(double[] values) {
        double max = values[0];
        for (int i = 1; i < values.length; i++) {
            max = values[i] > max ? values[i] : max;
        }
        return max;
    }


}
