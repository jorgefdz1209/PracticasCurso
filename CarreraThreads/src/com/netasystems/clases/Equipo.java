package com.netasystems.clases;

import java.util.ArrayList;
import java.util.List;



/**Clase de equipo para la carrera a iniciar con la lista de corredores a "participar" 
 * @author Antoinette1
 *
 */
public class Equipo implements Runnable {
	private List<Corredor> corredores;
	private String name;
	private Carrera carrera;
	private int pendientes = 10;
	
	/**
	 * Constructor de la clase con los parametros de los equipos para participar, no se puede iniciar un equipo sin nombre y la carrera a "participar"
	 * genera los miembros del equipo automaticamente.
	 * @param carrera la carrera en la que "participará" el equipo 
	 * @param name el nombre del equipo para identificarlo de los demás participantes 
	 */
	public Equipo(Carrera carrera, String name){
		this.name = name;
		this.carrera = carrera;
		corredores = new ArrayList<>();
		for(int i = 0; i<pendientes; i++) {
			Corredor c = new Corredor(carrera, this.name +"_Corredor:"+ i, this);
			corredores.add(c);
		}
	}
	/**
	 * Metodo para anunciar cuando un "corredor" termina y sale del equipo
	 */
	public void corredorTermina() {
		this.pendientes--;
		if(pendientes == 0) {
			carrera.setFlagTeamF(true);
			carrera.mostrarRestantes();
			System.out.println("El equipo: "+this.name + " ha terminado!!!!");
		}
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		System.out.println("Equipo: "+ this + " ha iniciado!!!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(Corredor c : corredores) {
			Thread t = new Thread(c);
			t.start();
		}
		
	}
	
	/**
	 * Metodo para obtener el numero de participantes de un equipo 
	 * @return int numero de los participantes (restantes de tomar la bandera)
	 */
	public int getPendientes() {
		return pendientes;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name + ", Corredores = " + pendientes + "";
	}
	
}
