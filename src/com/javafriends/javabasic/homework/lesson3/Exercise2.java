package com.javafriends.javabasic.homework.lesson3;

public class Exercise2 {

    public static void main(String[] args) {

        double a = 1;
        double b = 0.5;
        double c = 0.2;

        double result = Math.abs(a - b) / Math.pow(a + b, 3) - Math.sqrt(c);

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("|a - b| / (a + b)^3 -√c = " + result);
    }
}
