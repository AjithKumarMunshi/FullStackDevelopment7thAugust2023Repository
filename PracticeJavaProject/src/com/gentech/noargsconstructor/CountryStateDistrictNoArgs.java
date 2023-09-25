package com.gentech.noargsconstructor;

class Country

{
	String CountryName;
	String CountryCaptial;
	String NationalFlower;
	int Countrycode;

	{
		
		CountryName="India";
		CountryCaptial="Delhi";
		NationalFlower="LOTUS";
		Countrycode=91;
		System.out.println("CountryName:"+CountryName);
		System.out.println("CountryCaptial:"+CountryCaptial);
		System.out.println("NationalFlower:"+NationalFlower);
		System.out.println("Countrycode:"+Countrycode);
		System.out.println("----------------------");
	}
}


class State
{
	String StateName;
	String StateCaptial;
	String StateZone;
	int StateCount;
	{
		StateName="Karnataka";
		StateCaptial="Bangalore";
		StateZone="SouthZone";
		StateCount=80000000;

		System.out.println("StateName:"+ StateName);
		System.out.println("StateCaptial="+ StateCaptial);
		System.out.println("StateZone:"+ StateZone);
		System.out.println("StateCount:"+ StateCount);
		System.out.println("-----------------------");
	}
}

class District
{
	String DistrictName;
	String StateName;
	String DistrictTaluk;
	int DistrictCode;
	{
		DistrictName="Raichur";
		StateName="Karnataka";
		DistrictTaluk="Sindhanur taluk";
		DistrictCode=584128;
		System.out.println("DistrictName:"+DistrictName);
		System.out.println("StateName:"+StateName);
		System.out.println("DistrictTaluk:"+DistrictTaluk);
		System.out.println("DistrictCode:"+DistrictCode);

	}
}

public class CountryStateDistrictNoArgs{

	public static void main(String[] args) {

		Country ind= new Country();
		

		State KA=new State();
		
		District ST= new District();
		

	}

}


