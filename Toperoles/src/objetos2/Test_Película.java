package objetos2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test_Película {

	//Lista de películas
	
	ArrayList<Pelicula> mispelis = new ArrayList<Pelicula>();
	
	//Menú de usuario
	
	System.out.println("1 Ver lista de peliculas.");
	System.out.println("2. Añadir película");
	System.out.println("3. Salir");
	
	Scanner lector = new Scanner(System.in);
	opcion = lector.nexInt();
	switch (opcion) {
	case 1;
	//Mostrar cada pelicula
	for(pelicula p : mispelis) {
		System.out.println(p);
	}
	
	break;
	case 2:
		//Añadir pelicula
		String titulo, plataforma;
		int anho;
		System.out.println("Introduzca el título");
		Scanner lector2 = new Scanner (System.in);
		titulo = lector2.nextLine();
		anho = lector2.nextInt();
		lector2.close();
		mispelis.add(new pelicula )
		
		break;
	}
	
}
