package net.netasystems.business;

public class Php implements Languaje{

	private String version;
	private String descriptionLanguage;
	
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

	public String description() {
		// TODO Auto-generated method stub
		return descriptionLanguage;
	}

	public String version() {
		// TODO Auto-generated method stub
		return version;
	}

}
