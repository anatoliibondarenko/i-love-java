package com.javafriends.javabasic.homework.lesson14.coffee_machine;

public class Cappuccino extends Beverage {

    public Cappuccino() {
        super("Cappuccino", 1.2);
    }

    @Override
    public void prepare() {
        System.out.println("Cappuccino is prepared.");
    }
}
