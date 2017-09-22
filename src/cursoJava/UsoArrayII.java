package cursoJava;


public class UsoArrayII {

	public static void main(String[] args) {

		String[] paises = new String[8];
		
		/*paises[0] = "España";
		paises[1] = "Francia";
		paises[2] = "Alemania";
		paises[3] = "Japon";
		paises[4] = "China";
		paises[5] = "Corea";
		paises[6] = "Inglaterra";
		paises[7] = "Chile";*/

		System.out.println("    bucle for normal");
		System.out.println("-----------------------");
		for (int i = 0; i < paises.length; i++) {

			System.out.println("pais posicion " + i + " = " + paises[i]);
		}
		System.out.println("");
		System.out.println("    bucle for each");
		System.out.println("-----------------------");
		int posicion = 0;
		for (String elemento : paises) {
			System.out.println("Pais poscion " + posicion + " = " + elemento);
			posicion = posicion + 1;

		}

	}

}
