package com.gentech.paramertized;


class country1
{
country1(String cname,String ccaptial,String Nflower,int ccode)	
{
System.out.println("countryname:"+cname);
System.out.println("countrycaptial:"+ccaptial);
System.out.println("nationalflower:"+Nflower);
System.out.println("countrycode:"+ccode);
System.out.println("+++++++++++++++++++");
}
}

class state1
{
state1(String sname,String scaptial,String szone,int scount)	
{
System.out.println("statename:"+sname);
System.out.println("statecaptial:"+scaptial);
System.out.println("statezone:"+szone);
System.out.println("statecount:"+scount);
System.out.println("+++++++++++++++++++");
}
}


class District1
{
District1(String dname,String sname,String dtaluk,int dcode)	
{
System.out.println("Districtname:"+dname);
System.out.println("statename:"+sname);
System.out.println("DistrictTaluk:"+dtaluk);
System.out.println("Districtcode:"+dcode);

}
}

public class CountryStateDistrictParameterizedConstructor {

	public static void main(String[] args) {
		country1 obj1=new country1("india","delhi","lotus",91);
		state1 obj2=new state1("karnataka","bangalore","south",8000000);
		District1 obj3=new District1("raichur","karnataka","sindhanur",584128);

	}

}


