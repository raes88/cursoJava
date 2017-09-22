package cursoJava;

import java.util.*;

public class entradaEjemplo1 {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre,por favor");
		String nombreUsuario=entrada.nextLine();
		System.out.println("Introduce tu edad, por favor ");
		int edad=entrada.nextInt();
		System.out.println("Hola "+nombreUsuario+" el año que viente tendras "+(edad+1)+" años.");
		

	}

}
