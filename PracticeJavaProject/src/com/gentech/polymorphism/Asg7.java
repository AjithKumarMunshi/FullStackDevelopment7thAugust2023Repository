package com.gentech.polymorphism;
interface Libraryname 
{
	void showLibraryName(String name);
}

interface Libraryid extends Libraryname 
{
	void showLibraryId(int id);
}

interface Bookname extends Libraryid 
{
	void showBookName(String name);
}

class Librarydetails implements Bookname 
{
	public void showLibraryName(String name) 
	{
		System.out.println("Library Name: " + name);
	}

	public void showLibraryId(int id) 
	{
		System.out.println("Library ID: " + id);
	}

	public void showBookName(String name)
	{
		System.out.println("Book Name: " + name);
	}
}

public class Asg7 {
	public static void main(String[] args) {
		Librarydetails o = new Librarydetails();
		o.showLibraryName("Central library");
		o.showLibraryId(777);
		o.showBookName("Malgudi Days");
	}
}





