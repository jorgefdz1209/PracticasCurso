package convert;

/**
 * Clase base de Mesure para las medidas que puedan ser utilizadas 
 * @author Jorge 
 *
 */
public class Mesure {
	private String name;
	private int minValue;
	private int maxValue;
	private int waterFrezze;
	
	/**
	 * Constructor de la clase no se permiten crear medidas sin los parametros necesarios 
	 * @param name nombre de la medida
	 * @param minValue temperatura minima alcanzada sin lab
	 * @param maxValue temperatura max alcanzada sin lab
	 * @param waterFrezze temperatura de congelacion del agua
	 */
	public Mesure(String name, int minValue, int maxValue, int waterFrezze) {
		this.name = name;
		this.minValue = minValue;
		this.maxValue = maxValue;
		this.waterFrezze = waterFrezze;
	}
	
}
