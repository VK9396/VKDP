package com.itsp.test;

import com.itsp.stdp.Printer;

public class InnerClassTest {

	public static void main(String[] args) {
		Printer p1 = Printer.getInstance();
		Printer p2 = Printer.getInstance();
		System.out.println(p1.hashCode() +" ---"+p2.hashCode());
		p1.getMsg("Welcome to ITrik Study Park");
		System.out.println(p1==p2);
	}
}
