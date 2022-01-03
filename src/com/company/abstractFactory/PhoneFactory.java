package com.company.abstractFactory;

public class PhoneFactory {
    public static Phone getPhone(PhoneAbstractFactory factory){
        return factory.createPhone();
    }
}
