package cursoJava;

import java.util.*;

public class AdivinaNumero {

	public static void main(String[] args) {
		// Math.random--genera un numero aleatorio entre 0 y 1
		// lo multiplicamos por 100 para generar un numero entre 0 y 100
		int aleatorio = (int) (Math.random() * 100);
		// utilizamos la consola para solicitar el numero
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		while (numero != aleatorio) {
			intentos++;
			System.out.println("Introduce un numero, por favor");
			numero = entrada.nextInt();
			if (aleatorio < numero) {
				System.out.println("el numro es menor");
			} else if (aleatorio > numero) {
				System.out.println("El numero es mayor");
			}
		}
		System.out.println("CORRECTO!!!!! Lo conseguiste en "+intentos+" intentos");
	}

}
