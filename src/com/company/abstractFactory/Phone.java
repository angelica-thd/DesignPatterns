package com.company.abstractFactory;

import java.util.UUID;

public abstract class Phone {
    public abstract UUID getPhoneName();
    public abstract int getBatterymAh();
    public abstract int getReleaseYear();
    public abstract double getScreenSize();
    public abstract int getSIMSlots();
    public abstract boolean isSmart();

    @Override
    public String toString() {
        String phonetype =  isSmart() ? "SmartPhone" : "FeaturePhone";
        return "Phone: "+getPhoneName()+"\n"
                + "Phone Type: "+ phonetype +"\n"
                + "SIM slots: "+getSIMSlots()+"\n"
                + "Battery mAh: "+getBatterymAh()+"\n"
                + "Screen Size: "+getScreenSize()+ "\\\" \n"
                + "Release Year: "+getReleaseYear()+"\n";
    }
}
