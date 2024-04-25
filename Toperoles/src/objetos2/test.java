package objetos2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		motor m1 = new motor();
		motor m2 = new motor("Mercedes",2000,tipo_motor.Híbrido);
		int[] x = new int[10];
		try {
			x[10] = 9;
		}
		catch(ArrayIndexOutOfBoundsException a)  {
			System.out.print("No existe esa posición");
		}
		
		System.out.println(m1.tipomotor);
		System.out.println(m2.toString());
		System.out.println(m2.hashCode());
		
		//******************************
		//Coches 
		
		coche c1 = new coche("1234KLO", 30000, m2);
		System.out.println(c1.toString());
		//Modificar matriculas
		c1.setmatricula("123456");
		System.out.println("Matricula modificada:");
		System.out.println(c1);
		
	}

	
	
}
