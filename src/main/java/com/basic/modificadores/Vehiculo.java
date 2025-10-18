package com.basic.modificadores;

public class Vehiculo {
	
	public String marca;          // Accesible desde cualquier lugar
    private String modelo;        // Accesible solo dentro de esta clase
    protected int velocidadMaxima; // Accesible dentro del paquete y subclases

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getModelo() {
        return modelo; // Método público que permite acceder al atributo privado
    }

}
