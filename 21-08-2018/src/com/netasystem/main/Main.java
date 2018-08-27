package com.netasystem.main;

import java.util.ArrayList;
import java.util.List;
import com.netasystem.recetario.*;

public class Main {

	public static void main(String[] args) {
		List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
		for(int i =0;i<11;i++) {
			ingredientes.add(new Ingrediente("NNombre "+ i, i+"00000"));
		}
		
		List<String> procedimientos = new ArrayList<String>();
		for (int i = 0; i < 5; i++) {
			procedimientos.add("https://github.com/jorgefdz1209/PracticasCurso...."+i);
		}
		
		String n1 = "Ensalada de pollo";
		String n2 = "Caballo frito";
		String n3 = "Caramelo judio";
		
		Receta r0 = new Receta("Saul", ingredientes, procedimientos);
		Receta r1 = new Receta("Saul", ingredientes, procedimientos);
		Receta r2 = new Receta("Saul", ingredientes, procedimientos);
		
		Recetario recetario = new Recetario();
		
		recetario.agregarReceta(n1, r0);
		recetario.agregarReceta(n2, r1);
		recetario.agregarReceta(n3, r2);
		
		recetario.mostrarList();
		System.out.println("############################################################");
		recetario.quitarReceta("Ensalada de pollo");
		System.out.println("############################################################");
		recetario.mostrarList();
		System.out.println("############################################################");
		recetario.quitarReceta("Caballo frito");
		System.out.println("############################################################");
		recetario.mostrarList();
		System.out.println("############################################################");
		recetario.quitarReceta("Caramelo judio");
		System.out.println("############################################################");
		recetario.mostrarList();
		
	}

}
