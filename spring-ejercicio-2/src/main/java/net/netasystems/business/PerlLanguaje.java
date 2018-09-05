package net.netasystems.business;

public class PerlLanguaje implements Languaje {

    private String descriptionLanguage;
    private String version;

    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    public void setDescriptionLanguage(String descriptionLanguage) {
        this.descriptionLanguage = descriptionLanguage;
    }

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

	public String version() {
		return version;
	}
}
