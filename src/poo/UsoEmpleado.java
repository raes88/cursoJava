package poo;

import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		
	/*	Empleado empleado1 = new Empleado("Raul", 15000, 2000, 6, 25);
		Empleado empleado2 = new Empleado("Izas", 20000, 2015, 4, 30);
		Empleado empleado3 = new Empleado("Noa", 30000, 2014, 10, 15);
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		System.out.println("Primer empleado - " + empleado1.getNombre() + " / Fecha Alta - "
				+ empleado1.getAltaContrato() + " / Sueldo - " + empleado1.getSueldo());
		System.out.println("Segundo empleado - " + empleado2.getNombre() + " / Fecha Alta - "
				+ empleado2.getAltaContrato() + " / Sueldo - " + empleado2.getSueldo());
		System.out.println("Tercer empleado - " + empleado3.getNombre() + " / Fecha Alta - "
				+ empleado3.getAltaContrato() + " / Sueldo - " + empleado3.getSueldo());*/
		
		//Codigo Alternativo
		
		Empleado[] misEmpleados=new Empleado[4];
		misEmpleados[0]=new Empleado("Raul", 15000, 2000, 6, 25);
		misEmpleados[1]=new Empleado("Izas", 20000, 2015, 4, 30);
	    misEmpleados[2]=new Empleado("Noa", 30000, 2014, 10, 15);
	    misEmpleados[3]=new Empleado("Carla");
	  for  (int i=0;i<misEmpleados.length;i++){
		  misEmpleados[i].subeSueldo(5);
	  }
	  for (int i=0;i<misEmpleados.length;i++){
		  System.out.println("Primer empleado - " + misEmpleados[i].getNombre() + " / Fecha Alta - "
					+ misEmpleados[i].getAltaContrato() + " / Sueldo - " + misEmpleados[i].getSueldo());
	  }
	  System.out.println();
	  System.out.println("         Bucle for mejorado");
	  
	  System.out.println("-----------------------------------------------------");
	  
	  for(Empleado e: misEmpleados){
		  System.out.println("Primer empleado - " + e.getNombre() + " / Fecha Alta - "
					+ e.getAltaContrato() + " / Sueldo - " + e.getSueldo());
		  
	  }

	}

}

class Empleado {
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
		nombre = nom;
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		altaContrato = calendario.getTime();

	}
	
	public Empleado(String nom){
		this(nom,10000,2000,01,01);
		
	}

	private String nombre;
	private double sueldo;
	private Date altaContrato;

	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            el nombre a establecer
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	/**
	 * @param sueldo
	 *            el sueldo a establecer
	 */
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	/**
	 * @return el altaContrato
	 */
	public Date getAltaContrato() {
		return altaContrato;
	}

	/**
	 * @param altaContrato
	 *            el altaContrato a establecer
	 */
	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}

	public void subeSueldo(double porcentaje) {
		double aumento = sueldo * porcentaje / 100;
		sueldo += aumento;
	}

}