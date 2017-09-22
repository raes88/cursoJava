package poo;
import javax.swing.*;

public class UsoCoche {

	public static void main(String[] args) {
		Coche renault = new Coche(); // intstanciar una clase.Ejemplar de clase

		System.out.println("Este coche tiene " + renault.getRuedas() + " ruedas");
		renault.setColor(JOptionPane.showInputDialog("Introduce el color del coche"));// establece color
		System.out.println("El color de mi coche es " + renault.getColor());// dime
																			// color
		System.out.println("");
		System.out.println("   Plataforma");
		System.out.println("---------------");
		System.out.println(renault.getPlataforma());
		
		System.out.println("");
		renault.setAsientosCuero(JOptionPane.showInputDialog("Quieres asientos de cuero?"));
		System.out.println(renault.getAsientosCuero());
		
		System.out.println("");
		renault.setClimatizador(JOptionPane.showInputDialog("Quieres Climatizador?"));
		System.out.println(renault.getClimatizador());
		
		System.out.println("");
		System.out.println(renault.pesoCoche());
		
		System.out.println("");
		System.out.println("El precio final del coche es de "+renault.getprecioCoche()+" €.");
	}

}
