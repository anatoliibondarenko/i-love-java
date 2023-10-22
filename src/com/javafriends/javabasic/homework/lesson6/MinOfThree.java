package com.javafriends.javabasic.homework.lesson6;

import java.util.Random;

public class MinOfThree {

    public static void main(String[] args) {

        final int bound = 1000;

        Random random = new Random();
        int number1 = random.nextInt(bound);
        int number2 = random.nextInt(bound);
        int number3 = random.nextInt(bound);

        int min = calcMinOfThree(number1, number2, number3);

        System.out.println("Minimum of " + number1 + ", " + number2 + ", " + number3 + " is " + min + ".");
    }

    private static int calcMinOfThree(int number1, int number2, int number3) {
        return Math.min(Math.min(number1, number2), number3);
    }
}
