package cursoJava;

public class manipulaCadenas2 {

	public static void main(String[] args) {
		String frase="hoy es un estupendo dia para aprender a programar en java";
		String fraseResume=frase.substring(0,29)+" irnos a la playa y olvidarnos de todo "+
		" y "+frase.substring(27, 57);
		System.out.println(fraseResume);
		
	}

}
