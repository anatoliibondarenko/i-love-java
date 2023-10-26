package com.javafriends.javabasic.homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class GuessNumber {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int maxHiddenNumber = 10;
        int hiddenNumber = (int) (Math.random() * (maxHiddenNumber + 1)); // There are 11 numbers from 0 to 10.

        do {
            System.out.println("Input a number from 0 to " + maxHiddenNumber + ":");
        } while (Integer.parseInt(READER.readLine()) != hiddenNumber);

        System.out.println("You guessed it.");
        }
    }

