package com.company.abstractFactory;

import java.util.List;
import java.util.UUID;

public class SmartPhone extends Phone{
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

    public SmartPhone(int releaseYear, int storage, UUID phoneName, double screenSize, double processorFreq, int batterymAh, int ram, int sims, boolean isSmart,double weight, String color, String network, String OS, String processors, String processorModel, String backCamPixels, int frontCamPixels, List<String> sensors, boolean waterResistant, boolean dustResistant) {
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
    public String toString() {
        return super.toString()
                +"OS: "+getOS()+"\n"
                +"Network: "+getNetwork()+"\n"
                +"Storage: "+getStorage()+" GB\n"
                +"Processors: "+getProcessors()+"\n"
                +"Processor Model: "+getProcessorModel()+"\n"
                +"Processor Frequency: "+getProcessorFreq()+"\n"
                +"Back Camera(s) Pixels: "+getBackCamPixels()+"\n"
                +"Front Camera Pixels: "+getFrontCamPixels()+"\n"
                +"Water Resistant: "+isWaterResistant()+"\n"
                +"Dust Resistant: "+isDustResistant()+"\n"
                +"Other Sensors: "+getSensors()+"\n"
                +"Weight: "+getWeight()+" gr\n"
                +"Color: "+getColor()+"\n";
    }

    @Override
    public int getReleaseYear() {
        return releaseYear;
    }

    public int getStorage() {
        return storage;
    }

    @Override
    public UUID getPhoneName() {
        return phoneName;
    }

    @Override
    public double getScreenSize() {
        return screenSize;
    }


    public int getRam() {
        return ram;
    }

    public int getSims() {
        return sims;
    }

    @Override
    public boolean isSmart() {
        return isSmart;
    }
    public double getProcessorFreq() {
        return processorFreq;
    }

    @Override
    public int getBatterymAh() {
        return batterymAh;
    }

    public int getRAM() {
        return ram;
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

    public String getOS() {
        return OS;
    }

    public String getProcessors() {
        return processors;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public String getBackCamPixels() {
        return backCamPixels;
    }

    public int getFrontCamPixels() {
        return frontCamPixels;
    }

    public List<String> getSensors() {
        return sensors;
    }

    public boolean isWaterResistant() {
        return waterResistant;
    }

    public boolean isDustResistant() {
        return dustResistant;
    }
}
