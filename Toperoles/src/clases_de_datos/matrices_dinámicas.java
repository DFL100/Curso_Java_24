package clases_de_datos;

import java.util.*;

public class matrices_dinámicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Listas
		ArrayList<String> matriculas = new ArrayList<String>();
		
		//Añadir elementos
		matriculas.add(" 3712-LND ");
		matriculas.add(" 2456-PDN ");
		matriculas.add(" 5374-NHX ");
		matriculas.add(" 0462-MQT ");
		
		//Obtener el número de elementos que hay en la lista: size;
		int elementos = matriculas.size();
		
		//Insertar elementos al principio o en medio de la colección
		matriculas.add("0, 3721-LND");
		
		//Recorrer una lista
		for(String m : matriculas) 
		{
			System.out.println(m);
		}
		
		//Eliminar elementos de una lista
		matriculas.remove(1);

}
