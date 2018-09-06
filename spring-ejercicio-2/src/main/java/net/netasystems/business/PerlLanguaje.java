package net.netasystems.business;

import org.springframework.stereotype.Component;

@Component
public class PerlLanguaje implements Languaje {

    /**
     * Parametro tipo String
     */
    private String descriptionLanguage="PERL!!!!!!";
    /**
     * Parametro tipo String
     */
    private String version;

    /**
     * @return
     */
    public String getDescriptionLanguage() {
        return descriptionLanguage;
    }

    /**
     * @param descriptionLanguage
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

	public String version() {
		return version;
	}
}
