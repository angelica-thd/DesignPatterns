package com.company.abstractFactory;

import java.util.UUID;

public class FeaturePhone extends Phone{
    private final int releaseYear;
    private final UUID phoneName;
    private final double screenSize;
    private final int batterymAh;
    private final int sims;
    private final boolean isSmart;
    private final double weight;
    private final String color;
    private final String network;

    public FeaturePhone(int releaseYear, UUID phoneName, double screenSize, int batterymAh, int sims, boolean isSmart, double weight, String color, String network) {
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
    public String toString() {
        return super.toString()
                +"Network: "+getNetwork()+"\n"
                +"Weight: "+getWeight()+" gr\n"
                +"Color: "+getColor()+"\n";
    }
    @Override
    public int getReleaseYear() {
        return releaseYear;
    }
    @Override
    public UUID getPhoneName() {
        return phoneName;
    }

    @Override
    public double getScreenSize() {
        return screenSize;
    }

    public int getSims() {
        return sims;
    }

    @Override
    public boolean isSmart() {
        return isSmart;
    }


    @Override
    public int getBatterymAh() {
        return batterymAh;
    }


    public int getSIMSlots() {
        return sims;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public String getNetwork() {
        return network;
    }
}
