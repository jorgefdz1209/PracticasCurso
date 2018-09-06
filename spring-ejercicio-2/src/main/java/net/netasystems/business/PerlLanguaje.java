package net.netasystems.business;

import org.springframework.stereotype.Component;

/**
 * @author NetaSystems/Jorge Saul
 *
 */
@Component
public class PerlLanguaje implements Languaje {

    /**
     * Parametro tipo String
     * Contiene la descripcion del lenguaje
     */
    private String descriptionLanguage="PERL!!!!!!";
    /**
     * Parametro tipo String
     * Contiene la version del lenguaje 
     */
    private String version;

    /**
     * Obtine la descripcion del lenguaje 
     * @return String Descripcion 
     */
    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    /**
     * Asigna la descripcion del lenguaje 
     * @param descriptionLanguage descripcion del lenguaje
     */
    public void setDescriptionLanguage(String descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

    /* (non-Javadoc)
     * @see net.netasystems.business.Languaje#description()
     */
    public String description() {
        return descriptionLanguage;
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
