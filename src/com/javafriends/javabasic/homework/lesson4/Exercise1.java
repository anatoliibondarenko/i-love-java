package com.javafriends.javabasic.homework.lesson4;

public class Exercise1 {

    public static void main(String[] args) {
        printAirplaneInfo("Jet", "F-22 Raptor");
        printAirplaneInfo("Airliner", "Aerobus 737", 120);
        printAirplaneInfo("Airliner", "Boeing 777", 180, 28);
    }

    public static void printAirplaneInfo(String nanePlane, String typePlane) {
        System.out.println("Тип самолета: " + nanePlane + ", модель: " + typePlane);
    }

    public static void printAirplaneInfo(String nanePlane, String typePlane, int numberOfEconomyClassSeats) {
        System.out.println("Тип самолета: " + nanePlane + ", модель: " + typePlane + ", кол. пасажиров эконом класса: " +
                numberOfEconomyClassSeats);
    }

    public static void printAirplaneInfo(String nanePlane, String typePlane, int numberOfEconomyClassSeats,
                                         int numberOfBusinessClassSeats) {

        System.out.println("Тип самолета: " + nanePlane + ", модель: " + typePlane + ", кол. пасажиров эконом класса: " +
                numberOfEconomyClassSeats + ", пассажиров бизне скласса: " + numberOfBusinessClassSeats);

    }
}
