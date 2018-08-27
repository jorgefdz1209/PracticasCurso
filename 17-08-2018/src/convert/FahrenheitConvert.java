package convert;

/**
 * Clase FahrenheitConvert implentado la interface de Convert para asi poder convertir la unidad de medida 
 * @author Jorge
 *
 */
public class FahrenheitConvert implements Convert {

	/* (non-Javadoc)
	 * @see convert.Convert#convertTo(double, convert.Mesure)
	 */
	@Override
	public double convertTo(double source, Mesure m) {
		if (m instanceof FahrenheitMesure) {
			return source;
		}else {
			double r = (source *1.8)+32;
			return r;
		}
	}
}
