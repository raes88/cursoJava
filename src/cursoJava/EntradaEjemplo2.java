package cursoJava;
import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		
		String nombreUsuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		String edad=JOptionPane.showInputDialog("introduce tu edad, por favor");
		int edadUsuario=Integer.parseInt(edad);
		edadUsuario++;
		System.out.println("Hola "+nombreUsuario+" el a�o que viene tendras "+edadUsuario+" a�os.");

	}

}
