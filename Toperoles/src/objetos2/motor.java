package objetos2;

public class motor {

	String marca;
	int cilindrada;
	tipo_motor tipomotor;
	
	
	//Constructores
	public motor() {
		
		tipomotor = tipomotor.Gasolina;
		
	}
	
	public motor (String marca, int cilindrada, tipo_motor tpm) {
		
		this.marca = marca;
		this.cilindrada = cilindrada;
		this.tipomotor = tpm;
		
	}
	
	@Override
	public String toString() {
		
		return "Marca: " + this.marca + ", Cilindrada: " + this.cilindrada + ", Tipo: "+ this.tipomotor; 
		
	}
	
}
