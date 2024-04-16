package clases_de_datos;

public class si {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Array: Permiten almacenar varios valores del mismo tipo
		int[] matriz = new int[10]; //Iniciando un array para 10 enteros
		int matriz2 [] = {3,4};
		
		//Para acceder a una posición se indica entre corchetes
		matriz[0] = 9;
		//Acceder a la última posición
		matriz[9] = 5;
		
		//Obtener cpacidad de una matriz
		int capacidad = matriz.length;
		
		//Recorrer un array con un bucle for
		for(int i = 0; i<matriz.length ; i++) 
		{
			System.out.print(matriz[i] + " ");
		}
		System.out.println();
		
		//Llenar el array con números aleatorios entre 1 y 10
		Random generador = new Random();

		for(int i = 0; i<matriz.length; i++) 
		{
			matriz[i] = generador.nextInt(1,11);
		}
		
		//Por mejorado: Algoritmo solo lectura
		for(int valor:matriz) //valor copia las interaciones de matriz
		{
			System.out.print(valor + " ");
		}

}
