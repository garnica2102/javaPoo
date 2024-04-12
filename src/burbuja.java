import java.util.Arrays;

public class burbuja {
	public static void main(String[] args) {
	
		/*
	   Método de ordenamiento de burbuja (Bubble sort). 
	   Este método revisa y arregla el orden de cada elemento 
	   del arreglo comparándolo con el siguiente. 
	   El proceso se repite varias veces hasta que se hayan 
	   verificado todos los elementos, ya no sean necesarios 
	   más cambios y el arreglo se encuentre ordenado.
	   De menor a mayor
	*/
	    int [] a  = {7,2,4,8,3,9,1,5,10,6};
	    int temporal = 0;

	    for (int i = 0; i < a.length; i++) {
	        for (int j = 1; j < (a.length - i); j++) {
	            if (a[j - 1] > a[j]) {
	                temporal = a[j - 1];
	                a[j - 1] = a[j];
	                a[j] = temporal;
	            }
	        }
	    }
	    System.out.println("Primer método burbuja de menor a mayor --> "+Arrays.toString(a));
	    
	    
	    //Esto se llama orden burbuja de mayor a menor.
		int b[] = {5,3,2,7,10,1,4,8,6,9};
		    for (int x = 0; x < b.length; x++) {
		        for (int i = 0; i < b.length-x-1; i++) {
		            if(b[i] < b[i+1]){
		                int tmp = b[i+1];
		                b[i+1] = b[i];
		                b[i] = tmp;
		            }
		        }
		    }
		System.out.println("Segundo método burbuga de mayor a menor --> "+Arrays.toString(b));

				
	}//fin main
}
