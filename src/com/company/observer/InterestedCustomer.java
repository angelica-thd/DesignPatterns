package com.company.observer;

import com.company.abstractFactory.Phone;

import java.util.ArrayList;
import java.util.List;

public class InterestedCustomer {
    private List<Interested> subscribers = new ArrayList<>();


    public void subscribe(Interested interested){
        subscribers.add(interested);
    }
    public void unsubscribe(Interested interested){
        subscribers.remove(interested);
    }
    public void notifySubscribers(boolean interestedIn, List<Phone> smartPhones, List<Phone> featurePhones ){

        System.out.println("Notifying customers...");
        for (Interested interested: subscribers){
           if(interestedIn) interested.update(smartPhones);
           else interested.update(featurePhones);
        }
    }

}
