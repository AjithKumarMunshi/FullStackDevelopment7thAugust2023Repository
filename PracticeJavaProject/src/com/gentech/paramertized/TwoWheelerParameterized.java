package com.gentech.paramertized;

class TwoWheeler {
    String bikeName;
    String bikeModel;
    String bikeColor;
    String mileage;
    float price;
    int bikeNo;

    TwoWheeler(String name, String model, String color, String mileage, float price, int bikeNo) {
        

        System.out.println("BikeName:" + name);
        System.out.println("BikeModel:" + model);
        System.out.println("BikeColor:" +color);
        System.out.println("Mileage:" + mileage);
        System.out.println("Price:" + price);
        
        System.out.println("BikeNo:" + bikeNo);
        System.out.println("--------------------------");
    }
}

class FourWheeler {
    String carName;
    String carModel;
    String carColor;
    String carmileage;
    float price;
    int carNo;

    FourWheeler(String cname, String cmodel, String ccolor, String carm, float price, int carNo) {
        

        System.out.println("CarName:" + cname);
        System.out.println("CarModel:" + cmodel);
        System.out.println("CarColor:" + ccolor);
        System.out.println("carMileage:" +carm);
        System.out.println("Price:" + price);
        
        System.out.println("CarNo:" + carNo);
        System.out.println("--------------------------");
    }
}

class HeavyWheeler {
    String vehName;
    String brandName;
    String loadCapacity;
    String mileage;
    float price;
    int vehNo;

    HeavyWheeler(String hname, String hbrand, String hcapacity, String hmileage, float hprice, int hvehNo)
    {
       

        System.out.println("VehName:" + hname);
        System.out.println("BrandName:" + hbrand);
        System.out.println("LoadCapacity:" + hcapacity);
        System.out.println("Mileage:" + hmileage);
        System.out.println("Price:" + hprice);
        System.out.println("VehNo:" + hvehNo);
    }
}


public class TwoWheelerParameterized {

    public static void main(String[] args) {
        TwoWheeler two = new TwoWheeler("Royal Enfield", "Hunter 350", "Black", "30kmpl", 145000, 9999);
        FourWheeler four = new FourWheeler("BMW", "BMW X1", "White", "20kmpl", 4700000, 8000);
        HeavyWheeler heavy = new HeavyWheeler("Truck", "Eicher", "44Tones", "4kmpl", 700000, 8055);
    }
}










