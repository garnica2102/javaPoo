import java.util.Arrays;

public class numPrimos {
	
	public static void main(String[] args) {
		//Con Stream números primos
		 Integer[] num  = {2,3,1,5,7,8,11};
	       
		 Arrays.asList(num).stream()
	               .sorted((x,y)-> y.compareTo(x))
	               .map(x -> {
	                   Integer contador = 0;
	                   for (int i = 1; i <= num.length; i++) {
	                        if(x%i == 0){
	                            contador ++;
	                        }
	                   }
	                   if(contador == 2){
	                       return x;
	                   }
	                   return 0;
	               }).filter(numPrimo -> numPrimo>0).forEach(System.out::println);
	}

}
