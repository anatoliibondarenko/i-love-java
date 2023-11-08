package com.javafriends.javabasic.homework.AlgorithmicMinute;

import com.javafriends.javabasic.homework.utils.Utils;

import java.util.*;

import static com.javafriends.javabasic.homework.utils.Utils.getIntNumber;

public class FindPair {

    public static void main(String[] args) {
        findPairWithUserInputs();
        analyzePerformance();
    }

    private static void findPairWithUserInputs() {
        int sizeArray = Utils.getIntNumber("Input a size of the array (e.g. - 1000 )", 1);
        int minElementOfArray = getIntNumber("Input min value of the array (e.g. - 0 )");
        int maxElementOfArray = getIntNumber("Input max value of the array (e.g. - 1000 )");
        int sumPair = Utils.getIntNumber("Input number as sum of two elements of the array (e.g. - 1000)");

        int[] array = Utils.getArray(sizeArray, minElementOfArray, maxElementOfArray);
        System.out.println(Arrays.toString(array));

        doBruteForce(sumPair, array);
        doHashMap(sumPair, array);
    }

    private static void doHashMap(int sumPair, int[] array) {
        long timeStart = System.currentTimeMillis();
        List<Pair> list = seekPairsUsingHashMap(array, sumPair);
        long timeEnd = System.currentTimeMillis();
        printResult("seekPairsUsingHashMap", (int) (timeEnd - timeStart), list);
    }

    private static void doBruteForce(int sumPair, int[] array) {
        long timeStart = System.currentTimeMillis();
        List<Pair> list = seekPairInArrayBruteForce(array, sumPair);
        long timeEnd = System.currentTimeMillis();
        printResult("seekPairInArrayBruteForce", (int) (timeEnd - timeStart), list);
    }

    private static void printResult(String methodName, int timeWorking, List<Pair> list) {
        System.out.println("Work time by " + methodName + " is - " + timeWorking + " ms. Find - " + list.size() + " pairs.");
        System.out.println(list);
    }

    private static List<Pair> seekPairInArrayBruteForce(int[] array, int sumPair) {
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

    private static List<Pair> seekPairsUsingHashMap(int[] array, int sumPair) {
        List<Pair> listPairs = new ArrayList<>();
        Map<Integer, List<Integer>> mapArrayGroupByValue = new HashMap<>();

        int seekingComplement;
        List<Integer> indexesEqualsValues;
        for (int i = 0; i < array.length; i++) {
            seekingComplement = sumPair - array[i];
            if (mapArrayGroupByValue.containsKey(seekingComplement)) {
                indexesEqualsValues = mapArrayGroupByValue.get(seekingComplement);
                for (Integer index : indexesEqualsValues) {
                    listPairs.add(new Pair(seekingComplement, index, array[i], i));
                }
            }

            if (mapArrayGroupByValue.containsKey(array[i])) {
                indexesEqualsValues = mapArrayGroupByValue.get(array[i]);
            } else {
                indexesEqualsValues = new ArrayList<>();
            }
            indexesEqualsValues.add(i);
            mapArrayGroupByValue.put(array[i], indexesEqualsValues);
        }
        return listPairs;
    }

    private static void analyzePerformance() {
        int timeYouCouldWait = getIntNumber("Input approximate time in seconds " +
                "that you could wait for working program (e.g. - 30)");

        int sizeArraysTesting = 2;
        int[] arrayTesting;
        int counter = 1;

        long startTest;
        long endTest;
        int timeBruteForce;
        int timeHashMap;

        do {
            arrayTesting = Utils.getArray(sizeArraysTesting, 0, sizeArraysTesting);

            startTest = System.currentTimeMillis();
            seekPairInArrayBruteForce(arrayTesting, sizeArraysTesting);
            endTest = System.currentTimeMillis();
            timeBruteForce = (int) (endTest - startTest);

            startTest = System.currentTimeMillis();
            seekPairsUsingHashMap(arrayTesting, sizeArraysTesting);
            endTest = System.currentTimeMillis();
            timeHashMap= (int) (endTest - startTest);

            System.out.printf("Size array - 2^%d: brute force - %d ms, hashmap - %d ms.\n", counter++, timeBruteForce, timeHashMap);
            sizeArraysTesting *= 2;
           }
        while (timeBruteForce < timeYouCouldWait * 1000);
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
