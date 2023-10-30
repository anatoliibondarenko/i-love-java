package com.javafriends.javabasic.homework.lesson8;

import static com.javafriends.javabasic.homework.lesson8.Utils.fillArrayByRandomValues;

public class FootballTeam {

    public static final int COUNT_PLAYERS_OF_TEAM = 11;
    public static final int MIN_AGE_PLAYER = 18;
    public static final int MAX_AGE_PLAYER = 45;

    public static void main(String[] args) {

        int[] agesPlayerTeamOne = new int[COUNT_PLAYERS_OF_TEAM];
        int[] agesPlayerTeamTwo = new int[COUNT_PLAYERS_OF_TEAM];

        fillArrayByRandomValues(agesPlayerTeamOne, MIN_AGE_PLAYER, MAX_AGE_PLAYER);
        fillArrayByRandomValues(agesPlayerTeamTwo, MIN_AGE_PLAYER, MAX_AGE_PLAYER);

        printArray(agesPlayerTeamOne);
        printArray(agesPlayerTeamTwo);

        double averageAgeTeamOne = calcAverageOfArray(agesPlayerTeamOne);
        double averageAgeTeamTwo = calcAverageOfArray(agesPlayerTeamTwo);

        printResultComparingAges(averageAgeTeamOne, averageAgeTeamTwo);
    }



    private static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }

    private static double calcAverageOfArray(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    private static void printResultComparingAges(double averageAgeTeamOne, double averageAgeTeamTwo) {
        if (averageAgeTeamOne > averageAgeTeamTwo) {
            System.out.printf("Average age of first team is greater than second: %.2f > %.2f", averageAgeTeamOne,
                    averageAgeTeamTwo);
        } else if (averageAgeTeamOne < averageAgeTeamTwo) {
            System.out.printf("Average age of second team is greater than first: %.2f > %.2f", averageAgeTeamTwo,
                    averageAgeTeamOne);
        } else {
            System.out.printf("Average age of teams is the same: %.2f", averageAgeTeamOne);
        }
    }
}
