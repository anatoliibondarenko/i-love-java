package com.javafriends.javabasic.homework.lesson15;

public class KelvinTemperature implements Convertor {
    public static double ABSOLUTE_ZERO = -273.15;

    @Override
    public double convert(double value) {
        return value - ABSOLUTE_ZERO;
    }
}
