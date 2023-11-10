package com.javafriends.javabasic.homework.lesson14.real_estate;

import java.util.ArrayList;
import java.util.List;

public class MainRealEstate {

    public static void main(String[] args) {

        RealEstate smallApartment = new ResidentialRealEstate("Shevchenko st, 1", 50, 80,20);
        RealEstate largeApartment = new ResidentialRealEstate("Druzbi st, 1", 120, 150, 0);

        RealEstate store = new RetailRealEstate("Mira av, 1", 300, 100, 500);
        RealEstate stall = new RetailRealEstate("Kvitkovii alley, 1", 12, 60, 80);

        RealEstate largeFactory = new IndustrialRealEstate("Budivelnikiv av, 312", 5000, 40, false);

        List<RealEstate> realEstates = new ArrayList<>();
        realEstates.add(smallApartment);
        realEstates.add(largeApartment);
        realEstates.add(store);
        realEstates.add(stall);
        realEstates.add(largeFactory);

        for (RealEstate realty : realEstates ) {
            System.out.println("Property tax by address: " + realty.getAddress() + " at November: " + realty.calcTax());
        }
    }
}
