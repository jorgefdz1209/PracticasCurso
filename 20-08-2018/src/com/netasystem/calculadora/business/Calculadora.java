package com.netasystem.calculadora.business;

public class Calculadora {
   //presentado por facilitador;
	
	public double suma(double a, double b) {
		return a+b;
	}
	
	public double resta(double a, double b) {
		return a-b;
	}
	
	public double multipicacion(double a, double b) {
		return a*b;
	}
	
	public double division(double a, double b) {
		if (b == 0) {
			return 0;
		}else {
			return a/b;
		}
	}
}
