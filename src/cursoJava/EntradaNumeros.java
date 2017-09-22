package cursoJava;
import javax.swing.*;

public class EntradaNumeros {

	public static void main(String[] args) {
		
		
		String numero2=JOptionPane.showInputDialog("Introduzca un numero");
		double numero3=Double.parseDouble(numero2);
		System.out.print("la raiz de "+numero3+" es ");
		System.out.printf("%1.5f", Math.sqrt(numero3));
		System.out.println("");
		//--------------------------------------
		double numero=10000.00;
		System.out.println("Sin formato -- "+numero/3);
		System.out.printf("%1.5f",numero/3);
		
	}

}
