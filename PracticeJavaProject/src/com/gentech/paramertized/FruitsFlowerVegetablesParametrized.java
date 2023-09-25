package com.gentech.paramertized;

class Fruit {
    String FruitName;
    String taste;
    String FruitColor;
    int NoOfyearstoGrow;

    Fruit(String name, String taste, String flowercolor, int yearsToGrow) {
        

        System.out.println("FruitName:" + name);
        System.out.println("taste:" + taste);
        System.out.println("FruitColor:" + flowercolor);
        System.out.println("No of Years to Grow:" + yearsToGrow);
        System.out.println("-----------------------");
    }
}

class Flower {
    String FlowerName;
    String FlowerColor;
    int Petals;
    String scientificName;

    Flower(String name, String flowerc, int number, String scientificName) {
        
        System.out.println("FlowerName:" + name);
        System.out.println("FlowerColor:" + flowerc);
        System.out.println("Petals:" + number);
        System.out.println("scientificName:" + scientificName);
        System.out.println("-----------------------");
    }
}

class Vegetable {
    String vegName;
    String scientificName;
    String Color;
    int NoOfyearstoGrow;

    Vegetable(String name, String scientificName, String vegcolor, int yearsToGrow) {
        
        System.out.println("VegName:" + name);
        System.out.println("scientificName:" + scientificName);
        System.out.println("Color:" + vegcolor);
        System.out.println("NoOfyearstoGrow:" + yearsToGrow);
    }
}

public class FruitsFlowerVegetablesParametrized {
    public static void main(String[] args) {
        Fruit fru = new Fruit("Apple", "sweet", "Red", 2);
        Flower flo = new Flower("Rose", "Red", 5, "Rosa");
        Vegetable veg = new Vegetable("Carrot", "Daucus carota", "Orange", 6);
    }
}











