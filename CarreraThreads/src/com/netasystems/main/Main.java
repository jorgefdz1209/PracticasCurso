package com.netasystems.main;

import com.netasystems.clases.Equipo;
import com.netasystems.clases.Carrera;

public class Main {

	public static void main(String[] args) {
		System.out.println("Carrera de Netasystems!!!!");
		Carrera carrera = new Carrera();
		Equipo eqAzul = new Equipo(carrera, "Azul");
		Equipo eqAmarillo = new Equipo(carrera, "Amarillo");
		Equipo eqRojo = new Equipo(carrera,"Rojo");
		Equipo eqVerde = new Equipo(carrera,"Verde");
		Equipo eqNaranja = new Equipo(carrera,"Naranja");
		Thread teqAz = new Thread(eqAzul);
		Thread teqAm = new Thread(eqAmarillo);
		Thread teRo = new Thread(eqRojo);
		Thread teVe = new Thread(eqVerde);
		Thread teNa = new Thread(eqNaranja);
		teqAm.start();
		teqAz.start();
		teRo.start();
		teNa.start();
		teVe.start();
	}

}
