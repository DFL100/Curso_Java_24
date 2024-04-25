package objetos2;

public class coche {

	private String matricula;
	double precio;
	motor motor;
	public coche(String matricula, double precio, objetos2.motor motor) {
		super(); //<-- Esto se puede sacar
		this.matricula = matricula;
		this.precio = precio;
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "matricula=" + matricula + ", precio=" + precio + ", motor=" + motor;
	}
	
	//Metodos de acceso --> set y get
	public String getmatricula() {
		return this.matricula();
	}
	
	public void setmatricula(String matricula)throws Exception {
		
		if(matricula.length()== 7) {
			
			this.matricula = matricula;
			
		}
		else {
			throw new Exception ("Matrícula errónea!!");
		}
		
	}
}