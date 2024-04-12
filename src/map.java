import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class map {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Habitacion> habitacionesHash = new HashMap<String, Habitacion>();
		habitacionesHash.put("50", new Habitacion("Edgar",20));
		habitacionesHash.put("3", new Habitacion("Itzel",10));
		habitacionesHash.put("20", new Habitacion("Raul",80));
		habitacionesHash.put("4", new Habitacion("Mateo",40));
		habitacionesHash.put("1", new Habitacion("Maria del Carmen",30));
		habitacionesHash.put("6", new Habitacion("Mambo",90));
		System.out.println("Arreglo habitaciones --> " +habitacionesHash);
		
		/*
		ORDENACIÓN POR CLAVE. Es el tipo de ordenación, 
		tanto si la clave es numérica o de tipo string, 
		que el HashMap hace de forma automática. 
		En este caso si estuviera desordenado el HashMap 
		la simple creación de un objeto TreeMap, volvería a reordenar 
		el HashMap automáticamente:
		*/
		HashMap<String,Habitacion> sortMap = new HashMap<String,Habitacion>();
		Map<String,Habitacion> treeMap = new TreeMap<String,Habitacion>();
		
		Set s = treeMap.entrySet();
//		Iterator it = s.iterator();
		
		
		
		// https://www.espai.es/blog/2020/02/ordenacion-de-una-estructura-hashmap-de-java/
//		Map map = new HashMap();
//		map.put("MX",2);
//		map.put("US",1);
//		map.put("IN",3);
//		map.put("BZ",4);
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("MX",2);
		map.put("US",1);
		map.put("IN",3);
		map.put("BZ",4);
		
		System.out.println("Arreglo MAP --> " +map);
		
		Map<String, String> doubleBraceMap  = new HashMap<String, String>() {{
		    put("key1", "value1");
		    put("key2", "value2");
		}};
		
		
		Map<String, String> map1 = Stream.of(new String[][] {
			  { "Hello", "World" }, 
			  { "John", "Doe" }, 
			}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		
		System.out.println("Arreglo MAP1 Collectors --> " +map1);
		
		 Map<String, Integer> map2 = Stream.of(new Object[][] { 
		     { "data1", 1 }, 
		     { "data2", 2 }, 
		 }).collect(Collectors.toMap(data -> (String) data[0], data -> (Integer) data[1]));
		 
		 System.out.println("Arreglo MAP1 Stream --> " +map2);
	
		//List<String> empleados = new ArrayList<>(map.keySet());
		//Collections.sort(empleados);
		
		//System.out.println(map);
		
		//Map map = new HashMap<>();
		 
		//empleado1 = new Empleado(1L, "Maria");
		//map.put(empleado1.getNombre(), empleado1);

		//Empleado empleado2 = new Empleado(22L, "Ana");
		//map.put(empleado2.getNombre(), empleado2);

		//Empleado empleado3 = new Empleado(8L, "Juan");
		//map.put(empleado3.getNombre(), empleado3);

		//Empleado empleado4 = new Empleado(2L, "Jorge");
		//map.put(empleado4.getNombre(), empleado4);
		
		
	}

}
