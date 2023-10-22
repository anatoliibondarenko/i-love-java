package com.javafriends.javabasic.homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PreservationApples {

    public static void main(String[] args) throws IOException {

        int largeCanCapacity = 5;
        int mediumCanCapacity = 3;
        int smallCanCapacity = 1;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number of apples:");
        int numberApples = Integer.parseInt(reader.readLine());

        int largeCanNumber = numberApples / largeCanCapacity;
        int leftApples = numberApples % largeCanCapacity;

        int mediumCanNumber = leftApples / mediumCanCapacity;
        leftApples = leftApples % mediumCanCapacity;

        int smallCanNumber = leftApples / smallCanCapacity;

        printResultPreservation(largeCanNumber, mediumCanNumber, smallCanNumber);

    }

    private static void printResultPreservation(int largeCanNumber, int mediumCanNumber, int smallCanNumber) {
        printNumberSpecificCans("Large", largeCanNumber);
        printNumberSpecificCans("Medium", mediumCanNumber);
        printNumberSpecificCans("Small", smallCanNumber);
    }

    private static void printNumberSpecificCans(String typeCan, int numberCan) {
        if (numberCan > 0) {
            System.out.println(typeCan  + " cans - " + numberCan);
        }
    }
}
