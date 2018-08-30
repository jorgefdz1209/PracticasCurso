package com.netasystem.main;

import com.netasystem.threads.TestThread;
 // saludo Atentamente Osvi 
public class Main {
	public static void main(String[] args) {
		TestThread t = new TestThread("A");
	    TestThread t2 = new TestThread("  B", t);
	    try {
	      Thread.sleep(1000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    System.out.println("Estado de Thread " + t.getName() + " = " + t.getState());
	    System.out.println("qwerty " + t2.getName() + " = " +t2.getState());
	}
}
