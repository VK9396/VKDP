package com.itsp.mt;

import com.itsp.stdp.Printer;

public class TicketBookingServlet implements Runnable {

	@Override
	public void run() {
		 Printer p1 = Printer.getInstance();
		 System.out.println("run() Executing "+p1.hashCode());

	}

}
