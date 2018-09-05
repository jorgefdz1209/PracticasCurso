package net.netasystems.business;

public class JorgeSaul implements Programmer{
	private Languaje languaje;
	
	/**
	 * Constructor con parametros 
	 * @param languaje a asignar
	 */
	public JorgeSaul(Languaje languaje) {
		super();
		this.languaje = languaje;
	}

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



	public String hackTheWorld() {
		// TODO Auto-generated method stub
		return "Program in: "+languaje.description()+" Versio: "+languaje.version();
	}

}
