package net.netasystems.business;

import org.springframework.stereotype.Component;

/**
 * @author NetaSystems/Jorge Saul 
 * Simula la implementacion del lenguaje java
 */
@Component
public class JavaLanguage implements Languaje {
	private String version;
	
    /* (non-Javadoc)
     * @see net.netasystems.business.Languaje#description()
     */
    public String description() {
        return "Java rules!!";
    }
    
	/**
	 * Asignar el contenido de la variable version
	 * @param version la variable version para asignar
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/* (non-Javadoc)
	 * @see net.netasystems.business.Languaje#version()
	 */
	public String version() {
		return version;
	}
}
