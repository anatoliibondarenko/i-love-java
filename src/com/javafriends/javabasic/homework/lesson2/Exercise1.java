package com.javafriends.javabasic.homework.lesson2;

public class Exercise1 {
    public static void main(String[] args) {
        // The program should work with any values in variables a and b.
        // So the String type is most suitable for this condition.
        String a = "10";
        String b = "20";
        String temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println();

        temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
