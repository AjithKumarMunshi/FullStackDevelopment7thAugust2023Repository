package com.gentech.programs;

public class TrafficSignal {

	public static void main(String[] args) {
		String signal=args[0];
	       switch (signal)
	       {
	       case "red":
	    	   System.out.println("stop the vehicle");
	    	   break;
	       case "orange":
	    	   System.out.println("get ready to move");
	    	   break;
	       case "green":
	    	   System.out.println("lets move your vehicle");
	    	   break;
	    default:
	    	System.out.println("there is signal issue");
	       }

	}

}
