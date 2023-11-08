package com.javafriends.javabasic.homework.AlgorithmicMinute;

import com.javafriends.javabasic.homework.utils.Utils;

import java.util.*;

public class FindPair {

    public static void main(String[] args) {
        int sizeArray = 20;
        int minElementOfArray = 0;
        int maxElementOfArray = sizeArray / 2;
        int sumPair = Utils.getIntNumber("Input number as sum of two elements of the array");

        int[] array = Utils.getArray(sizeArray, minElementOfArray, maxElementOfArray);

        System.out.println(Arrays.toString(array));
        long timeStart = System.currentTimeMillis();
        List<Pair> list = seekPairInArrayBrutForce(array, sumPair);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Work time is " + (timeEnd - timeStart) / 1000 + "s. Find - " + list.size() + " pairs.");
        System.out.println(list);



    }


    private static List<Pair> seekPairInArrayBrutForce(int[] array, int sumPair) {
        List<Pair> listPairs = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sumPair) {
                    listPairs.add(new Pair(array[i], i, array[j], j));
                }
            }
        }
        return listPairs;
    }

    private static class Pair {
        private final int number1;
        private final int index1;
        private final int number2;
        private final int index2;

        public Pair(int number1, int index1, int number2, int index2) {
            this.number1 = number1;
            this.index1 = index1;
            this.number2 = number2;
            this.index2 = index2;
        }

        @Override
        public String toString() {
            return "[" +
                    index1 +
                    ", " + index2 +
                    "] = " + number1 +
                    " + " + number2;
        }
    }
}
