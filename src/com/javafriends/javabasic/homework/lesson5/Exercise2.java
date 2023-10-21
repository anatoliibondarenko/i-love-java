package com.javafriends.javabasic.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {

    public static final int MAX_SUM_SIZES_HAND_LUGGAGE = 115;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three sizes of hand luggage");

        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());

        if (isPassHandLuggage(length, width, height)) {
            System.out.println("The luggage will pass like hand luggage.");
        } else {
            System.out.println("The luggage will not pass like hand luggage.");
        }
    }

    private static boolean isPassHandLuggage(int length, int width, int height) {
        return length + width + height <= MAX_SUM_SIZES_HAND_LUGGAGE;
    }
}
