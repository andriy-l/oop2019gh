package com.macad.oop21.intro.oop22m;

public class MyWindowRun {
    public static void main(String[] args) {
        MyWindow window1 = new MyWindow(4);
        MyWindow window2 = new MyWindow(4);
        MyWindow window3 = new MyWindow(4, 5);

        window1.getColor();

        MyWindow window4 = window1.getMyWindow();

        MyWindow[] windows = {new MyWindow(5), new MyWindow(5,6)};


    }
}
