
public class lambda {
	
	public static void main(String[] args) {
		
//		Operacion r = (a,b) -> return a+b;
		
		//Implementación mediante clase anonima
		
		Mate substract = new Mate() {

			@Override
			public Double excecute(Double a, Double b) {
				return a+b;
			}
			
		};
		
		System.out.println("Suma --> " + substract.excecute(5.0, 5.0));
		
		//De tipo Lamdda
		Mate multiply = (a,b)-> a*b;
		
		System.out.println("Multiplicacón --> " + multiply.excecute(5.0, 5.0));
		
		//LAMDDA CON PROGRAMACIÓN GENERICA
		
		
		
		
		
	}

}
