package com.javafriends.javabasic.homework.lesson7;

public class WashCars {

    public static void main(String[] args) {

        int dirtyCars = 10;

        System.out.println("Washing - for loop");

        for (int i = 0; i < dirtyCars; i++) {
            soapCar();
            washCar();
            dryCar();
            System.out.println((i + 1) + " car was washed");
        }

        System.out.println();
        System.out.println("Washing - while loop");

        do {
            soapCar();
            washCar();
            dryCar();
            System.out.println("Need to wash " + --dirtyCars + " cars.");
        } while (dirtyCars > 0);
    }

    private static void soapCar() {
        System.out.println("The car is soaping.");
    }

    private static void washCar() {
        System.out.println("The car is washing.");
    }

    private static void dryCar() {
        System.out.println("The car is drying.");
    }
}
