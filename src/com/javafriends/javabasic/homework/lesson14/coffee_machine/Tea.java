package com.javafriends.javabasic.homework.lesson14.coffee_machine;

public class Tea extends Beverage {

    public Tea() {
        super("Tea", 0.8);
    }

    @Override
    public void prepare() {
        System.out.println("Tea is prepared.");
    }
}
