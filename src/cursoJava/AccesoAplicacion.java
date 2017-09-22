package cursoJava;

import javax.swing.*;

public class AccesoAplicacion {

	public static void main(String[] args) {
		String password = "";
		String clave = "raul";
		while (clave.equals(password) == false) {
			password = JOptionPane.showInputDialog("Introduce la clave de acceso");

			if (clave.equals(password) == false) {
				System.out.println("La contraseña es incorrecta");
			}

		}

		System.out.println("la contraseña es correcta");
	}

}
