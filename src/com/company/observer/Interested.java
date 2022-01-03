package com.company.observer;

import com.company.abstractFactory.Phone;

import java.util.List;

public interface Interested {
    public void update(List<Phone> phones);
    public boolean interestedIn(Phone phone);
    public void performAction(Phone phone);

}
