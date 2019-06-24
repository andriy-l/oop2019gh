package com.macad.oop21.intro.oop22m;

public class Matrix {

    public double[][] addMatrices(double[][] num1, double[][] num2) {
        // якщо матриці не співрозмірні, то програма вивалиться
        if ((num1.length != num2.length) || (num1[0].length != num2[0].length)) {
            throw new IllegalArgumentException("Matrices are of different sizes");
        }

        double[][] result = new double[num1.length][num1[0].length];

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                result[i][j] = num1[i][j] + num2[i][j];
            }
        }

        return result;
    }

    public double[][] multiplyMatrices(double[][] num1, double[][] num2) {
        // якщо матриці не узгоджені, то програма вивалиться
        if ((num1[0].length != num2.length)) {
            throw new IllegalArgumentException("Matrices cannot be multiplied");
        }

        double[][] result = new double[num1.length][num2[0].length];

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < num2[0].length; k++) {

                }
                result[i][j] = sum;
            }
        }

        return result;
    }


    // parameters
    public double addNumbers(double num1, double num2) {
        return num1 + num2;
    }

    public double addNumbers(String num1, String num2) {
        return Double.valueOf(num1) + Double.valueOf(num2); // перетворює стрічку в число
    }


    public double substructNumbers(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }
}
