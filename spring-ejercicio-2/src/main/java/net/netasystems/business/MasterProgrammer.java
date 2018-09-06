package net.netasystems.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author NetaSystems/Antoinette1
 * Simulacion de un programador "MASTER"
 */
@Component
public class MasterProgrammer implements Programmer {

    /**
     * Parametro tipo Languaje
     * El lenguaje que maneja el programador 
     */
    @Autowired
    @Qualifier("javaLanguage")
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
        return "Program in :" +languaje.description();
    }
}