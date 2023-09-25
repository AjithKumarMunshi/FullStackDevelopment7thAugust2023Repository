package com.gentech.paramertized;

class Desktop 
{
    String brand;
    String model;
    int ramSizeGB;
    String isSSDSupported;

     Desktop(String brand, String model, int ramSizeGB, String isSSDSupported) {
        
        System.out.println("Brand:" + brand);
        System.out.println("model no.:" + model);
        System.out.println("ramSize:" + ramSizeGB + " GB");
        System.out.println("Is this SSD supported:" + isSSDSupported);
        System.out.println("++++++++++++++++++++++");
    }
}

class Laptop 
{
    String brand;
    String model;
    double screenSizeInches;
    int batteryCapacity;

   Laptop(String brand, String model, double screenSizeInches, int batteryCapacity) {
        
        System.out.println("Brand:" + brand);
        System.out.println("Model:" + model);
        System.out.println("Screen Size:" + screenSizeInches + " inches");
        System.out.println("Battery capacity:" + batteryCapacity);
        System.out.println("++++++++++++++++++++++");
    }
}

class Mobile
{
    String brand;
    String model;
    String operatingSystem;
    String isMobileDataEnabled;

     Mobile(String brand, String model, String operatingSystem, String isMobileDataEnabled) {
        
        System.out.println("Brand:" + brand);
        System.out.println("Model :" + model);
        System.out.println("OS :" + operatingSystem);
        System.out.println("Is the MobileData enabled:" + isMobileDataEnabled);
    }
}

public class DesktopLaptopMobileParametrized {

    public static void main(String[] args) {
        Desktop D = new Desktop("Dell", "S320", 128, "yes");
        Laptop L = new Laptop("HP", "S20", 14.5, 8000);
        Mobile M = new Mobile("Realme", "realme 10pro", "Android", "No");
    }
}














