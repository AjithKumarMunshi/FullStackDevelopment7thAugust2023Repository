package com.gentech.classes;
class Country
{
	String CountryName;
	String CountryCaptial;
	String NationalFlower;
	int Countrycode;

}  

class State
{
	String StateName;
	String StateCaptial;
	String StateZone;
	int StateCount;
}

class District
{
	String DistrictName;
	String StateName;
	String DistrictTaluk;
	int DistrictCode;
}
public class CountryStateDistrict {

	public static void main(String[] args) {

		Country ind= new Country();
		ind.CountryName="India";
		ind.CountryCaptial="Delhi";
		ind.NationalFlower="LOTUS";
		ind.Countrycode=91;
		System.out.println("CountryName:"+ind.CountryName);
		System.out.println("CountryCaptial:"+ind.CountryCaptial);
		System.out.println("NationalFlower:"+ind.NationalFlower);
		System.out.println("Countrycode:"+ind.Countrycode);
		System.out.println("----------------------");

		State KA=new State();
		KA.StateName="Karnataka";
		KA.StateCaptial="Bangalore";
		KA.StateZone="SouthZone";
		KA.StateCount=80000000;

		System.out.println("StateName:"+ KA.StateName);
		System.out.println("StateCaptial="+ KA.StateCaptial);
		System.out.println("StateZone:"+ KA.StateZone);
		System.out.println("StateCount:"+ KA.StateCount);
		System.out.println("-----------------------");

		District ST= new District();
		ST.DistrictName="Raichur";
		ST.StateName="Karnataka";
		ST.DistrictTaluk="Sindhanur taluk";
		ST.DistrictCode=584128;
		System.out.println("DistrictName:"+ST.DistrictName);
		System.out.println("StateName:"+ST.StateName);
		System.out.println("DistrictTaluk:"+ST.DistrictTaluk);
		System.out.println("DistrictCode:"+ST.DistrictCode);

	}

}







