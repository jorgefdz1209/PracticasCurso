package com.netasystems.clases;

/**
 * Clase de los participantes de cada uno de los equipo 
 * @author Antoinette1
 *
 */
public class Corredor implements Runnable{
		private Carrera carrera;
		private boolean corre = true;
		private String name;
		private Equipo equipo;
		
		/**
		 * Constructor de la clase con los parametros necesarios para la creación de un corredor
		 * @param carrera carrera a participar 
		 * @param name nombre del corredor a participar en el equipo
		 * @param equipo el equipo en el que participara el corredor
		 */
		public Corredor(Carrera carrera, String name, Equipo equipo) {
			this.carrera = carrera;
			this.name = name;
			this.equipo = equipo;
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Runnable#run()
		 */
		@Override
		public void run() {
			while(corre && !carrera.isFlagTeamF()) {
				boolean aquired = false;
				try {
					Thread.sleep(1500);
					if (!carrera.isFlagTeamF()) {
						aquired = carrera.aquireFlag(this.name);	
					}
					if(aquired) {
						Thread.sleep(2000);
						carrera.releaseFlag();
						this.corre = false;
						equipo.corredorTermina();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}

	}