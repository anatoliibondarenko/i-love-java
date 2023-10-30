package com.javafriends.javabasic.homework.lesson8;

import static com.javafriends.javabasic.homework.lesson8.Utils.getIntNumber;
import static com.javafriends.javabasic.homework.lesson8.Utils.fillArrayByRandomValues;

public class Murder {

    public static void main(String[] args) {

        int countSuspected;
        do {
            countSuspected = getIntNumber("Input number of suspects");
        } while (countSuspected <= 0);

        double[] suspects = new double[countSuspected];
        fillArrayByRandomValues(suspects);

        printListOfSuspects(suspects);
        int numberMostLikelySuspect = getNumberMostLikelySuspect(suspects);
        System.out.printf("The most suspected number %d. Probability - %.3f", numberMostLikelySuspect + 1,
                suspects[numberMostLikelySuspect]);

    }

    private static void printListOfSuspects(double[] suspects) {
        System.out.print("[");
        for (int i = 0; i < suspects.length - 1; i++) {
            System.out.printf("%.3f, ", suspects[i]);
        }
        System.out.printf("%.3f]\n", suspects[suspects.length - 1]);
    }

    private static int getNumberMostLikelySuspect(double[] suspects) {
        int number = 0;
        double probability = suspects[0];

        for (int i = 1; i < suspects.length; i++) {
            if (suspects[i] > probability) {
                number = i;
                probability = suspects[i];
            }
        }
        return number;
    }
}
