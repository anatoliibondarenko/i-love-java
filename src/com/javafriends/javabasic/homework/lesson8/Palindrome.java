package com.javafriends.javabasic.homework.lesson8;

import java.io.IOException;
import java.util.Locale;

import static com.javafriends.javabasic.homework.lesson8.Utils.READER;

public class Palindrome {

    public static void main(String[] args) throws IOException {

        System.out.println("Input string for seeking a palindrome :");
        String stringForAnalysis = READER.readLine();

        if (isPalindrome(stringForAnalysis)) {
            System.out.printf("String \"%s\" is a palindrome.", stringForAnalysis);
        } else {
            System.out.printf("String \"%s\" is not a palindrome.", stringForAnalysis);
        }
    }

    private static boolean isPalindrome(String line) {
        line = line.replace(" ", "").toLowerCase(Locale.ROOT);
        for (int i = 0, j = line.length() - 1; i < line.length() / 2; i++, j--) {
            if (line.charAt(i) != line.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
