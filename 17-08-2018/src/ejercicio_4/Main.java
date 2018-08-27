package ejercicio_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Clase Main para las pruebas 
 * @author Jorge
 *
 */
public class Main {

	public static void main(String[] args) {
		Persona person0 = new Usuario("jorge1","jorge1@mail.com");
		Persona person1 = new Usuario("jorge2","jorge2@mail.com");
		Persona person2 = new Usuario("jorge3","jorge3@mail.com");
		Persona person3 = new Usuario("jorge4","jorge4@mail.com");
		Persona person4 = new Administrador("jorge5","jorge5@mail.com");
		Persona person5 = new Administrador("jorge6","jorge6@mail.com");
		Persona person6 = new Administrador("jorge7","jorge7@mail.com");
		Persona person7 = new Administrador("jorge8","jorge8@mail.com");
		
		List<Persona> l = new ArrayList<Persona>();
		
		l.add(person0);
		l.add(person1);
		l.add(person2);
		l.add(person3);
		l.add(person4);
		l.add(person5);
		l.add(person6);
		l.add(person7);
		
		EnvioCorreos ec = new EnvioCorreos();
		ec.enviarCorreo(l);
		
		Map<Integer, Persona> map = new HashMap<Integer, Persona>();
		map.put(1, person0);
		map.put(2, person1);
		
		ec.enviarCorreoId(map);
		
		
	}

}
