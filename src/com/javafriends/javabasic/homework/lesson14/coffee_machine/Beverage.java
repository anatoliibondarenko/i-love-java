package com.javafriends.javabasic.homework.lesson14.coffee_machine;

public abstract class Beverage {
    private String name;
    private double cost;

    public Beverage(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public abstract void prepare();
}
