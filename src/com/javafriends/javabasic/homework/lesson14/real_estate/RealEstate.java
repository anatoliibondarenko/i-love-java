package com.javafriends.javabasic.homework.lesson14.real_estate;

public class RealEstate {

    private String address;
    private double rentableArea;
    private double realEstateTaxPerMetre;

    public RealEstate(String address, double rentableArea, double realEstateTaxPerMetre) {
        this.address = address;
        this.rentableArea = rentableArea;
        this.realEstateTaxPerMetre = realEstateTaxPerMetre;
    }

    public String getAddress() {
        return address;
    }

    public double calcTax() {
        return this.rentableArea * this.realEstateTaxPerMetre;
    }
}
