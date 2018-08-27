package convert;

/**
 * Clase que se extiende de Mesure para poder hacer uso de su constructor heredadp 
 * @author Jorge
 *
 */
public class FahrenheitMesure extends Mesure {
	
	/**
	 * Utilizacion del constructor de la clase padre para seguir con los mismo criterios
	 * 
	 */
	public FahrenheitMesure () {
		super("Fahrenheit",-457,212,32);
	}
}
