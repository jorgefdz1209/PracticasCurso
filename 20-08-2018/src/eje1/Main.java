package eje1;


/**
 * Clase main como prueba de utilizacion 
 * @author Jorge 
 *
 */
public class Main {

	public static void main(String[] args) {
		try {
			String i = args[0];
			String j = args[1];
			String signo = args[2];
			Calculadora c = new Calculadora();
			switch (signo) {
				case "-":
					System.out.println("El resultado es: "+c.resta(i, j));
					break;
				case "+":
					System.out.println("El resultado es: "+c.suma(i, j));
					break;
				case "/":
					System.out.println("El resultado es: "+c.division(i, j));
					break;
				case "x":
					System.out.println("El resultado es: "+c.multiplicacion(i, j));
					break;
				default:
					System.out.println("Es necesario revisar el signo...");
					break;
			}	
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Sin argumentos necesarios para trabajar...");
		}
	}
}