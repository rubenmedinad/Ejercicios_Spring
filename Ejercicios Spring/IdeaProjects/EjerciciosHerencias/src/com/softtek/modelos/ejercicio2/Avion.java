package com.softtek.modelos.ejercicio2;

public class Avion extends Vehiculo {
    private int numMotores;

    public Avion(String marca, String modelo, int año, double precio, int numMotores) {
        super(marca, modelo, año, precio);
        this.numMotores = numMotores;
    }

    @Override
    public void acelerar() {
        System.out.println("El avión está acelerando...");
    }

    @Override
    public void frenar() {
        System.out.println("El avión está frenando...");
    }

    public void despegar() {
        System.out.println("El avión está despegando...");
    }
}
