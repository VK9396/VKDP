package com.itsp.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.itsp.stpd.Printer;

public class DeserializationTest {
	public static void main(String[] args) {
		try {
		 
		 //recreat object having data collected from the file using Deserializatino process
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("printer_data.ser"));
			 
	     	Printer  p2 = (Printer)ois.readObject();
		    p2.msg("HI");
			System.out.println(p2.hashCode() );
			ois.close();
			System.out.println("DeSerialization is done");
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------------------------");
		try {
			 
			 //recreat object having data collected from the file using Deserializatino process
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("printer_data.ser"));
				 
		     	Printer  p3 = (Printer)ois.readObject();
			    p3.msg("HI");
				System.out.println(p3.hashCode() );
				ois.close();
				System.out.println("DeSerialization is done");
			}catch(IOException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
	}
}
