package com.netasystem.granja;

import java.util.ArrayDeque;
import java.util.Queue;

public class Parsela {
	//Sin funcionamiento
	private static Queue<Maiz> parsela = new ArrayDeque<>();
	private static boolean dispo = false;
	
	public synchronized static void addMaiz(Maiz maiz) {
		parsela.add(maiz);
	}
	
	public synchronized static Maiz getMaiz() {
		if(parsela.isEmpty()) {
			return null;
		}else {
			return parsela.poll();
		}
		
	}

	public static boolean isDispo() {
		return dispo;
	}

	public static void setDispo(boolean dispo) {
		Parsela.dispo = dispo;
	}
}
