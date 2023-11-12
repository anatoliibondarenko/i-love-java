package com.javafriends.javabasic.homework.lesson14.coffee_machine;

public enum BeverageType {
    AMERICANO,
    LATTE,
    CAPPUCCINO,
    TEA,;

    public static boolean isValidType(String type) {
        for (BeverageType beverageType : values()) {
            if (beverageType.name().equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }

    public static BeverageType findByName(String name) {
        BeverageType beverageType = null;
        for (BeverageType beverage : values()) {
            if (beverage.name().equalsIgnoreCase(name)) {
                return beverage;
            }
        }
        return null;
    }
}
