package com.gentech.inheritance1;

class librarydetails {
	String libraryname;

	void show() 
	{
		System.out.println("Library name:" + libraryname);
	}
}

class bookdetails extends librarydetails 
{
	String libraryname;

	bookdetails(String libraryname, String bookname) 
	{
		super.libraryname =libraryname;
		this. libraryname = bookname;
	}

	void show2() {
		System.out.println("Book name:" +  libraryname);
	}

}

class magnizedetails extends bookdetails 
{
	String  libraryname;

	magnizedetails(String libraryname, String bookname, String magnizename) 
	{
		super(libraryname,bookname);
		this. libraryname = magnizename;
	}

	void show3() {
		System.out.println("Magnize name:" + libraryname);
	}

}

public class Assignment2 {
	public static void main(String[] args) {
		magnizedetails o = new magnizedetails("state library", "magudi days", "tech");
		o.show();
		o.show2();
		o.show3();

	}

}


