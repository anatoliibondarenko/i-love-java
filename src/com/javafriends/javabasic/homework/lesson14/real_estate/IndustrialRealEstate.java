package com.javafriends.javabasic.homework.lesson14.real_estate;

public class IndustrialRealEstate extends RealEstate {

    private boolean isRailroadTracks;

    public IndustrialRealEstate(String address, double rentableArea, double realEstateTaxPerMetre, boolean isRailroadTracks) {
        super(address, rentableArea, realEstateTaxPerMetre);
        this.isRailroadTracks = isRailroadTracks;
    }
}
