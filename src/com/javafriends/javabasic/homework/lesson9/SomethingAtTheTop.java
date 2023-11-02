package com.javafriends.javabasic.homework.lesson9;

import java.util.Arrays;

import static com.javafriends.javabasic.homework.utils.Utils.getArray;
import static com.javafriends.javabasic.homework.utils.Utils.getIntNumber;

public class SomethingAtTheTop {

    public static void main(String[] args) {
        int sizeArray = getIntNumber("Input a size of the array", 1);
        int minElementOfArray = getIntNumber("Input min value of the array");
        int maxElementOfArray = getIntNumber("Input max value of the array");

        int[] array = getArray(sizeArray, minElementOfArray, maxElementOfArray);
        System.out.println(Arrays.toString(array));

        int valueToTheTop = getIntNumber("Enter the value to be set at the top of the array");
        moveValueToTheTopArray(array, valueToTheTop);
        System.out.println(Arrays.toString(array));
    }

    private static void moveValueToTheTopArray(int[] array, int value) {
        int temp;
        int counterCoincidences = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                temp = array[counterCoincidences];
                array[counterCoincidences] = value;
                array[i] = temp;
                counterCoincidences++;
            }
        }
    }
}
