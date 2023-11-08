package com.javafriends.javabasic.homework.AlgorithmicMinute;

import com.javafriends.javabasic.homework.utils.Utils;
import java.util.Arrays;

public class ShiftArray {

    public static void main(String[] args) {
        int sizeArray = Utils.getIntNumber("Input a size of the array", 1);
        int minElementOfArray = Utils.getIntNumber("Input min value of the array");
        int maxElementOfArray = Utils.getIntNumber("Input max value of the array");

        int[] array = Utils.getArray(sizeArray, minElementOfArray, maxElementOfArray);

        int shift = Utils.getIntNumber("Input number for right shift of the array", 1);
        System.out.println("Source array =             " + Arrays.toString(array));
        ShiftArray.shiftToRightArray(array, shift);
        System.out.println("Array after right shift  = " + Arrays.toString(array));

        shift = Utils.getIntNumber("Input number for left shift of the array", 1);
        ShiftArray.shiftToLeftArray(array, shift);
        System.out.println("Array after left shift  =  " + Arrays.toString(array));
    }

    public static void shiftToRightArray(int[] array, int shift) {
        shift = shift % array.length;
        if (shift != 0) {
            shiftArray(array, shift);
        }
    }

    private static void shiftToLeftArray(int[] array, int shift) {
        shift = shift % array.length;
        if (shift != 0) {
            shiftArray(array, array.length - shift);
        }
    }

    private static void shiftArray(int[] array, int shift) {
        if (shift <= array.length / 2) {
            int[] temp = new int[shift];
            System.arraycopy(array, array.length - shift, temp, 0, shift);
            System.arraycopy(array, 0, array, shift, array.length - shift);
            System.arraycopy(temp, 0, array, 0, shift);
        } else {
            shift = array.length - shift;
            int[] temp = new int[shift];
            System.arraycopy(array, 0, temp, 0, shift);
            System.arraycopy(array, shift, array, 0, array.length - shift);
            System.arraycopy(temp, 0, array, array.length - shift, shift);
        }
    }
}
