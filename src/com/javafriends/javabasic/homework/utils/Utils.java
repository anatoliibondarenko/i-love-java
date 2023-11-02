package com.javafriends.javabasic.homework.utils;

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

    public static int getIntNumber(String inputMessage, int minValue) {
        int number;
        do {
            number = getIntNumber(inputMessage);
        } while (number < minValue);
        return number;
    }

    public static int getIntNumber(String inputMessage, int minValue, int maxValue) {
        int number;
        do {
            number = getIntNumber(inputMessage);
        } while (number < minValue || number > maxValue);
        return number;
    }

    public static int[] getArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        fillArrayByRandomValues(array, minValue, maxValue + 1);
        return array;
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
