package com.macad.oop21.intro.oop22m;

import java.util.Arrays;

public class MatrixRun {




    public static void main(String[] args) {

        Matrix matrix = new Matrix();

        double[][] mA = {{1,1},
                         {1,1}};
        double[][] mB = {{1,1},
                         {1,1}};
        double[][] mD = {{1,1,1},
                         {1,1,1}};
        double[][] mE = {{1,1},
                         {1,1},
                         {1,1}};
        double[][] mC = matrix.addMatrices(mA, mB);
//        double[][] mZ = matrix.addMatrices(mA, mD);

        double[][] mU = matrix.multiplyMatrices(mD, mE);

        for (double[] array : mC) {
            System.out.println(Arrays.toString(array));
        }



    }
}
