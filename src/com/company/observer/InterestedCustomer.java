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
    public void notifySubscribers(List<Phone> smartPhones, List<Phone> featurePhones ){
        for (Interested interested: subscribers){
            List<Phone> allPhones = new ArrayList<>();
            allPhones.addAll(smartPhones);
            allPhones.addAll(featurePhones);
            interested.update(allPhones);
            for(Phone phone : allPhones){
                if (interested.interestedIn(phone)) break;
            }
        }
    }

}
