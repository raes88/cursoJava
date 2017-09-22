package cursoJava;

public class ClaseMath {

	public static void main(String[] args) {
		// raiz cuadradaF
		double raiz = Math.sqrt(9);
		System.out.println("Raiz cuadrada de 9 es "+raiz);

		// redondeo de un numero
		double num1 = 5.59255;
		int resultado = (int) Math.round(num1);
		System.out.println("el redondeo de el numro double "+num1+" en numero entero(int) es "+resultado);

		// exponente de un numero a otro
		double base = 5;
		double exponente = 3;
		double resultado2 = Math.pow(base, exponente);
		System.out.println("el resultado del numero "+base+" al exponente "+exponente+" es "+resultado2);
	}

}
