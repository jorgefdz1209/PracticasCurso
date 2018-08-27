package ejercicio_3;

import java.util.HashSet;
import java.util.Set;

/**
 * Clase main con la utilizacion de HashSet----
 * @author Jorge
 *
 */
public class Main {

	public static void main(String[] args) {
		Cliente c0 = new Cliente ("jorge","12356");
		Cliente c1 = new Cliente ("qwerty","14852");
		Cliente c2 = new Cliente ("poiuy","17852");
		Cliente c3 = new Cliente ("asdfg","97456");
		
		Set setClient = new HashSet();
		
		setClient.add(c0);
		setClient.add(c1);
		setClient.add(c2);
		setClient.add(c3);
		
		for(Object o : setClient) {
			Cliente c = (Cliente) o;
			System.out.println("Cliente Obtenido: "+ c);
		}
	}

}
