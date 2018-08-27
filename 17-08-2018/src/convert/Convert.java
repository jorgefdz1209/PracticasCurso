package convert;

/**
 * Interface de Corvet para la conversion de unides por otra 
 * @author Jorge
 *
 */
public interface Convert {
	
	/**
	 * Metodo general para la conversion de unidades 
	 * @param source double tamaño de la medida 
	 * @param m Mesure tipo de medida para hacer la conversion 
	 * @return double con la unidad ya convertida 
	 */
	double convertTo(double source, Mesure m);
}
