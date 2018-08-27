package Polimorfismo;

/**
 * Clase ProfArtPlas que implementa la interace de Profesor 
 * @author Jorge
 *
 */
public class ProfArtPlas implements Profesor{
    
    
    /* (non-Javadoc)
     * @see Polimorfismo.Profesor#exponer()
     */
    public String exponer(){
      return  "¿hola el arte es...?";
    }
    
    
    /* (non-Javadoc)
     * @see Polimorfismo.Profesor#evaluar()
     */
    public double evaluar(){
      return 8.8;
    }
}
