package com.company.abstractFactory;

public class PhoneFactory {
    public static Phone createPhone(PhoneAbstractFactory factory){
        return factory.createPhone();
    }

}
