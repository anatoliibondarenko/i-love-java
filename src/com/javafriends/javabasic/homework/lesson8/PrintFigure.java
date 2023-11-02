package com.javafriends.javabasic.homework.lesson8;

import static com.javafriends.javabasic.homework.lesson8.Utils.getIntNumber;

public class PrintFigure {

    public static void main(String[] args) {

        char paintChar = '*';

        int sideOfSquare = getIntNumber("Input a side of square:");
        printSquare(sideOfSquare, paintChar);

        int sideOfTriangle = getIntNumber("Input a side of triangle:");
        printTriangle(sideOfTriangle, paintChar);
    }

    private static void printTriangle(int sideOfTriangle, char symbol) {
        for (int i = 0; i < sideOfTriangle; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }
    }

    private static void printSquare(int sideOfSquare, char symbol) {
        for (int i = 0; i < sideOfSquare; i++) {
            for (int j = 0; j < sideOfSquare; j++) {
                System.out.print(symbol + "  ");
            }
            System.out.println();
        }
    }
}
