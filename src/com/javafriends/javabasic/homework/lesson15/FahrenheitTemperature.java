package com.javafriends.javabasic.homework.lesson15;

public class FahrenheitTemperature implements Convertor {

    @Override
    public double convert(double value) {
        return value * 9 / 5 + 32;
    }
}
