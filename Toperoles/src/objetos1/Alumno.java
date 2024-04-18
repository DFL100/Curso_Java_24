package objetos1;

import java.util.ArrayList;

public class Alumno {

	//Atributos o propiedades
	String dni;
	String nombre;
	String email;
	int edad;
	float media;
	ArrayList<Double> notas;
	
	//Constructores: metodo que inicializa los atributos de la clase alumno
	//1. Se llaman obligatoriamente igual que la clase
	//2. No se indica ningún tipo de retorno
	public Alumno() {
		//Constructor por defecto
		//Normalmente de deja vacío
		media = 1;
		notas = new ArrayList<Double> ();
		notas2 = new double [10];
	}
	
	/*public Alumno (String dni, int edad) {
		this.dni = dni;
		this.nombre = nombre
		this.email = email
		this.edad = edad;
		this.media = 1;
		notas = new ArrayList<Double> ();
		notas2 = new double [10];
	}*/

	public Alumno(String dni, String nombre, String email, int edad, float media) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.media = media;
		notas = new ArrayList<Double> ();
		notas2 = new double [10];
	}

	public Alumno(String dni, String nombre, String email, int edad, float media) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.media = media;
		notas = new ArrayList<Double> ();
		notas2 = new double [10];
	}
	
	//Métodos que añaden funcionabilidad a los objetos de la clase
	
	private void calcularMedia () {
		double suma = 0;
		//Recorro la lista de notas
		for(double valor : notas) {
			suma = suma + valor
		}
		
		this.media = (float) suma / notas.size();
		
	}
	
	//Método para añadir una nota
	public boolean guardarNota (double nota) {
		//la nota no puede ser menos que cero para no desmoralizar al almuno para la heteroavaliación
		
		if (nota>0 && nota <= 10) {
			this.notas.add(nota);
			this.calcularMedia();
			return true;
		}
		return false;
	}
	
}
