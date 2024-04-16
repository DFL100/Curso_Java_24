package Metodos;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Prueba metodo its primo
		int number;
		System.out.println("Introduzca un número");
		Scanner lector = new Scanner (System.in);
		number = lector .nextInt();
		
		if(metematicos.isPrimo(number)) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("No es primo");
		}
		//Prueba para rellenar matriz
		int[]matriz = new int[20];
		matematicos.rellenarArray(matriz, number, number);
		
		//Prueba sumar
		int valor = 20;
		matematicos.sumar10(valor);
		
		System.out.println("Valor= " + valor);
		
		matematicos.sumar10Array(matriz2){
			
		System.out.println("Matriz2[0]= " + matriz2[0] );
			
		}
		
	}
	

}
