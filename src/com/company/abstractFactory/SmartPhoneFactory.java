package com.company.abstractFactory;

import java.util.List;
import java.util.UUID;

public class SmartPhoneFactory implements PhoneAbstractFactory{
    private final int releaseYear;
    private final int storage;
    private final UUID phoneName;
    private final double screenSize;
    private final double processorFreq;
    private final int batterymAh;
    private final int ram;
    private final int sims;
    private final boolean isSmart;
    private final double weight;
    private final String color;
    private final String network;
    private final String OS;
    private final String processors;
    private final String processorModel;
    private final String backCamPixels;
    private final int frontCamPixels;
    private final List<String> sensors;
    private final boolean waterResistant;
    private final boolean dustResistant;

    public SmartPhoneFactory(int releaseYear, int storage, UUID phoneName, double screenSize, double processorFreq, int batterymAh, int ram, int sims,boolean isSmart, double weight, String color, String network, String OS,String processors, String processorModel, String backCamPixels, int frontCamPixels, List<String> sensors, boolean waterResistant, boolean dustResistant) {
        this.releaseYear = releaseYear;
        this.storage = storage;
        this.phoneName = phoneName;
        this.screenSize = screenSize;
        this.processorFreq = processorFreq;
        this.batterymAh = batterymAh;
        this.ram = ram;
        this.sims = sims;
        this.isSmart = isSmart;
        this.weight = weight;
        this.color = color;
        this.network = network;
        this.OS = OS;
        this.processors = processors;
        this.processorModel = processorModel;
        this.backCamPixels = backCamPixels;
        this.frontCamPixels = frontCamPixels;
        this.sensors = sensors;
        this.waterResistant = waterResistant;
        this.dustResistant = dustResistant;
    }

    @Override
    public Phone createPhone() {
        return new SmartPhone(releaseYear,storage,phoneName,screenSize,processorFreq,batterymAh,ram,sims,isSmart,weight,color,network,OS,processors,processorModel,backCamPixels,frontCamPixels,sensors,waterResistant,dustResistant);
    }
}
