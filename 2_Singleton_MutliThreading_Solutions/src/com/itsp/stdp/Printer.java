package com.itsp.stdp;

public class Printer {
	
 

	private static volatile Printer INSTANCE ;// MultiThreading evr...
	
	private Printer() {
		System.out.println("private 0-arg Constructor");
	}
	
	 	/*static  factory method
	//2. using static factory method as synchronized method but(littl bad approac)
	public synchronized static   Printer  getInstance() {
		 //singleton logic
		  if(INSTANCE==null)
			  INSTANCE=new Printer();
		  
		  return INSTANCE;
	}  //method 
*/
/*	
	// 3. taking synchronized block inside static factory Method (good approc) for singleton
	public static Printer getInstance() {
		synchronized (Printer.class) {
			System.out.println("inside synchronized Block");
			if(INSTANCE==null)
				INSTANCE = new Printer();
			return INSTANCE;
		}
		
	}
	
*/
	
public static Printer getInstance() {
	if(INSTANCE==null) {
		 System.out.println("inside if");
		synchronized(Printer.class) {
			System.out.println("insid synch");
			if(INSTANCE==null) { 
				System.out.println("insid nested if");
				INSTANCE = new Printer();
			}
		}
	}
		return INSTANCE;
		 
	 
}
//	//static  factory method
//			public  static   Printer  getInstance() {
//				 if(INSTANCE==null) { //1st NULL check	
//					synchronized(Printer.class) {
//					 //singleton logic
//					  if(INSTANCE==null)  //2nd NULL check
//						  INSTANCE=new Printer();
//					}
//				}
//					  return INSTANCE;
//				}  //method 

	
	 
	
	public void print(String msg) {
		System.out.println(msg);
	}

}
