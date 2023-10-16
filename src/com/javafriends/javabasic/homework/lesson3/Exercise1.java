package com.javafriends.javabasic.homework.lesson3;

public class Exercise1 {

    public static void main(String[] args) {

        double radiusLargeSphere = 1;
        double radiusMediumSphere = 0.5;
        double radiusSmallSphere = 0.2;
        double coefficientDensity = 0.7;

        double weight = (volumeSphere(radiusSmallSphere) + volumeSphere(radiusMediumSphere) +
                volumeSphere(radiusLargeSphere)) * coefficientDensity;

        System.out.println("Weight - " + weight);
    }

    public static double volumeSphere(double radiusSphere) {
        return Math.PI * Math.pow(radiusSphere, 3) * 4 / 3;
    }
}
