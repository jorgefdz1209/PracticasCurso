package burbuja;

public class burbuja {
    private boolean tipoOrden;
    private int tamanoArreglo;
    private int[] arreglo;
    
    public burbuja(boolean tipoOrden, int tamanoArreglo){
      this.tipoOrden = tipoOrden;
      this.tamanoArreglo = tamanoArreglo;
      this.arreglo = new int[tamanoArreglo];
    }
    
    public void setTipoOrden(boolean tipo){
      this.tipoOrden = tipo;
    }
    
    public void setValor(int n, int pos){
      if (pos>tamanoArreglo-1){
        System.out.println("Posición no valida");
      }else{
        arreglo[pos] = n;
      } 
    }
    
    
    public void setValor(int [] arreglo){
      this.arreglo = arreglo;
    }
    
    public int[] ordernarArreglo(){
      if(tipoOrden){
        for(int i=0;i<arreglo.length-1;i++){
 			for(int j=0;j<arreglo.length-1;i++){
 				if(arreglo[j+1]>arreglo[j]){
 					int temp = arreglo[j];
 					arreglo[j]= arreglo[j+1];
 					arreglo[j+1]=temp;
 				}
 			}
 		}
      }else{
        for(int i=0;i<arreglo.length-1;i++){
 			for(int j=0;j<arreglo.length-1;i++){
 				if(arreglo[j+1]<arreglo[j]){
 					int temp = arreglo[j];
 					arreglo[j]= arreglo[j+1];
 					arreglo[j+1]=temp;
 				}
 			}
 		}
      }
      
      return this.arreglo;
    }
}
