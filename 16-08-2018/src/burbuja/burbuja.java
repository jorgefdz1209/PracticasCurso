package burbuja;


/**
 * Clase de ordenamiento del metodo burbuja 
 * @author Jorge 
 *
 */
public class burbuja {
    private boolean tipoOrden;
    private int tamanoArreglo;
    private int[] arreglo;
    /**
     * Constructor de la clase Burbuja con los parametros necesarios para la creacion del objeto 
     * con los parametros necesarios para su correcto funcionamiento
     * @param tipoOrden boolean 
     * 					Para seleccionar el tipo de ordenamiento a realizar asendente o desendente
     * @param tamanoArreglo int 
     * 					Tamaño del arreglo a ordenar 
     */
    public burbuja(boolean tipoOrden, int tamanoArreglo){
      this.tipoOrden = tipoOrden;
      this.tamanoArreglo = tamanoArreglo;
      this.arreglo = new int[tamanoArreglo];
    }
    
    /**
     * Se le asigna el tipo de ordenamiento a realizar, TRUE desendente, FALSE ascendente
     * @param tipo boolean
     * 				asigna el tipo de orden a realizar 
     * 				TRUE desencente 
     * 				FALSE ascendente
     */
    public void setTipoOrden(boolean tipo){
      this.tipoOrden = tipo;
    }
    
    /**
     * Asigna un valor a la posicion deseada dentro del arreglo siempre y cuando la posicion sea una valida
     * @param n int 
     * 			valor numerico que se desea guardar dentro del arreglo 
     * @param pos int 
     * 			valor de la posicion dentro del arreglo 
     */
    public void setValor(int n, int pos){
      if (pos>tamanoArreglo-1){
        System.out.println("Posicion no valida");
      }else{
        arreglo[pos] = n;
      } 
    }
    
    /**
     * Asigna el valor de un arreglo de numeros enteros para ordenar 
     * @param arreglo  con el valor a asignar de arreglo 
     */
    public void setValor(int [] arreglo){
      this.arreglo = arreglo;
    }
    
    /**
     * Es el metodo de ordenamiento burbuja dependiendo el tipo de ordenamiento deseado por el usuario
     * @return int[] arreglo de numeros enteros ordenados según el ordenamiento
     */
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
