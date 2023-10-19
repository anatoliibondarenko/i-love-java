package com.javafriends.javabasic.homework.lesson4;

public class Exercise2 {

    public static void main(String[] args) {

        int countDogs = 24;
        int countCats = 8;

        int weightPortion = 50;
        int costPortion = 2;
        int numberFeedings = 3;
        int numberDays = 30;

        printAmountFeed("dogs", countDogs, numberDays, numberFeedings, weightPortion);
        printAmountFeed("cats", countCats, numberDays, numberFeedings, weightPortion);
        printCostFeed(countDogs + countCats, numberDays, numberFeedings, costPortion);
    }

    private static void printAmountFeed(String nameAnimal, int countDogs, int numberDays, int numberFeedings, int weightPortion) {
        System.out.println("For " + countDogs + " " + nameAnimal + " per " + numberDays + " days need food - " +
                calcAmountFeedKilogram(countDogs, numberDays, numberFeedings, weightPortion) + " kg.");
    }

    private static void printCostFeed(int numberAnimals, int numberDays, int numberFeedings, int costPortion) {
        System.out.println("For the maintenance of a shelter of " + numberAnimals + " animals per " + numberDays +
                " days need - " + calcFeedCost(numberAnimals, numberDays, numberFeedings, costPortion) + " $.");

    }

    public static double calcAmountFeedKilogram(int numberAnimals, int numberDays, int numberFeedingPerDay, int weightPortion) {
        final double gramToKg = 1000.0;
        return numberAnimals * numberDays * numberFeedingPerDay * weightPortion / gramToKg;
    }

    public static int calcFeedCost(int numberAnimals, int numberDays, int numberFeedingPerDay, int costPortion) {
        return numberAnimals * numberDays * numberFeedingPerDay * costPortion;
    }
}
