package com.javafriends.javabasic.homework.lesson10;

import java.math.BigInteger;

import static com.javafriends.javabasic.homework.utils.Utils.getIntNumber;

public class Factorial {

    public static void main(String[] args) {

        int number = getIntNumber("Input number for calculate the factorial", 0);
        System.out.println("Factorial " + number + " equals " + factorial(number));
    }

    private static BigInteger factorial(int number) {
       if (number == 0 || number == 1) {
           return new BigInteger("1");
       } else {
           return factorial(number - 1).multiply(new BigInteger(String.valueOf(number)));
       }
    }
}
