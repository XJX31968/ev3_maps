package vehiculos;

public class Coche {

	private String matricula;
	private String color;
	private String modelo;
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Coche(String matricula, String color, String modelo) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", modelo=" + modelo + "]";
	}
	
	
	
	
	
	
}
