package com.javafriends.javabasic.homework.lesson10;

import static com.javafriends.javabasic.homework.utils.Utils.getIntNumber;

public class MatrixTranspose {

    public static void main(String[] args) {
        int rows = getIntNumber("Input number rows of the matrix", 1);
        int columns = getIntNumber("Input number columns of the matrix", 1);

        int[][] initialMatrix = inputArray(rows, columns);
        System.out.println("Initial matrix:");
        displayMatrix(initialMatrix);

        int[][] transposedMatrix = transposeMatrix(initialMatrix);
        System.out.println("Transposed matrix:");
        displayMatrix(transposedMatrix);
    }

    private static int[][] inputArray(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input values of the row " + (i + 1));
            array[i] = inputArray(columns);
        }
        return array;
    }

    private static int[] inputArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = getIntNumber("Input value " + (i + 1) + "'s element");
        }
        return array;
    }

    private static void displayMatrix(int[][] array) {
        for (int[] line : array) {
            for (int element : line) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rowsTransposeMatrix = matrix[0].length;
        int columnsTransposeMatrix = matrix.length;
        int[][] transposedMatrix = new int[rowsTransposeMatrix][columnsTransposeMatrix];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
