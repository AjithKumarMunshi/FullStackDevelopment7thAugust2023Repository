package com.gentech.inheritance1;

class library1a
{
	void libraryname(String name)
	{
		System.out.println("library name:"+name);
	}
}
class book1a extends library1a
{
	book1a(String bookname)
	{
		super.libraryname(bookname);
	}
	
	void libraryname(String bookname2)
	{
		System.out.println("Book name:"+ bookname2);
	}
}
class magnize1a extends book1a
{
	magnize1a(String mname)
	{
		super(mname);
		super.libraryname(mname);	
		
	}
	void libraryname(String location)
	{
		System.out.println("Location name:"+location);
	}
}
public class Asg1 {

	public static void main(String[] args) {
		magnize1a o=new magnize1a("magudi days");
		o.libraryname("Core Java");
		
	}

}


