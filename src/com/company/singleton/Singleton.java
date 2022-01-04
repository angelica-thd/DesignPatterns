package com.company.singleton;

import com.company.abstractFactory.FeaturePhoneFactory;
import com.company.abstractFactory.Phone;
import com.company.abstractFactory.PhoneFactory;
import com.company.abstractFactory.SmartPhoneFactory;

import java.text.DecimalFormat;
import java.util.*;

public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton(){
        if (instance!=null)
            throw new IllegalStateException("There is already an instance of the shop!");
    }
    public static Singleton getInstance(){
        System.out.println("SINGLETON SHOP INSTANCE");
        return instance;
    }

    public Map<String,List<Phone>> instantiateShop(int numOfPhones, int numOfCustomers){
        Map<String,List<Phone>> phones = new HashMap<>();
        List<Phone> smartPhones = new ArrayList<Phone>();
        List<Phone> featurePhones = new ArrayList<Phone>();

        DecimalFormat df = new DecimalFormat("0.00");
        int[] years = {2018,2019,2020,2021};
        String[] colors = {"Black","Blue","Space Gray","White"};
        String[] networks = {"G","2G","3G","4G","5G","LTE"};

        String[] os = {"Android","iOS","Chrome OS"};
        String[] sensor = {"Accelerometer","Proximity","Barometer","Gyroscope","Compass","Face ID","Light Sensor","Fingerprint"};
        String[] processors = {"1+3+4","4+4","2+6","2+2+4"};
        String[] processorModel = {"Kirin","Snapdragon","Snapdragon Qualcomm","Exynos Octa","Exynos"};
        String[] backCam = {"12.2MP","2MP+20MP","2MP+2MP+48MP+8MP","5MP+2MP+64MP+8MP"};
        int[] frontCam = {16,20,8};
        int[] storage = {32,64,128};
        int[] ram = {2,4,6,8};


        for (int i= 0; i<=numOfPhones; i++){
            int sBattery = new Random().nextInt(7000-3000) + 3000;
            int fBattery = new Random().nextInt(1000-400) + 400;
            int fweight = new Random().nextInt(50) + 50;
            int sweight = new Random().nextInt(150) + 150;
            double sscreen =  Double.parseDouble(df.format(4.5 + (8 - 4.5) * new Random().nextDouble()));
            double fscreen =  Double.parseDouble(df.format(1.5 + (1.5) * new Random().nextDouble()));
            double sProcessorFreq = Double.parseDouble(df.format(3.2 + (1.7) * new Random().nextDouble()));


            Phone featurePhone = PhoneFactory.createPhone(
                    new FeaturePhoneFactory(
                            years[new Random().nextInt(years.length-1)],
                            UUID.randomUUID(),
                            fscreen,
                            fBattery,
                            new Random().nextInt(2)+1,
                            false,
                            fweight,
                            colors[new Random().nextInt(colors.length-1)],
                            networks[new Random().nextInt(1)]));
            featurePhones.add(featurePhone);


            List<String> sensors = new ArrayList<>();
            for (int s = 0; s<= new Random().nextInt(sensor.length)+3; s++){
                String item = sensor[new Random().nextInt(sensor.length-1)];
                if (!sensors.contains(item)) { sensors.add(item); }
            }
            Phone smartPhone = PhoneFactory.createPhone(
                    new SmartPhoneFactory(
                            years[new Random().nextInt(years.length-1)],
                            storage[new Random().nextInt(storage.length-1)],
                            UUID.randomUUID(),
                            sscreen,
                            sProcessorFreq,
                            sBattery,
                            ram[new Random().nextInt(ram.length-1)],
                            new Random().nextInt(1)+1,
                            true,
                            sweight,
                            colors[new Random().nextInt(colors.length-1)],
                            networks[new Random().nextInt((networks.length-1)/2)+2],
                            os[new Random().nextInt(os.length-1)],
                            processors[new Random().nextInt(processors.length-1)],
                            processorModel[new Random().nextInt(processorModel.length-1)],
                            backCam[new Random().nextInt(backCam.length-1)],
                            frontCam[new Random().nextInt(frontCam.length-1)],
                            sensors,
                            new Random().nextBoolean(),
                            new Random().nextBoolean())
            );

            smartPhones.add(smartPhone);
        }
        phones.put("smart",smartPhones);
        phones.put("feature",featurePhones);
        return phones;
    }
}
