package com.itsp.stdp;

public class Printer {
	
	private static  Printer INSTANCE  ;
	
	private Printer() {
		
	}
	
	public static Printer getInstance() {
		//singletone logic
		if(INSTANCE==null)
			INSTANCE = new Printer();
		 return  INSTANCE;
		
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}

}
