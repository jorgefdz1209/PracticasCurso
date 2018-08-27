package com.netasystem.calculadora.main;

import com.netasystem.calculadora.business.Calculadora;

/**
 * Clase main de ejemplo de uso
 * @author Jorge
 *
 */
public class Main {
	public static void main(String[] args) {
		Calculadora c= new Calculadora();
		// arg 
		String primerArg = args[0];
		String segundoArg = args[1];
		String tercerArg = args[2];
		double op1=0.0;
		double op2=0.0;
		//convertir numeros
		try {
			op1 = Double.parseDouble(primerArg);
			op2 = Double.parseDouble(segundoArg);
		}catch (NumberFormatException e) {
			System.out.println("No se ha podido convertir el numero...");
			System.out.println("Menseja de error: "+e.getMessage());
			System.exit(-1);
		}finally {
			//resultado pase lo que pase...
		}
		double resultado = 0;
		switch (tercerArg) {
		case "+":
			resultado = c.suma(op1, op2);
			break;
		case "-":
			resultado = c.resta(op1, op2);
			break;
		case "*":
			resultado = c.multipicacion(op1, op2);
			break;
		case "/":
			resultado=c.division(op1, op2);
			break;
		default:
			resultado = -1;
			break;
		}
		System.out.println("El resultado es:"+ resultado);
		
	}
}
