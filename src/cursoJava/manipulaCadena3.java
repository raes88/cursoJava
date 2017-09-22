package cursoJava;

public class manipulaCadena3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alumno1,alumno2;
		alumno1="David";
		alumno2="david";
		System.out.println("Comparamos David con david y el resultado es :");
		System.out.println("Con equals : "+alumno1.equals(alumno2)+" -- No ignora las mayusculas");
		System.out.println("Con equals.IgnoreCase : "+alumno1.equalsIgnoreCase(alumno2)+" -- Ignora las mayusculas");

	}

}
