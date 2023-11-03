package com.javafriends.javabasic.homework.lesson10;

import static com.javafriends.javabasic.homework.utils.Utils.getIntNumber;

public class NegativeNumbers {

    public static void main(String[] args) {
        int rows = getIntNumber("Input number rows of the matrix", 1);
        int columns = getIntNumber("Input number columns of the matrix", 1);
        int minValue = getIntNumber("Input min value in the matrix");
        int maxValue = getIntNumber("Input max value in the matrix");

        int[][] array = createAndFillArray(rows, columns, minValue, maxValue);
        System.out.println("Matrix:");
        displayArray(array);

        System.out.println("Negative elements:");
        printPositionNegativeNumbers(array);
    }

    private static int[][] createAndFillArray(int rows, int columns, int minValue, int maxValue) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            array[i] = createAndFillArray(columns, minValue, maxValue);
        }
        return array;
    }

    private static int[] createAndFillArray(int size, int minValue, int maxValue) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (maxValue - minValue) + minValue);
        }
        return array;
    }

    private static void displayArray(int[][] array) {
        for (int[] line : array) {
            for (int element : line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void printPositionNegativeNumbers(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("[" + i + ", " + j + "] = " + array[i][j]);
                }
            }
        }
    }
}
