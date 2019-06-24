package com.macad.oop21.intro.oop22m;

public class MyWindow {
    private double width;
    private double height;
    private int numberOfGlass;
    private String color;
    private boolean isOpen;

    public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
        this.isOpen = isOpen;
    }

    public MyWindow(double width, double height, int numberOfGlass, String color) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
        this.color = color;
    }

    public MyWindow(double width, double height, int numberOfGlass) {
        this.width = width;
        this.height = height;
        this.numberOfGlass = numberOfGlass;
    }

    public MyWindow(double width, double height) {
        this.width = width;
        this.height = height;
        System.out.println("double-double");
    }

    public MyWindow(double width) {
        this.width = width;
        System.out.println("double");
    }

    private MyWindow() {
        System.out.println("а то є constructor!!!");
    }

    public void MyWindow() {
        System.out.println("а то є метод!!!");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getNumberOfGlass() {
        return numberOfGlass;
    }

    public void setNumberOfGlass(int numberOfGlass) {
        this.numberOfGlass = numberOfGlass;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "MyWindow{" +
                "width=" + width +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }


    public void printMyFields() {
        String fieldsOfClassMyWindow = toString();
        System.out.println(fieldsOfClassMyWindow);
    }

    public MyWindow getMyWindow() {
        return new MyWindow();
    }
}
