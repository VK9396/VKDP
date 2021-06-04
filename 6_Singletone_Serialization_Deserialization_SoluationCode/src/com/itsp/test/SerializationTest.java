package com.itsp.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.itsp.stpd.Printer;

public class SerializationTest {
	public static void main(String[] args) {
		try {
			//get singleton java class Ojbject
			Printer p1 = Printer.getInstance();
			Printer p2 = Printer.getInstance();
			//write  object data to file using ObjectInputStream support(Serialization Process)
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("printer_data.ser"));
			oos.writeObject(p1);
			oos.writeObject(p2);
			System.out.println(p1.hashCode()+" -----"+p2.hashCode());
			oos.flush();
			oos.close();
			System.out.println("Serilzation is done");
					
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
