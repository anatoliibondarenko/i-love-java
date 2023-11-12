package com.javafriends.javabasic.homework.lesson14.coffee_machine;

public class BeverageFactory {
    public static Beverage createBeverage(BeverageType beverageType) {
        Beverage beverage = null;
        switch (beverageType) {
            case AMERICANO:
                beverage = new Americano();
                break;
            case LATTE:
                beverage = new Latte();
                break;
            case CAPPUCCINO:
                beverage = new Cappuccino();
                break;
            case TEA:
                beverage = new Tea();
                break;
        }
        return beverage;
    }
}
