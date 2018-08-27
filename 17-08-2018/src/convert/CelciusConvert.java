package convert;


/**
 * Clase que implementa la interface Convert para la conversion de medida 
 * @author Jorge
 *
 */
public class CelciusConvert implements Convert{

	/* (non-Javadoc)
	 * @see convert.Convert#convertTo(double, convert.Mesure)
	 */
	@Override
	public double convertTo(double source, Mesure m) {
		if(m instanceof CelciusMesure) {
			return source;
		}else {
			double r = (source - 32)/1.8;
			return r;	
		}
	}

}
