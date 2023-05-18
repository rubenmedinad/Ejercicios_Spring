package com.softtek.modelos.ejercicio1;

public class PlantaTropical extends Planta {
    public PlantaTropical(String especie, int altura, boolean tieneFlores) {
        super(especie, altura, tieneFlores);
    }

    @Override
    public void regar(int cantidad, int tiempo) {
        System.out.println("Regando la planta tropical " + especie + " con " + cantidad + "ml de agua durante " + tiempo + " minutos.");
    }
}