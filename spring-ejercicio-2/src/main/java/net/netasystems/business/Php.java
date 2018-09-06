package net.netasystems.business;

import org.springframework.stereotype.Component;

/**
 * @author NetaSystems/Antoinette1
 * Simulacion de la implementacion del lenguaje PHP para programar 
 */
@Component
public class Php implements Languaje{

	/**
	 * Parametro tipo String con la version de php
	 */
	private String version = "1.7";
	/**
	 * Parametro tipo String con la descripcion del lenguaje
	 */
	private String descriptionLanguage="PHP RULEZ!!";
	
	/**
	 * Asignar el contenido de la variable descriptionLanguage
	 * @param descriptionLanguage la variable descriptionLanguage para asignar
	 */
	public void setDescriptionLanguage(String descriptionLanguage) {
		this.descriptionLanguage = descriptionLanguage;
	}

	/**
	 * Asignar el contenido de la variable version
	 * @param version la variable version para asignar
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/* (non-Javadoc)
	 * @see net.netasystems.business.Languaje#description()
	 */
	public String description() {
		// TODO Auto-generated method stub
		return descriptionLanguage;
	}

	/* (non-Javadoc)
	 * @see net.netasystems.business.Languaje#version()
	 */
	public String version() {
		// TODO Auto-generated method stub
		return version;
	}

}
