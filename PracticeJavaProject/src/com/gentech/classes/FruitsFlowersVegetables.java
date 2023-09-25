package com.gentech.classes;

class Fruit{
	String FruitName;
	String taste;
	String FruitColor;
	int NoOfyearstoGrow;

}
class Flower{
	String FlowerName;
	String FlowerColor;
	int Petals;
	String scientificName;
}
class Vegetable{
	String vegName;
	String scientificName;
	String Color;
	int NoOfyearstoGrow;
}
public class FruitsFlowersVegetables{

	public static void main(String[] args) {
		Fruit fru=new Fruit();
		fru. FruitName="Apple";
		fru.taste="sweet";
		fru.FruitColor="Red";
		fru.NoOfyearstoGrow=2;
		System.out.println("FruitName:"+fru. FruitName);
		System.out.println("taste:"+fru.taste);
		System.out.println("FruitColor:"+fru.FruitColor);
		System.out.println("No of Years to Grow:"+fru.NoOfyearstoGrow);
		System.out.println("----------------------");

		Flower flo=new Flower();
		flo.FlowerName="Rose";
		flo.FlowerColor="Red";
		flo.Petals=5;
		flo.scientificName="Rosa";
		System.out.println("FlowerName:"+flo.FlowerName);
		System.out.println("FlowerColor:"+flo.FlowerColor);
		System.out.println("Petals:"+flo.Petals);
		System.out.println("scientificName:"+flo.scientificName);

		System.out.println("----------------------");
		Vegetable veg=new Vegetable();
		veg.vegName="Carrot";
		veg.scientificName="Daucus carota";
		veg.Color="Orange";
		veg.NoOfyearstoGrow=6;
		System.out.println("VegName:"+veg.vegName);
		System.out.println("scientificName:"+veg.scientificName);
		System.out.println("Color:"+veg.Color);
		System.out.println("NoOfyearstoGrow:"+veg.NoOfyearstoGrow);

	}

}


