package com.gentech.abstractclass;

abstract class MultiLevelOverloading
{
	MultiLevelOverloading(String empname) 
	{
		System.out.println("Employess name :"+ empname);
				
	}
	MultiLevelOverloading(int id)
	{
		System.out.println("Employee id : "+id);
	}
}

class MultiLevelOverloading1 extends MultiLevelOverloading
{
	MultiLevelOverloading1(String empname)
	{
		super(empname);
	}
	MultiLevelOverloading1(int id)
	{
		super(id);
	}
	void value1()
	{
		System.out.println(" TATA company");
	}
  }

class MultiLevelOverloading2 extends MultiLevelOverloading1
{
	MultiLevelOverloading2(String empname)
	{
		super(empname);
	}

	MultiLevelOverloading2(int id)
	{
		super(id);
	}
}
public class Asg8 {

	public static void main(String[] args) {
		MultiLevelOverloading2 obj1 = new MultiLevelOverloading2("Rahul");
		MultiLevelOverloading2 obj2 = new MultiLevelOverloading2(777);
	}

}






