package Polimorfismo;

/**
 * Clase de ProfEduFis que implementa la interface de Profesor
 * @author Jorge
 *
 */
public class ProfEduFis implements Profesor{

    
    /* (non-Javadoc)
     * @see Polimorfismo.Profesor#exponer()
     */
    public String exponer(){
      return "Vamos a correr dos vueltas....";
    }
    
    
    /* (non-Javadoc)
     * @see Polimorfismo.Profesor#evaluar()
     */
    public double evaluar(){
      return 10.0;
    }

}
