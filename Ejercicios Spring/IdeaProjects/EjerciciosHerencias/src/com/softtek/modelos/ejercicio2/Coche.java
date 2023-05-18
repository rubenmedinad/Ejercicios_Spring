package com.softtek.modelos.ejercicio2;

public class Coche extends Vehiculo {
    private int numPuertas;

    public Coche(String marca, String modelo, int año, double precio, int numPuertas) {
        super(marca, modelo, año, precio);
        this.numPuertas = numPuertas;
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("El coche está frenando...");
    }

    public void abrirMaletero() {
        System.out.println("Abriendo el maletero del coche...");
    }
}