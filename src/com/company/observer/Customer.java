package com.company.observer;

import com.company.abstractFactory.FeaturePhone;
import com.company.abstractFactory.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer implements Interested{
    private final String username;
    private final boolean interestedInSmart;
    private boolean received;
    public String getUsername() {
        return username;
    }

    public boolean isInterestedInSmart() {
        return interestedInSmart;
    }

    public Customer(String username, boolean interestedInSmart) {
        this.username = username;
        this.interestedInSmart= interestedInSmart;
    }


    public boolean hasReceived() {
        return received;
    }

    @Override
    public void update(List<Phone> phones) {
        String phonetype =  phones.get(0).isSmart() ? "Smart" : "Feature";
        System.out.println("Hey "+username+"! New "+phonetype+" phones in Stock: ");
        for (Phone phone:phones) {
            //System.out.printf(phone.toString()+"\n");


        }
    }

    @Override
    public boolean interestedIn(Phone phone) {
        String yn =  new Random().nextBoolean() ? "Yes" : "No";
        String phonetype =  phone.isSmart() ? "Smart" : "Feature";
        System.out.println("Are you interested in this phone "+phone.getPhoneName()+ "? (y/n) "+yn);

        if(yn.contains("Y")){
            System.out.println("Do you want to buy this phone " +phone.getPhoneName()+ "? (y/n) "+yn);
            System.out.println("Perform an action with your new "+ phonetype+" phone");
            performAction(phone);
            received = true;
        }
        else received = false;

        return received;
    }

    @Override
    public void performAction(Phone phone) {
        if (phone.isSmart()) System.out.println("Taking a picture...");
        else System.out.println("Calling 911...");
    }
}
