import java.util.HashMap;

public class palindromos {
	
	public static void main(String[] args) {
		
		/*
		hacer una lista usando Map y HashMap donde asocies un ID a cada palabra:
		Palabras: reconocer,  falso, hola, oso, arenera
		Filtrar la lista y solo imprimir los ID de las palabras que son palindromos.
		
		Sustantivo masculino. Palabra o frase que se lee igual de derecha a izquierda, 
		que de izquierda a derecha. En latinoamérica se conoce también por palindroma. 
		Ejemplos: «"Dábale arroz a la zorra el abad" es un palíndromo o "Anita lava la tina".»
		*/
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		hash.put("reconocer",1);
		hash.put("falso",2);
		hash.put("hola",3);
		hash.put("oso",4);
		hash.put("arenera",5);
		System.out.println("Lista --> " +hash);
		
		boolean pal = false;
		
		for(String clave:hash.keySet()) {
			int valor = hash.get(clave);
			System.out.println("Clave : "+ clave + " valor --> " + valor);
				
		}
		
		// Palabra a comprobar, hardcodeada para evitar toda la parte del user input
	    final String word = "racecar";

	    // Todas las palabras son palíndromos hasta que se demuestre lo contrario!
	    boolean isPalindrome = true;

	    /*
	    * Declaro dos variables, i a 0 y j a la longitud -1 (para evitar el overflow), y dado
	    * que recorremos el bucle desde las dos puntas, no necesito seguir recorriéndolo si la
	    * i ya es mayor que la j puesto que eso significará que estoy comprobando cosas que ya 
	    * había comprobado antes! Es lo mismo charAt(0) != charAt(4) que charAt(4) != charAt(0)!
	    */
	    for(int i = 0, j = word.length() - 1; i <= j; i++, j--){
	        if (word.charAt(i) != word.charAt(j)) {
	            // Si las letras no coinciden no es palíndromo, flag a false y salimos del bucle
	            // No tiene sentido seguir iterando si ya sabemos que no es palíndromo
	            isPalindrome = false;
	            break;
	        }
	    }
	    
	    // Utilizo un ternario para pintar la palabra "es" o "no es" en función de si es palíndromo o no
	    // Podrías usar un if/else normal, pero así me ahorro escribir dos veces el mismo string :)
	    System.out.println("La palabra " + word + (isPalindrome ? " es": " no es") + " un palíndromo");
	}

}
