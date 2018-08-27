package com.netasystem.threads;

public class TestThread extends Thread {
	
	Thread t; 
	
	public TestThread(String name){
	    super(name);
	    System.out.println("El estado del Thread es: "+ name + " = "+ this.getState());
	    this.start();
	    System.out.println("qwerty: "+ name + " = "+ this.getState());
	  }
	
	public TestThread(String name, Thread t){
	    super(name);
	    this.t = t;
	    System.out.println("El estado del Thread es: " + name + " = " +this.getState());
	    this.start();
	    System.out.println("El estado del Thread es: " + name + " = " +this.getState());
	  }
	
	  public void run(){
		  for(int i = 0; i < 10; i++){
		      System.out.println("Estado " + this.getName() + " = " +this.getState());
		      if(t != null)
		        System.out.println("El estado del Thread es: " + t.getName() + " Esperado el Thread " + this.getName() +" = " +t.getState());
		  }
	  }
	  
	  public void setThread(Thread t){
		    this.t = t;
	  }
}
