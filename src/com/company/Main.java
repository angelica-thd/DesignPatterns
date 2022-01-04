package com.company;

import com.company.abstractFactory.*;
import com.company.observer.Customer;
import com.company.observer.InterestedCustomer;
import com.company.singleton.Singleton;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("How many phones are in Stock?");
        Scanner scanner = new Scanner(System.in);
        int numOfPhones = scanner.nextInt();
        System.out.println("How many customers want to buy a new phone?");
        int numOfCustomers = scanner.nextInt();

        Singleton shop = Singleton.getInstance();
        Map<String,List<Phone>> phones = shop.instantiateShop(numOfPhones,numOfCustomers);

        List<Phone> smartPhones = phones.get("smart");
        List<Phone> featurePhones = phones.get("feature");

        List<Phone> phonesBought = new ArrayList<>();
        List<Customer> customersNotReceived = new ArrayList<>();
        //here create more customers -> should be n phones and m customers
        System.out.println("Let's notify the customers...\n");
        for(int i = 0; i< numOfCustomers; i++){
            InterestedCustomer ic = new InterestedCustomer();
            Customer c = new Customer("user"+ i);
            ic.subscribe(c);
            ic.notifySubscribers(smartPhones,featurePhones);
            if (c.hasReceived()) {
                ic.unsubscribe(c);
                phonesBought.add(c.getPhoneReceived());
                if(smartPhones.contains(c.getPhoneReceived())) smartPhones.remove(c.getPhoneReceived());
                if(featurePhones.contains(c.getPhoneReceived())) featurePhones.remove(c.getPhoneReceived());
            }
            else customersNotReceived.add(c);

        }
        System.out.println("\n\nCUSTOMERS THAT DIDN'T RECEIVE A PHONE");
        if(!customersNotReceived.isEmpty()){
            System.out.println(customersNotReceived.size());
            for (Customer c: customersNotReceived){
                System.out.println(c.getUsername());
            }
        }else System.out.println("none");

        System.out.println("PHONES BOUGHT");
        if(!phonesBought.isEmpty()){
            System.out.println(phonesBought.size());
            for (Phone p: phonesBought){
                System.out.println(p.getPhoneName());
            }
        }else System.out.println("none");


    }
}
