

@FunctionalInterface
public interface Mate {

	Double excecute(Double a,Double b);
	
	default Double sum(Double a,Double b){return a+b;}
}
