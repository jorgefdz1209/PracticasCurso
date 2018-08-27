package convert;

/**
 * Clase que se extiende de Mesure para poder hacer uso de su constructor heredadp 
 * @author Jorge
 *
 */
public class CelciusMesure extends Mesure {

	/**
	 * Utilizacion del constructor de la clase padre para seguir con los mismo criterios
	 * 
	 */
	public CelciusMesure() {
		super("Celcius",-273, 100, 0);
	}
}
