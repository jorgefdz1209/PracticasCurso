package net.netasystems.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author NetaSystems/Jorge Saul
 *
 */
@Component
public class JorgeSaul implements Programmer{
	@Autowired
	@Qualifier("php")
	private Languaje languaje;
	
	/**
	 * Obtener la variable languaje 
	 * @return la variable languaje tipo Languaje
	 */
	public Languaje getLanguaje() {
		return languaje;
	}


	/**
	 * Asignar el contenido de la variable languaje
	 * @param languaje la variable languaje para asignar
	 */
	public void setLanguaje(Languaje languaje) {
		this.languaje = languaje;
	}



	/* (non-Javadoc)
	 * @see net.netasystems.business.Programmer#hackTheWorld()
	 */
	public String hackTheWorld() {
		return "Program in: "+languaje.description()+" Version: "+languaje.version();
	}

}
