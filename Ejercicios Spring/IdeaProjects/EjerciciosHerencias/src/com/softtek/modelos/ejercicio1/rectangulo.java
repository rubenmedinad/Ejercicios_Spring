package com.softtek.modelos.ejercicio1;

public class rectangulo extends Figura {
    private double ancho;
    private double alto;

    public rectangulo(int coordenadaX, int coordenadaY, double ancho, double alto) {
        super(coordenadaX, coordenadaY);
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String posicion() {
        return super.posicion() + ", Ancho del rectángulo: " + ancho + ", Alto del rectángulo: " + alto;
    }
}