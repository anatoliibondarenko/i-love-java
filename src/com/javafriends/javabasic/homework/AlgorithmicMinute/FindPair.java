package com.javafriends.javabasic.homework.AlgorithmicMinute;

import com.javafriends.javabasic.homework.utils.Utils;

import java.util.*;

import static com.javafriends.javabasic.homework.utils.Utils.getIntNumber;

public class FindPair {

    public static void main(String[] args) {
        int sizeArray = 10_000_000;
        int minElementOfArray = getIntNumber("Input min value of the array");
        int maxElementOfArray = getIntNumber("Input max value of the array");
        int sumPair = Utils.getIntNumber("Input number as sum of two elements of the array");

        int[] array = Utils.getArray(sizeArray, minElementOfArray, maxElementOfArray);

  //      System.out.println(Arrays.toString(array));
        long timeStart = System.currentTimeMillis();
        List<Pair> list = seekPairsUsingHashMap(array, sumPair);
        long timeEnd = System.currentTimeMillis();
        System.out.println("Work time is " + (timeEnd - timeStart) + "ms. Find - " + list.size() + " pairs.");
     //   System.out.println(list);


    }


    private static List<Pair> seekPairsUsingHashMap(int[] array, int sumPair) {
        List<Pair> listPairs = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sumComplement;
        List<Integer> list;
        for (int i = 0; i < array.length; i++) {
            sumComplement = sumPair - array[i];
            if (map.containsKey(sumComplement)) {
                list = map.get(sumComplement);
                for (Integer index : list) {
                    listPairs.add(new Pair(sumComplement, index, array[i], i));
                }
                list.add(i);
                map.put(sumComplement, list);
            }

            if (map.containsKey(array[i])) {
                list = map.get(array[i]);
            } else {
                list = new ArrayList<>();
            }
            list.add(i);
            map.put(array[i], list);
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
