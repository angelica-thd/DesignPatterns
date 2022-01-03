package com.company.abstractFactory;

import java.util.UUID;

public class FeaturePhoneFactory implements PhoneAbstractFactory {
    private final int releaseYear;
    private final UUID phoneName;
    private final double screenSize;
    private final int batterymAh;
    private final int sims;
    private final boolean isSmart;
    private final double weight;
    private final String color;
    private final String network;

    public FeaturePhoneFactory(int releaseYear, UUID phoneName, double screenSize, int batterymAh, int sims, boolean isSmart, double weight, String color, String network) {
        this.releaseYear = releaseYear;
        this.phoneName = phoneName;
        this.screenSize = screenSize;
        this.batterymAh = batterymAh;
        this.sims = sims;
        this.isSmart = isSmart;
        this.weight = weight;
        this.color = color;
        this.network = network;
    }

    @Override
    public Phone createPhone() {
        return new FeaturePhone(releaseYear,phoneName,screenSize,batterymAh,sims,isSmart,weight,color,network);
    }

}
