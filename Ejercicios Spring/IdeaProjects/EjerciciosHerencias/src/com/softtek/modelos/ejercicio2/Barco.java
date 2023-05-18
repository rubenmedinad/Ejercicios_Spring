package com.softtek.modelos.ejercicio2;

public class Barco extends Vehiculo {
    private int longitud;

    public Barco(String marca, String modelo, int año, double precio, int longitud) {
        super(marca, modelo, año, precio);
        this.longitud = longitud;
    }

    @Override
    public void acelerar() {
        System.out.println("El barco está acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("El barco está frenando...");
    }

    public void levantarAncla() {
        System.out.println("Levantando el ancla del barco...");
    }
}