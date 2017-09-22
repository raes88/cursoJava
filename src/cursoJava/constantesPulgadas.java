package cursoJava;

public class constantesPulgadas {

	public static void main(String[] args) {
		// final hace una variable constante , la cual no se puede modificar en todo el programa
		final double apulgadas=2.54;
		double cm=6;
		double resultado=cm/apulgadas;
		System.out.println("en "+ cm+" cm hay "+resultado+" pulgadas");
	}

}
