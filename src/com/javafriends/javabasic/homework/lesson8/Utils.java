package com.javafriends.javabasic.homework.lesson8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Utils {

    public static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static int getIntNumber(String inputMessage) {
        try {
            System.out.println(inputMessage);
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error: " + exception.getMessage());
            return getIntNumber(inputMessage);
        }
    }

    public static void fillArrayByRandomValues(int[] array, int minValue, int maxValue) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxValue - minValue) + minValue);
        }
    }

    public static void fillArrayByRandomValues(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
    }
}
