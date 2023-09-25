package com.gentech.constructoroverloading;
class college
{
	college(String collegeName,int rollno)

	{
		System.out.println("College Name:"+collegeName);

		System.out.println("Roll no:"+rollno);
		System.out.println("++++++++++++++++++");
	}
	college( String branch,String USN)
	{
		System.out.println("Branch:"+branch);
		System.out.println("USN:"+USN);
	}
}


public class CollegeDemo {

	public static void main(String[] args) {
		college ch=new college("BITM",9);

		college vh=new college("EEE","3BR19EE003");
	}

}


