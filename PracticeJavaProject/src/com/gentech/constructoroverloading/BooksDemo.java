package com.gentech.constructoroverloading;

class books
{
	books(String bookName,int bookid)

	{
		System.out.println("Book Name:"+bookName);
        System.out.println("Book ID:"+bookid);
		System.out.println("+++++++++++++++");
	}
	books( String bookAuthor,String bookorigin)
	{
		System.out.println("Book Author:"+bookAuthor);
		System.out.println("Book Origin:"+bookorigin);
	}
}



public class BooksDemo {

	public static void main(String[] args) {
		books bk=new books("Malgudi days",111);

		books bs=new books("R.K.Narayan","India");
	}

}







