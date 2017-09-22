package cursoJava;

import javax.swing.*;

public class UsoArrayIII {

	public static void main(String[] args) {

		String[] paises = new String[8];
		
		for(int i=0;i<8;i++){
			paises[i]=JOptionPane.showInputDialog("Introduce el pais "+(i+1));
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
