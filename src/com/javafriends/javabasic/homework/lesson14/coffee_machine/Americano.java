package com.javafriends.javabasic.homework.lesson14.coffee_machine;

public class Americano extends Beverage {

    public Americano() {
        super("Americano", 1.4);
    }

    @Override
    public void prepare() {
        System.out.println("Americano is prepared.");
    }
}
