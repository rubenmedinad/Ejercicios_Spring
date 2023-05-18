package com.softtek.modelos.ejercicio1;

public class circulo extends Figura {
    private double radio;

    public circulo(int coordenadaX, int coordenadaY, double radio) {
        super(coordenadaX, coordenadaY);
        this.radio = radio;
    }

    public String posicion() {
        return super.posicion() + ", Radio del círculo: " + radio;
    }
}
