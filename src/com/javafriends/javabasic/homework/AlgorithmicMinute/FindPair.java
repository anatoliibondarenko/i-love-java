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

        timeStart = System.currentTimeMillis();
        list = seekPairInArrayUsingSort(array, sumPair);
        timeEnd = System.currentTimeMillis();
        System.out.println("Work time is " + (timeEnd - timeStart) / 1000 + "s. Find - " + list.size() + " pairs.");
        System.out.println(list);

    }

    private static List<Pair> seekPairInArrayUsingSort(int[] array, int sumPair) {
        // TODO ??? It does not find all values. If the range contains multiple elements equal to the specified object,
        //  there is no guarantee which one will be found.



        int[][] arrayRememberPos = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            arrayRememberPos[i][0] = array[i];
            arrayRememberPos[i][1] = i;
        }

        // Arrays.sort(arrayRememberPos, Comparator.comparingInt(o -> o[0]));

        Comparator<int[]> comparator = (o1, o2) -> {
            if (o1[0] > o2[0]) {
                return 1;
            } else if (o1[0] < o2[0]) {
                return -1;
            } else return Integer.compare(o1[1], o2[1]);
        };

        Comparator<int[]> comparator1 = Comparator.comparingInt(o -> o[0]);

        Arrays.sort(arrayRememberPos, comparator);
        List<Pair> listPairs = new ArrayList<>();
        int index2;
        for (int i = 0; i < arrayRememberPos.length; i++) {
            int[] seek = {sumPair - arrayRememberPos[i][0], 1};
            int start = i + 1;

            while ( (index2 = Arrays.binarySearch(arrayRememberPos, start, arrayRememberPos.length, seek, comparator1)) > 0) {

                listPairs.add(new Pair(arrayRememberPos[i][0], arrayRememberPos[i][1],
                        arrayRememberPos[index2][0], arrayRememberPos[index2][1]));
                if (index2 != (arrayRememberPos.length - 1)) {
                    start = index2 + 1;
                } else {
                    break;
                }
            }

        }

        return listPairs;
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
