package com.javafriends.javabasic.homework.lesson14.coffee_machine;

public class Latte extends Beverage {

    public Latte() {
        super("Latte", 1.6);
    }

    @Override
    public void prepare() {
        System.out.println("Latte is prepared.");
    }
}
