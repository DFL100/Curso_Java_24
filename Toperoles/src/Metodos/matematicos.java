package Metodos;

import java.util.Random;

public class matematicos {

	//Método que indica si un núeros es primo
	public static boolean isPrimo(int numero) {
		
		for(int i = 2; i<= numero/2; i++) {
			
			if(numero % i == 0) {
				
			}
		}
		return true;
	}
	//Metodo que llena un array con números aleatorios de 
	public static void rellenarArray(int[]matriz, int inferior, int superior){
		Random generator = new Random();
		
		for (int i = 0; i<matriz.length; i++) {
			matriz[i] = generator.nextInt(inferior,superior); 
		}
	}
	//Método que calcule la media de un array
	public static void calcularMedia(int [] matriz) {
		
		int suma = 0;
		double media = 0;
		for(int valor : matriz) {
			suma = suma + valor;
		}
		media = suma / matriz.length;
		matematicos.rellenarArray(matriz, 1, 11);
		//Calcular la media
		double media = matematicos.calcularMedia(matriz);
		
		 
		
	}
	
	
	public static void sumar10 (int n) {
		n = n + 10;
	}
	
	public static void sumar10Array (int[] n) {
		
	}
	
}
