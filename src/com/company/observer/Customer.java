package com.company.observer;

import com.company.abstractFactory.FeaturePhone;
import com.company.abstractFactory.Phone;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer implements Interested{
    private final String username;
    private boolean received;
    private Phone phoneReceived;
    public String getUsername() {
        return username;
    }

    public Phone getPhoneReceived() {
        return phoneReceived;
    }

    public Customer(String username) {
        this.username = username;
    }


    public boolean hasReceived() {
        return received;
    }

    @Override
    public void update(List<Phone> phones) {
        if (!phones.isEmpty()){
            String phonetype = phones.get(0).isSmart() ? "Smart" : "Feature";
            System.out.println("\nHey " + username + "! New " + phonetype + " phones in Stock: ");
            for (Phone phone : phones) {
                //System.out.printf(phone.toString()+"\n");
            }
        }else{
            System.out.println("\nSorry "+username+"... There are no phones currently in Stock...");
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
            phoneReceived = phone;
        }
        else {
            received = false;
            phoneReceived = null;
        }

        return received;
    }

    @Override
    public void performAction(Phone phone) {
        if (phone.isSmart()) System.out.println("Taking a picture with flash...\n\n");
        else System.out.println("Calling 911...\n\n");
    }
}
