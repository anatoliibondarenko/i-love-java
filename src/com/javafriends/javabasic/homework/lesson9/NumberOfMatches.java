package com.javafriends.javabasic.homework.lesson9;

import java.util.Arrays;

import static com.javafriends.javabasic.homework.utils.Utils.*;

public class NumberOfMatches {

    public static void main(String[] args) {

        int numberOfNumbersInTheLottery = getIntNumber("Input number (>= 1) of numbers in the lottery", 1);
        int minValueInTheLottery = getIntNumber("Input min value (>= 0) in the lottery ", 0);
        int maxValueInTheLottery = getIntNumber("Input max value (>= 1) in the lottery", 1);

        int[] hiddenNumbers = getArray(numberOfNumbersInTheLottery, minValueInTheLottery, maxValueInTheLottery);
        Arrays.sort(hiddenNumbers);

        int[] guessedNumbers = inputArray(numberOfNumbersInTheLottery, minValueInTheLottery, maxValueInTheLottery);
        Arrays.sort(guessedNumbers);

        System.out.println("Hidden numbers:  " + Arrays.toString(hiddenNumbers));
        System.out.println("Entered numbers: " + Arrays.toString(guessedNumbers));
        System.out.println("Numbers of matches: " + calcNumberOfMatches(hiddenNumbers, guessedNumbers));
    }

    private static int[] getArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        fillArrayByRandomValues(array, minValue, maxValue + 1);
        return array;
    }

    private static int[] inputArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getIntNumber("Input value " + (i + 1) + " number of lottery: ", minValue, maxValue);
        }
        return array;
    }

    private static int calcNumberOfMatches(int[] array1, int[] array2) {
        int bound = Math.min(array1.length, array2.length); // just in case
        int count = 0;
        for (int i = 0; i < bound; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }
        return count;
    }
}
