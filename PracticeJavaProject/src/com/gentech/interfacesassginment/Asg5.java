package com.gentech.interfacesassginment;
// Hierachy level

interface Library5 
{
	void displayLibraryName(String name);
}

interface LibraryWithID extends Library5 
{
	void displayLibraryID(int id);
}

interface Author extends Library5
{
	void displayAuthorName(String name);
}

class Hierarchy implements LibraryWithID, Author 
{
	public void displayLibraryName(String name)
	{
		System.out.println("Library Name: " + name);
	}

	public void displayLibraryID(int id) 
	{
		System.out.println("Library ID: " + id);
	}

	public void displayAuthorName(String name) 
	{
		System.out.println("Author Name: " + name);
	}
}

public class Asg5 {
	public static void main(String[] args) {
		Hierarchy obj = new Hierarchy();

		obj.displayLibraryName("Central Library");
		System.out.println("-----------------------------------");

		obj.displayLibraryID(777);
		System.out.println("-----------------------------------");

		obj.displayAuthorName("R.K. Narayan");
		System.out.println("-----------------------------------");
	}
}





