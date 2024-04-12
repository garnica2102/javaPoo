
public class Habitacion {

	String name;
	int indent;
	
	public Habitacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Habitacion(String name, int indent) {
		super();
		this.name = name;
		this.indent = indent;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIndent() {
		return indent;
	}
	public void setIndent(int indent) {
		this.indent = indent;
	}

	@Override
	public String toString() {
		return "Habitacion [name=" + name + ", indent=" + indent + "]";
	}
	
}
