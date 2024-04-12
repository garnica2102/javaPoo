import java.util.Arrays;
import java.util.Collections;

public class metodosOrdenamiento {
	
	public static void main(String[] args) {
		
//		https://techkrowd.com/programacion/java/como-ordenar-arrays-en-java/#google_vignette

//**************************************************
//+++++++++++Selection sort (selección)*************
//**************************************************
		

        Integer[] valsSeleccion = {15, 60, 8, 16, 44, 27, 12, 35};
        metodosOrdenamiento.seleccion(valsSeleccion);
        for (Integer val : valsSeleccion) {
            System.out.println("Ordenamiento por seleccioón -->" + Arrays.toString(valsSeleccion));
        }
	
//***********************************		
//******Bubble sort (burbuja)********
//***********************************
		int [] array = {4,6,2,8,7};
		//De forma ascendente (de menor a mayor)
		for (int i = 0; i < array.length-1; i++) {
		    for (int j = i+1; j < array.length ; j++) {
		        if (array[j]<array[i]){
		            int aux = array[j];
		            array[j] = array[i];
		            array[i] = aux;
		        }
		    }
		}
		System.out.println("Ordenación Array ascendente ---> " + Arrays.toString(array));
		
		//De forma descendente (de mayor a menor)
		for (int i = 0; i < array.length-1; i++) {
		    for (int j = i+1; j < array.length ; j++) {
		        if (array[j]>array[i]){
		            int aux = array[j];
		            array[j] = array[i];
		            array[i] = aux;
		        }
		    }
		}
		System.out.println("Ordenación Array descendente --> " + Arrays.toString(array));
		
        Integer[] vals = {15, 60, 8, 16, 44, 27, 12, 35};
        
        metodosOrdenamiento.burbuja(vals);
        for (Integer val : vals) {
            System.out.println("Método burbuja ascendente --> " + Arrays.toString(vals));
        }
		
		
//*****************************************
//		Insertion sort (inserción)
//*****************************************

		
//*****************************************		
//		Merge sort (combinación)
//*****************************************

//*****************************************
//		Quick sort (rápida)
//*****************************************
        /*El método sort() de la clase Arrays utiliza 
		internamente el algoritmo Dual-Pivot Quicksort, 
		que es más eficiente que el algoritmo de intercambio 
		que te he explicado al inicio de este artículo, 
		aunque es bastante más complejo si tuvieses que 
		programarlo manualmente.*/
//      con eso el array quedará ordenado de forma ascendente.		
		int [] arraySort = {4,6,2,8,7};
		Arrays.sort(arraySort);
		System.out.println("Array método SORT ascendente --> " + Arrays.toString(arraySort));
		
		for (int i = 0; i < arraySort.length; i++) {
		    System.out.println("Array método SORT ascendente for --> " + arraySort[i]);
		}
		
		//Y si lo que buscas es ordenarlo de forma descendente (de mayor a menor) entonces tienes dos opciones.
		//https://techkrowd.com/programacion/java/como-invertir-arrays-en-java/
		/*
		La segunda se basa en decirle al método sort() que lo ordene al revés, 
		pero este proceso solo funciona con arrays de objetos, no con arrays de 
		tipos primitivos, por tanto, si lo que buscas es ordenar el array del ejemplo 
		(int) tendrás que cambiar el tipo y usar Integer en vez de int de la siguiente forma:
		*/
		Integer [] arraySortIverso = {4,6,2,8,7};
		Arrays.sort(arraySortIverso, Collections.reverseOrder());
		System.out.println("Array método SORT inverso desendente --> " + Arrays.toString(arraySort));

//*****************************************		
//		Heap sort (montón)
//*****************************************

//*****************************************
//		Counting sort (conteo)
//*****************************************

//*****************************************
//		Radix sort (raíz)
//*****************************************
	
	
	
	}//fin main
	
//	https://javajhon.blogspot.com/2020/11/ordenamiento.html
	
    //Ordenamiento de burbuja
    public static void burbuja(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    Integer temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
    
    //Ordenamiento por selección
    public static void seleccion(Integer[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i; j < data.length; j++) {
                if (data[i] > data[j]) {
                    Integer aux = data[j];
                    data[j] = data[i];
                    data[i] = aux;
                }
            }
        }
    }

}
