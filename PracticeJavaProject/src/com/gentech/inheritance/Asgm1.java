package com.gentech.inheritance;

class library2
{
	String libraryname;
	String location;

	void show()
	{
		System.out.println("book name :"+libraryname);
		System.out.println("location name :"+location);
		
	}
}
	
	class book2 extends library2
	{
		book2( String bookname)
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
		book2 o=new book2("java");
		o.location="sindhanur";
		o.libraryname="state library";
		o.show();
		o.display();

	}

}

