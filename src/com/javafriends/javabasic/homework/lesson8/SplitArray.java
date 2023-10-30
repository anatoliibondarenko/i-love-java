package com.javafriends.javabasic.homework.lesson8;

import java.io.IOException;
import java.util.Arrays;

import static com.javafriends.javabasic.homework.lesson8.Utils.READER;
import static com.javafriends.javabasic.homework.lesson8.Utils.getIntNumber;

public class SplitArray {

    public static void main(String[] args) throws IOException {

        int sizeSourceArray;
        do {
            sizeSourceArray = getIntNumber("Input size of initial array ");
        } while (sizeSourceArray < 0);

        String[] sourceArray = inputArrayOfStrings(sizeSourceArray);

        int numberSubArrays;
        do {
            numberSubArrays = getIntNumber("How many sub-arrays do you want to divide the initial array? \n " +
                    "Input int number less size of initial array :");
        } while (!(numberSubArrays > 1 && numberSubArrays < sizeSourceArray));

        String[][] dividedArrays = splitArray(sourceArray, numberSubArrays);

        System.out.println(Arrays.toString(sourceArray));
        System.out.println(Arrays.deepToString(dividedArrays));

    }

    private static String[][] splitArray(String[] sourceArray, int numberSubArrays) {

        String[][] dividedArrays = new String[numberSubArrays][];
        int sizeSubArray = sourceArray.length / numberSubArrays;

        // except the last sub-array
        for (int i = 0; i < numberSubArrays - 1; i++) {
            dividedArrays[i] = new String[sizeSubArray];
            System.arraycopy(sourceArray, i * sizeSubArray, dividedArrays[i], 0, sizeSubArray);

        }

        // last sub-array
        dividedArrays[numberSubArrays - 1] = new String[sourceArray.length - (numberSubArrays - 1) * sizeSubArray];
        System.arraycopy(sourceArray, (numberSubArrays - 1) * sizeSubArray,
                dividedArrays[numberSubArrays - 1], 0, sourceArray.length - (numberSubArrays - 1) * sizeSubArray);

        return dividedArrays;
    }

    private static String[] inputArrayOfStrings(int size) throws IOException {
        String[] strings = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input string number " + (i + 1));
            strings[i] = READER.readLine();
        }
        return strings;
    }
}
