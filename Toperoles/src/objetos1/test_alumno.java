package objetos1;

public class test_alumno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declarar una variable de tipo alumo
		Alumno a1 = new Alumno();
		Alumno a2 = new Alumno("87654321A", 23);
		Alumno a3 = new Alumno("23233233S", "Manolo", "m@gmail.com", 19, 1);
		
		a1.dni = "12345678P";
		a1.edad = 20;
		//a1.media = 9.4f;
		
		//Mostrar por pantalla los datos del alumnno
		System.out.println(a1.dni + " " + a1.edad + " " + a1.media);
		System.out.println(a2.dni + " " + a2.edad + " " + a2.media);
		
		//Meter notas de los alumnos
		a1.notas.add(8.0);
		a1.notas.add(7.0);
		//Actulizar la media de a1
		a1.calcularMedia();
		a2.notas.add(7.0);
		a2,notas.add(4.0);
		//Actualizar la media de a2
		a2.calcularMedia();
		a3.notas.add(9.0);
		a3.notas.add(10.0);
		//Actualizar la media de a3
		a3.calcularMedia();
		
		//Meter notas a los alumos
		a1.guardarNota(8.6);
		a1.guardarNota(5.6);
		a2.guardarNota(7.4);
		a2.guardarNota(8.9);
		a3.guardarNota(9.6);
		a3.guardarNota(48.1);
		
		
		System.out.println("La media de a1 es " + a1.media);
		System.out.println("La media de a2 es " + a2.media);
		System.out.println("La media de a3 es " + a3.media);
		
	}

}
