package Polimorfismo;

/**
 * Clase con la implementacion de la interface de Profesor
 * @author Jorge
 *
 */
public class ProfMate implements Profesor{
    
    
    /* (non-Javadoc)
     * @see Polimorfismo.Profesor#exponer()
     */
    public String exponer(){
      return "la raiz cuadrada es....";
    }
    
   
    /* (non-Javadoc)
     * @see Polimorfismo.Profesor#evaluar()
     */
    public double evaluar(){
      return 6.0;
    }
}
