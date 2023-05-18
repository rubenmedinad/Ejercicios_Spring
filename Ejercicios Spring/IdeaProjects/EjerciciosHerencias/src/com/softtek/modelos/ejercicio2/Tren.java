package com.softtek.modelos.ejercicio2;

public class Tren extends Vehiculo {
    private int numVagones;

    public Tren(String marca, String modelo, int año, double precio, int numVagones) {
        super(marca, modelo, año, precio);
        this.numVagones = numVagones;
    }

    @Override
    public void acelerar() {
        System.out.println("El tren está acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("El tren está frenando...");
    }

    public void engancharVagon() {
        System.out.println("Enganchando un vagón al tren...");
    }
}

