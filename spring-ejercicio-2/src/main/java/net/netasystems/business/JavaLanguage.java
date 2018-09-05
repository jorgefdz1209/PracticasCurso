package net.netasystems.business;

public class JavaLanguage implements Languaje {
	private String version;
	
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

	public String version() {
		return version;
	}
}
