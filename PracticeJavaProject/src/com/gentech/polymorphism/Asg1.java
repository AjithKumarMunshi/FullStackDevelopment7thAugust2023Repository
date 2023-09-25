package com.gentech.polymorphism;

abstract class GenericMovie
{
	abstract void play();
}

class ActionMovie extends GenericMovie
{   
	void play() 
	{
		System.out.println("KGF Action Movie");
	}
}

class ComedyMovie extends GenericMovie 
{
	void play() 
	{
		System.out.println("victory Comedy Movie");
	}
}

class DramaMovie extends GenericMovie 
{
	void play()
	{
		System.out.println("Jolly days Drama Movie");
	}
}

public class Asg1 {
	public static void main(String[] args) {

		GenericMovie play = null;

		GenericMovie actionMovie = new ActionMovie();
		GenericMovie comedyMovie = new ComedyMovie();
		GenericMovie dramaMovie = new DramaMovie();

		play=actionMovie;
		play.play(); 

		play=comedyMovie;
		play.play();

		play=dramaMovie;
		play.play();  
		
	}

}



