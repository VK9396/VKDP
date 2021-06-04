package com.itsp.test;

import com.itsp.stdp.Printer;

public class CloingProcessTest {
     public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		
		//do cloing on object
		try {
		   Printer p2 = (Printer)p1.clone();
		   System.out.println("Cloned Object Is Created");
		   System.out.println(p1.hashCode() +"---"+p2.hashCode());
		   System.out.println(p1==p2);
		   
		}catch(CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
