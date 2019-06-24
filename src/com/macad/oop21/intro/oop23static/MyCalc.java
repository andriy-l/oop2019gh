package com.macad.oop21.intro.oop23static;

public class MyCalc {
    /**
     * Method for PI calculation
     * 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
     * @param series
     * @return
     */
    public static double calcPI(int series) {
        double pi = 0;
        for (int j = 1, i = 1; i < series; j++, i+=2) {
            pi += (j % 2 != 0) ? 4.0 / i : 4.0 / i * (-1);
//            System.out.printf(" j=%d i=%d pi=%f sign=%d\n", j, i, pi, (j % 2 != 0) ? 1 : -1);
        }
        return pi;
    }



    public static void main(String[] args) {
        double pi = calcPI(25_000_000);
        System.out.println(pi);
    }

}
