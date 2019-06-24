package com.macad.oop21.intro.oop22m;

public class B {
    private static B ourInstance = new B();

    public static B getInstance() {
        return ourInstance;
    }

    private B() {
    }
}
