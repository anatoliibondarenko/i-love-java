package com.javafriends.javabasic.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HandLuggage {

    public static final int LENGTH_VARIANT_ONE = 55;
    public static final int WIDTH_VARIANT_ONE = 20;
    public static final int HEIGHT_VARIANT_ONE = 40;

    public static final int LENGTH_VARIANT_TWO = 40;
    public static final int WIDTH_VARIANT_TWO = 22;
    public static final int HEIGHT_VARIANT_TWO = 53;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter three sizes of hand luggage");

        int length = Integer.parseInt(reader.readLine());
        int width = Integer.parseInt(reader.readLine());
        int height = Integer.parseInt(reader.readLine());

        try {
            if (isPassHandLuggage(length, width, height)) {
                System.out.println("The luggage will pass like hand luggage.");
            } else {
                System.out.println("The luggage will not pass like hand luggage.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private static boolean isPassHandLuggage(int length, int width, int height) {

        if (length <= 0 || width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Incorrect parameters.");
        }

        if (length > LENGTH_VARIANT_ONE || width > WIDTH_VARIANT_ONE || height > HEIGHT_VARIANT_ONE) {
            if (length > LENGTH_VARIANT_TWO || width > WIDTH_VARIANT_TWO || height > HEIGHT_VARIANT_TWO) {
                return false;
            }
        }
        return true;
    }
}
