package burbuja;

public class Main {

	/**
	 * Metodo main para probar el metodo de ordenamiento burbuja
	 * @param args String[] Arreglo de String que sirve como argumentos para la ejecucion de una aplicacion en JAVA
	 */
  public static void main(String[] args) {
   burbuja b = new burbuja(true,10);
   for(int i=0;i<10;i++){
     int valor = (int)Math.random();
     b.setValor(valor,i);
   }
   
   int[] a = b.ordernarArreglo();
   for(Integer i:a){
     System.out.println(i);
   }
  }
}
