package com.shiddiq;

public class AbstractDemo {

	public static void main(String [] args){
		Salary s = new Salary("Muh Shiddiq","Bandung , BDG",3,3600.00);
		Employee e = new Salary("Amerit","Balikpapan , BPN",2,6600.00);
			
		  System.out.println("Call mailCheck using Salary reference --");
	      s.mailCheck();

	      System.out.println("\n Call mailCheck using Employee reference--");
	      e.mailCheck();
		
	}
}
