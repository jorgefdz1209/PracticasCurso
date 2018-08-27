package eje1;

public class Calculadora {
	
	/**
	 * Recibe dos cadenas de caracteres para realizar una operacion aritmetica.
	 * @param i String para el primer numero
	 * @param j String para el segundo numero 
	 * @return	doblue con el resultado de la operacion 
	 */
	public double resta(String i,String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p-s;
		}catch (NumberFormatException e) {
			System.out.println("No es un formato de numero valido");
		}catch(NullPointerException e) {
			System.out.println("Algo ha salido muy mal...");
		}
		return r;
	}
	
	/**
	 * Recibe dos cadenas de caracteres para realizar una operacion aritmetica.
	 * @param i String para el primer numero
	 * @param j String para el segundo numero 
	 * @return	doblue con el resultado de la operacion 
	 */
	public double suma (String i,String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p+s;
		}catch (NumberFormatException e) {
			System.out.println("No es un formato de numero valido");
		}catch (NullPointerException e) {
			System.out.println("Algo a salido mal...");
		}
		return r;
	}
	
	/**
	 * Recibe dos cadenas de caracteres para realizar una operacion aritmetica.
	 * @param i String para el primer numero
	 * @param j String para el segundo numero 
	 * @return	doblue con el resultado de la operacion 
	 */
	public double division(String i, String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p/s;
		}catch(NumberFormatException e) {
			System.out.println("No es un formato de numero valido");
		}catch(NullPointerException e) {
			System.out.println("Algo ha salio mal...");
		}catch (ArithmeticException e) {
			System.out.println("No es posible dividir 0");
		}
		return r;
	}
	
	/**
	 * Recibe dos cadenas de caracteres para realizar una operacion aritmetica.
	 * @param i String para el primer numero
	 * @param j String para el segundo numero 
	 * @return	doblue con el resultado de la operacion  
	 */
	public double multiplicacion(String i,String j) {
		double r=0;
		try {
			Double p = Double.parseDouble(i);
			Double s = Double.parseDouble(j);
			r=p*s;
		}catch (NumberFormatException e) {
			System.out.println("No es un formato de numero valido");
		}catch(NullPointerException e) {
			System.out.println("Algo muy malo debio pasar...");
		}
		return r;
	}
}
