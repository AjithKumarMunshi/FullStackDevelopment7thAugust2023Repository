package com.gentech.inheritance1;

class library21
{
	String libraryname;
	String location;

	void show()
	{
		System.out.println("book name :"+libraryname);
		System.out.println("location name :"+location);
		
	}
}
	
	class book21 extends library21
	{
		book21( String bookname)
		{
			super.libraryname=bookname;
		}
	
		String libraryname;
		void display()
		{
			System.out.println("library name :"+libraryname);
		}}

	public class Asgm1 {

	public static void main(String[] args) {
		book21 o=new book21("java");
		o.location="sindhanur";
		o.libraryname="state library";
		o.show();
		o.display();

	}

}

