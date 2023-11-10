package com.javafriends.javabasic.homework.lesson14.real_estate;

public class RetailRealEstate extends RealEstate{

    private final static double MIN_TRADING_REVENUE = 100;
    private double tradingRevenue;

    public RetailRealEstate(String address, double rentableArea, double realEstateTaxPerMetre, double tradingRevenue) {
        super(address, rentableArea, realEstateTaxPerMetre);
        this.tradingRevenue = tradingRevenue;
    }

    @Override
    public double calcTax() {
        return this.tradingRevenue < MIN_TRADING_REVENUE ? 0 : super.calcTax() ;
    }
}
