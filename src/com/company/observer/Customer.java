package com.company.observer;

import com.company.abstractFactory.FeaturePhone;
import com.company.abstractFactory.Phone;

import java.util.List;

public class Customer implements Interested{
    private final String username;
    private final boolean interestedInSmart;

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


    @Override
    public void update(List<Phone> phones) {
        String phonetype =  phones.get(0).isSmart() ? "Smart" : "Feature";
        System.out.println("Hey "+username+"! New "+phonetype+" phones in Stock: ");
        for (Phone phone:phones) {
            System.out.printf(phone.toString()+"\n");

        }
    }




}
