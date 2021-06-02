package com.itsp.stdp;

public class Printer {
	
	 //private static  Printer INSTANCE = new Printer() ;// egar Instantiation


	private static Printer INSTANCE ;// MultiThreading evr...
	
	private Printer() {
		System.out.println("private 0-arg Constructor");
	}
	
	public static Printer getInstance() {
		/*singletone logic
		if(INSTANCE==null)
			INSTANCE = new Printer();
		 return  INSTANCE;
		*/
		
		//return INSTANCE;
		
		/* MultiThreading*/
		if(INSTANCE==null)
			INSTANCE = new Printer();
		 return  INSTANCE;
		
		
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}

}
