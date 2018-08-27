package Polimorfismo;

/**
 * Interface de profesor para las implementaciones de los demas tipo de profesores 
 * @author Jorge
 *
 */
public interface Profesor {
    
	
    /**
     * Metodo de exposicion del profesor 
     * @return String con las palabras posibles a decir
     */
    public String exponer();
    
    /**
     * Metodo de evaluar 
     * @return double con el valor de la posible nota obtenida 
     */
    public double evaluar();

}
