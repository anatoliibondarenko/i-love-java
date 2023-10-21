package com.javafriends.javabasic.homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1 {

    public static final int HIGHER_SCHOLARSHIP_RATING = 10;
    public static final int REGULAR_SCHOLARSHIP_RATING = 8;

    public static void main(String[] args) throws IOException {

        int numberRatings = 5;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input " + numberRatings + " ratings: ");

        int sumRatings = 0;
        for (int i = 0; i < numberRatings; i++) {
            sumRatings += Integer.parseInt(reader.readLine());
        }

        double averageRating = (double) sumRatings / numberRatings;
        System.out.println("The average score is " + averageRating + ".");

        if (averageRating >= HIGHER_SCHOLARSHIP_RATING) {
            System.out.println("Student will receive a higher scholarship.");
        } else if (sumRatings >= REGULAR_SCHOLARSHIP_RATING) {
            System.out.println("Student will receive regular scholarship.");
        } else {
            System.out.println("Student will not receive a scholarship.");
        }
    }
}
