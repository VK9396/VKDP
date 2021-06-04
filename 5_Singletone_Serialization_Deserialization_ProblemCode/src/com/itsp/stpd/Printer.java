package com.itsp.stpd;

import java.lang.invoke.VolatileCallSite;

import com.itsp.commons.CommonsUtils;

public class Printer extends CommonsUtils {
	
	private Printer(){
		System.out.println("Printer -:: 0-args Constructor");
	}
	
	public static class InnerPrinter{
		private static volatile Printer INSTANCE = new Printer();
	}
	
	//factory Method
	public static Printer getInstance() {
		return InnerPrinter.INSTANCE;
	}
	@Override
	public  Object clone() throws CloneNotSupportedException {
	//  throw new CloneNotSupportedException("Cloing NOt allowing in singloeton printer class");
	return InnerPrinter.INSTANCE;
	}
	
	//b.method
	public void msg(String msg) {
		System.out.println(msg);
	}
	

}
