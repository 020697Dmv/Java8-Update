package com.basic.modificadores;

public class Coche  extends Vehiculo{

	public Coche(String marca, String modelo, int velocidadMaxima) {
		super(marca, modelo, velocidadMaxima);
	}
	
	public void mostrarDetalles() {
        System.out.println("Marca: " + marca); // Acceso permitido (public)
        System.out.println("Modelo: " + getModelo()); // Acceso permitido a través del getter
        System.out.println("Velocidad máxima: " + velocidadMaxima); // Acceso permitido (protected)
    }
}
