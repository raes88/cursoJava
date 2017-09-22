package cursoJava;

//Capitulo 17
//importamos los paquetes necesarios
import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		// instanciamos la clase Scanner para poder pedir los daros por consola
		Scanner entrada = new Scanner(System.in); 
		//\n para hacer saltos de pagina
		System.out.println("Elige una opcion:\n1 : Cuadradro\n2 : Rectangulo\n3 : Triangulo\n4 : Circulo");
		// asignamos a figura los datos que metemos por consola
		int figura = entrada.nextInt();
		switch (figura) {
		case 1:
			// JOptionPane.showInputDialog nos vale para mostrar una ventana
			// para recoger datos y asignaselos a la varriable
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			//mostramos por pantalla los datos del area del cuadrado
			//Math.pow(lado, 2) = a lado al cuadrado
			System.out.println("El area del cuadrado es " + Math.pow(lado, 2));
			break;
		case 2:
			// recogemos en la ventana el valor de base
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			//recogemos en la ventana el valor de altura
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es " + base * altura);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			System.out.println("El area del triangulo es " + (base * altura) / 2);
			break;
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio del circulo"));
			System.out.print("El area del circulo es ");
			//formateamos el resultado de salida a solo dos decimales
			System.out.printf("%1.2f", Math.PI * (Math.pow(radio, 2)));
			break;

		default:
			System.out.println("La opcion no es correcta");
			break;
		}
	}

}
