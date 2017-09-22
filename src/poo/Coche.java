package poo;

public class Coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private Boolean asientosCuero, climatizador;

	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		pesoPlataforma = 500;

	}

	public String getPlataforma() {
		return "la plataforma tiene " + ruedas + " ruedas ,es de color " + color + " y pesa " + pesoPlataforma
				+ "kg . Mide " + largo / 1000 + " metros de largo y " + ancho + " cm de ancho, con un motor de " + motor
				+ " centimetros cubicos";
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getColor() { // dime el color

		return color;
	}

	public void setColor(String colorCoche) { // establece el color
		color = colorCoche;
		// this.color = color;

	}

	// establecemos el valor de los asientos de cuero
	public void setAsientosCuero(String asientosCuero) {
		if (asientosCuero.equalsIgnoreCase("si")) {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}

	public String getAsientosCuero() {
		if (asientosCuero == true) {
			return "el coche tiene asientos de cuero";
		} else {
			return "el coche no tiene asientos de cuero";
		}
	}

	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")){
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String getClimatizador() {
		if (this.climatizador == true) {
			return "El coche tiene climatizador";
		} else {
			return "El coche tiene aire acondicionado";

		}
	}

	public String pesoCoche() {
		int pesoCarroceria = 500;
		pesoTotal = pesoCarroceria + pesoPlataforma;
		if (asientosCuero == true) {
			pesoTotal = pesoTotal + 50;
		}
		if (climatizador == true) {
			pesoTotal = pesoTotal + 20;
		}
		return "El peso total del coche con carroceria es de " + pesoTotal + " kg.";
	}
	public int getprecioCoche(){
		int precioFinal=10000;
		if(climatizador==true){
			precioFinal+=2000;
		}
		if(asientosCuero==true){
			precioFinal+=3000;
		}
		return precioFinal;
	}
	
}
