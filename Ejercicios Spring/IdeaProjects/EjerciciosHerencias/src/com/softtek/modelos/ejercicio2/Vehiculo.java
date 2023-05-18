package com.softtek.modelos.ejercicio2;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio;

    public Vehiculo(String marca, String modelo, int año, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando...");
    }

    public void frenar() {
        System.out.println("El vehículo está frenando...");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Precio: " + precio);
    }
}