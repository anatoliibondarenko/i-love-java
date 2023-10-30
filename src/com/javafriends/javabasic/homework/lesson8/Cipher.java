package com.javafriends.javabasic.homework.lesson8;

public class Cipher {

    private static int[] cipher;

    public static void main(String[] args) {

        int numberDigitInCipher = 4;

        cipher = new int[numberDigitInCipher];
        createCipher();

        printCipher();
        System.out.printf("Cipher selected in %d attempts.", getNumberAttemptsForDecipherCode());

    }

    private static void printCipher() {
        for (int digit : cipher) {
            System.out.print("[" + digit + "]");
        }
        System.out.print("\n");
    }

    private static int getNumberAttemptsForDecipherCode() {
        return calculateCode() + 1;
    }

    private static int calculateCode() {
        int code = 0;
        for (int digit : cipher) {
            code = code * 10 + digit;
        }
        return code;
    }

    private static void createCipher() {
        for (int i = 0; i < cipher.length; i++) {
            cipher[i] = (int) (Math.random() * 10);
        }
    }
}
