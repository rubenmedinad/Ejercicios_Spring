package com.softtek.presentacion;
import com.softtek.modelos.ejercicio1.Cactus;
import com.softtek.modelos.ejercicio1.Planta;
import com.softtek.modelos.ejercicio1.PlantaTropical;

public class main_planta {
    public static void main(String[] args) {
    Planta planta1 = new PlantaTropical("Hibisco", 50, true);
    Planta planta2 = new Cactus("Echinocactus grusonii", 20, false);

    planta1.regar(500, 10);
    planta2.regar(50, 5);
}
}