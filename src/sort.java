import java.util.Arrays;

public class sort {
	
	public static void main(String[] args) {
		
		/*
		¿Qué hace el método sort en Java?
	    El método sort() ordena los elementos de un arreglo (array) 
	    localmente y devuelve el arreglo ordenado. 
	    La ordenación no es necesariamente estable.
	    */
		
		int [] a  = {7,2,4,8,3,9,1,5,10,6};
		 Arrays.sort(a);
		 
		 System.out.println(Arrays.toString(a));
	}

}
