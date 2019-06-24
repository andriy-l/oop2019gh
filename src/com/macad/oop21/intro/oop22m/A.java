package com.macad.oop21.intro.oop22m;

public class A {
    int b;

    private int a;

    public A() {
        this(4);
    }

    public A(int a) {
        this.a = a;
        this.a = a + a;
    }

    public A(double a) {
        this((int)a);
    }

    void calcSquare(final int a) {
        System.out.println(a * a * this.a);
    }

    public static void main(String[] args) {

        A a = new A();
        a.calcSquare(4);

        new A().calcSquare(4);

    }
}
