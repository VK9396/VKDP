package com.itsp.stdp;

public class Printer {
	 
 
	public static class InnerPrinter{
		private static volatile Printer INSTANCE = new Printer();
	}
	
	public static Printer getInstance() {
		return InnerPrinter.INSTANCE;
	}

	public void getMsg(String msg) {
		System.out.println(msg);
	}
}
