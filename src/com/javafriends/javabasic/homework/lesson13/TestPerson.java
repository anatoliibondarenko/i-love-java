package com.javafriends.javabasic.homework.lesson13;

import com.javafriends.javabasic.homework.utils.Utils;

public class TestPerson {
    public static String[] NAMES = {"Ivan", "Olha", "Anatolii", "Oleg", "Anna", "Oksana", "Vasyl", "Katya", "Sergiy", "Natasha"};
    public static String[] LASTNAMES = {"Shevchenko", "Kotlyar", "Skovoroda", "Vernigora", "Litvjak", "Kuksa", "Subota", "Grichenko", "Vakulenko", "Malik"};
    public static int maxAge;

    public static void main(String[] args) {
        int countPerson = Utils.getIntNumber("Enter the number of people", 1);
        maxAge = Utils.getIntNumber("Enter the max age of person", 1);

        Person[] people = new Person[countPerson];
        for (int i = 0; i < countPerson; i++) {
            people[i] = getRandomPerson();
        }

        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static Person getRandomPerson() {
        String name = NAMES[(int) (Math.random() * NAMES.length)];
        String lastname = LASTNAMES[(int) (Math.random() * LASTNAMES.length)];
        int age = (int) (Math.random() * maxAge) + 1; // must be age > 0
        int weight = getRandomWeight(age);
        int height = getRandomHeight(age);

        return new Person(name, lastname, age, weight, height);
    }

    private static int getRandomWeight(int age) {
        return getRandomValue(age, "weight");
    }

    private static int getRandomHeight(int age) {
        return getRandomValue(age, "height");
    }

    private static int getRandomValue(int age, String param) {
        // {{age, minHeight, maxHeight, minWeight, maxWeight}, ...}
        int[][] tableWeightsAndHeights = {
                {1, 71, 80, 9, 12},
                {2, 81, 91, 11, 15},
                {3, 88, 102, 12, 18},
                {4, 93, 108, 13, 20},
                {5, 99, 115, 15, 23},
                {6, 105, 121, 16, 27},
                {7, 111, 128, 18, 31},
                {8, 116, 135, 20, 36},
                {9, 121, 140, 22, 39},
                {10, 126, 146, 24, 45},
                {11, 131, 153, 26, 52},
                {12, 136, 160, 28, 59},
                {13, 141, 166, 31, 66},
                {14, 148, 172, 34, 73},
                {15, 155, 178, 39, 80},
                {16, 158, 182, 44, 85},
                {17, 163, 186, 50, 88},
                {18, 163, 190, 55, 100}
        };

        int[] rowWithData;
        if (age >= tableWeightsAndHeights.length - 1) {
            rowWithData = tableWeightsAndHeights[tableWeightsAndHeights.length - 1];
        } else {
            rowWithData = tableWeightsAndHeights[age - 1];
        }

        int minValue = 0;
        int maxValue = 0;
        switch (param) {
            case ("height"):
                minValue = rowWithData[1];
                maxValue = rowWithData[2];
                break;
            case ("weight"):
                minValue = rowWithData[3];
                maxValue = rowWithData[4];
        }

        return (int) (Math.random() * (maxValue - minValue) + minValue);
    }
}
