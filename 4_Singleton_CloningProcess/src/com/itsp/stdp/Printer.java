package com.itsp.stdp;

import com.itsp.commons.CommonsUtil;

public class Printer  extends CommonsUtil{

	public Printer() {
		System.out.println("Printer :: 0-args Constructor");
	}
	
	public static class InnerPrinter{
		public static volatile Printer INSTANCE = new Printer();
	}
	
	//factory Method
	public static Printer getInstance() {
		return InnerPrinter.INSTANCE;
	}
	
	@Override
	public  Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		//throw new CloneNotSupportedException("Cloing Not allowed in Singleton Printer Class");
	  return InnerPrinter.INSTANCE;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}
	 
}
