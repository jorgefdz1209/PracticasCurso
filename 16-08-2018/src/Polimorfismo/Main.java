package Polimorfismo;

import Polimorfismo.ProfArtPlas;
import Polimorfismo.ProfEduFis;
import Polimorfismo.ProfMate;
import Polimorfismo.Profesor;


/**
 * Clase de prueba de el ejercicio 
 * @author Jorge
 *
 */
public class Main {

  public static void main(String[] args) {
    System.out.println("prueba profesor");
    Profesor pM = new ProfMate();
    Profesor pE = new ProfEduFis();
    Profesor pA = new ProfArtPlas();
    pruebaProf(pM);
    pruebaProf(pE);
    pruebaProf(pA);
  }
  
  public static void pruebaProf(Profesor p){
    String expo = p.exponer();
    double eva = p.evaluar();
    System.out.println(expo);
    System.out.println(eva);
  }

}
