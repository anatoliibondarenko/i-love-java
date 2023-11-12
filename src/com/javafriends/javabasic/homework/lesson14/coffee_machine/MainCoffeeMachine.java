package com.javafriends.javabasic.homework.lesson14.coffee_machine;

import com.javafriends.javabasic.homework.utils.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainCoffeeMachine {

    static List<Beverage> beverages = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        inputBeverages();
        printOrder();
        prepareOrder();
    }

    private static void inputBeverages() throws IOException {
        while (true) {
            System.out.println("Select available beverages: " + Arrays.toString(BeverageType.values()) + " or \"exit\" to complete");
            String input = Utils.READER.readLine();

            if (BeverageType.isValidType(input)) {
                Beverage beverage = BeverageFactory.createBeverage(BeverageType.findByName(input));
                beverages.add(beverage);
                System.out.println(beverage.getName() + " is added to order.");
            } else if (input.equalsIgnoreCase("exit")) {
                break;
            } else {
                System.out.println("Unidentified input. Please repeat it.");
            }
        }
    }

    private static void printOrder() {
        System.out.println("Your order is:");
        System.out.println("______________");
        double sumOrder = 0;
        String format = "%-20s%.2f%n";
        for (Beverage beverage : beverages) {
            System.out.printf(format, beverage.getName(), beverage.getCost());
            sumOrder += beverage.getCost();
        }
        System.out.println("______________");
        System.out.printf(format, "Total amount:", sumOrder);
    }

    private static void prepareOrder() {
        System.out.println();
        for (Beverage beverage : beverages) {
            beverage.prepare();
        }
    }
}
