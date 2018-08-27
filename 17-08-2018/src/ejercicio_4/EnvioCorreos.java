package ejercicio_4;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Clase envio correo para simular el envio de correos masivos
 * @author Jorge 
 *
 */
public class EnvioCorreos {
	
	/**
	 * Metodo para el envio de correos para una lista de personas en especifico
	 * @param l List<Persona> para enviar los correos electronicos 
	 */
	public void enviarCorreo(List<Persona> l) {
		for(Persona p : l){
			System.out.println("Se envio correo a la direccion "+p.getCorreoEle());
		}
	}
	
	
	/**
	 * Metodo para el envio de correos para un map de personas en especificos 
	 * @param map Map<Integer,Persona> para enviar los correos electronicos 
	 */
	public void enviarCorreoId(Map<Integer,Persona> map) {
		Set<Integer> ids = map.keySet();
		for(Integer id : ids) {
			Persona p = map.get(id);
			System.out.println(p);
		}
	}
}
