package com.softtek.modelos.ejercicio1;

public abstract class Planta {
    protected String especie;
    protected int altura;
    protected boolean tieneFlores;

    public Planta(String especie, int altura, boolean tieneFlores) {
        this.especie = especie;
        this.altura = altura;
        this.tieneFlores = tieneFlores;
    }

    public abstract void regar(int cantidad, int tiempo);

    public void crecer(int centimetros) {
        altura += centimetros;
    }

    public void florecer() {
        tieneFlores = true;
    }

    public void marchitar() {
        tieneFlores = false;
    }
}