package com.netasystems.clases;

/**
 * Clase Carrera con la bandera que gestiona la salida de los corredores de la carrera. 
 * 
 * @author Jorge 
 *
 */
public class Carrera {
	
	private boolean flagTaken = false;
	private boolean flagTeamF = false;

	/**
	 * Metodo sincronizado que informa si algun corredor a tomado la bandera.
	 * @param threadName Nombre del Thread que se esta ejecutando para mostrar el nombre del "Corredor" activo.
	 * @return regresa el estado de la bandera si es tomada o dejada por alguno de los corredores.
	 */
	public synchronized boolean aquireFlag(String threadName) {
		if(flagTaken) {
			return false;
		}
		System.out.println("Bandera tomada por : "+threadName);
		flagTaken = true;
		return true;
	}
	
	/**
	 * Metodo para "Liberar" la bandera y asi otro "Corredor" la pueda tomar, para salir de la carrera.
	 */
	public void releaseFlag() {
		flagTaken = false;
	}
	
	/**
	 * Metodo del estado de la bandera de "Termino" de la carrera por algùn equipo 
	 * @return boolean del estado de la carrera por algùn equipo.
	 */
	public synchronized boolean isFlagTeamF() {
		return flagTeamF;
	}
	
	/**
	 * Metodo para asignar un valor al estado de bandera termino de la carrera (solo valor booleano)
	 * @param flagTeamF valor boolean del estado de carrera
	 */
	public synchronized void setFlagTeamF(boolean flagTeamF) {
		this.flagTeamF = flagTeamF;
	}
	
}
