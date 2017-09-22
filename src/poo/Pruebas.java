package poo;

public class Pruebas {

	public static void main(String[] args) {
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Marta");

		System.out.println("Trabajador 1 :" + trabajador1.devuelveDatos());
		System.out.println("Trabajador 2 :" + trabajador2.devuelveDatos());
		System.out.println("Trabajador 3 :" + trabajador3.devuelveDatos());

		System.out.println();
		System.out.println("------------------------------");
		System.out.println();

		trabajador1.cambioSeccion("Gerencia");
		trabajador2.cambioSeccion("Telefonista");

		System.out.println("Trabajador 1 :" + trabajador1.devuelveDatos());
		System.out.println("Trabajador 2 :" + trabajador2.devuelveDatos());
		System.out.println("Trabajador 3 :" + trabajador3.devuelveDatos());

		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		trabajador1.cambioSeccion("Publicidad");
		trabajador2.cambioSeccion("Contable");

		System.out.println("Trabajador 1 :" + trabajador1.devuelveDatos());
		System.out.println("Trabajador 2 :" + trabajador2.devuelveDatos());
		System.out.println("Trabajador 3 :" + trabajador3.devuelveDatos());

	}
}

class Empleados {
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente = 1; // Variable estatica

	public Empleados(String nom) {
		nombre = nom;
		seccion = "Administracion";
		Id = IdSiguiente;// inicializamos la variable id
		IdSiguiente++;// incrementamos el valor de IdSiguiente en uno

	}

	public void cambioSeccion(String seccion) {// setter
		this.seccion = seccion;

	}

	public String devuelveDatos() { // getter
		return " El nombre es " + nombre + " , pertenece a la recccion " + seccion + " - Numero de empleado : " + Id;
	}

}
