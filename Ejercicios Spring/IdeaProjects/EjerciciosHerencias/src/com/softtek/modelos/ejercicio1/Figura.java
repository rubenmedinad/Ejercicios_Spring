package com.softtek.modelos.ejercicio1;

public class Figura {
    private int coordenadaX;
    private int coordenadaY;

    public Figura(int coordenadaX, int coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public String posicion() {
        return "Posición de la figura: (" + coordenadaX + "," + coordenadaY + ")";
    }
}
