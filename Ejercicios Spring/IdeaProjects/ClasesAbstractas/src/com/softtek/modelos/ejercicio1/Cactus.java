package com.softtek.modelos.ejercicio1;

public class Cactus extends Planta {
    public Cactus(String especie, int altura, boolean tieneFlores) {
        super(especie, altura, tieneFlores);
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando el cactus " + especie + " con " + cantidad + "ml de agua durante " + tiempo + " segundos.");
    }

    public void espinar() {
        System.out.println("El cactus " + especie + " te ha pinchado!");
    }
}
