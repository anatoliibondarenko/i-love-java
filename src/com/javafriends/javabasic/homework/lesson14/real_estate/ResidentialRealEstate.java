package com.javafriends.javabasic.homework.lesson14.real_estate;

public class ResidentialRealEstate extends RealEstate {

    private int percentageSubsidy;

    public ResidentialRealEstate(String address, double rentableArea, double realEstateTaxPerMetre, int percentageSubsidy) {
        super(address, rentableArea, realEstateTaxPerMetre);
        this.percentageSubsidy = percentageSubsidy;
    }

    @Override
    public double calcTax() {
        return super.calcTax() * (100 - this.percentageSubsidy) / 100;
    }
}
