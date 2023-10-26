package com.javafriends.javabasic.homework.lesson7;

public class HappyNumbers {

    public static void main(String[] args) {

        int unhappyNumber1 = 4;
        int unhappyNumber2 = 9;

        for (int i = 0; i <= 100; i++) {
            if ((i / 10 != unhappyNumber1) && (i / 10 != unhappyNumber2) &&
                    (i % 10 != unhappyNumber1) && (i % 10 != unhappyNumber2)) {
                System.out.println(i);
            }
        }
    }
}
