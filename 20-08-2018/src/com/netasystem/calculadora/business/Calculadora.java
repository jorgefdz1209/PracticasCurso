package com.netasystem.calculadora.business;

/**
 * Clase con todo el negocio de la claculadora
 * @author Jorge 
 *
 */
public class Calculadora {
   //presentado por facilitador;
	
	/**
	 * Recibe dos cadenas de caracteres para realizar una operacion aritmetica.
	 * @param a String para el primer numero
	 * @param b String para el segundo numero 
	 * @return	doblue con el resultado de la operacion 
	 */
	public double suma(double a, double b) {
		return a+b;
	}
	
	/**
	 * Recibe dos cadenas de caracteres para realizar una operacion aritmetica.
	 * @param a String para el primer numero
	 * @param b String para el segundo numero 
	 * @return	doblue con el resultado de la operacion 
	 */
	public double resta(double a, double b) {
		return a-b;
	}
	
	/**
	 * Recibe dos cadenas de caracteres para realizar una operacion aritmetica.
	 * @param a String para el primer numero
	 * @param b String para el segundo numero 
	 * @return	doblue con el resultado de la operacion 
	 */
	public double multipicacion(double a, double b) {
		return a*b;
	}
	
	/**
	 * Recibe dos cadenas de caracteres para realizar una operacion aritmetica.
	 * @param a String para el primer numero
	 * @param b String para el segundo numero 
	 * @return	doblue con el resultado de la operacion 
	 */
	public double division(double a, double b) {
		if (b == 0) {
			return 0;
		}else {
			return a/b;
		}
	}
}
