package burbuja;

public class Main {

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
