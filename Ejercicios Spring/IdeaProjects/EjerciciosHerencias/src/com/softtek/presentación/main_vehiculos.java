package com.softtek.presentación;

import com.softtek.modelos.ejercicio2.Avion;
import com.softtek.modelos.ejercicio2.Coche;
import com.softtek.modelos.ejercicio2.Barco;
import com.softtek.modelos.ejercicio2.Tren;

public class main_vehiculos {
    public static void main(String[] args) {
        Coche coche = new Coche("Toyota", "Corolla", 2021, 25000.0, 4);
        Barco barco = new Barco("Yamaha", "AR210", 2022, 40000.0, 21);
        Avion avion = new Avion("Boeing", "737", 2020, 80000000.0, 2);
        Tren tren = new Tren("Renfe", "AVE", 2019, 150000000.0, 10);

        coche.mostrarInfo();
        coche.acelerar();
        coche.frenar();
        coche.abrirMaletero();

        barco.mostrarInfo();
        barco.acelerar();
        barco.frenar();
        barco.levantarAncla();

        avion.mostrarInfo();
        avion.acelerar();
        avion.frenar();
        avion.despegar();

        tren.mostrarInfo();
        tren.acelerar();
        tren.frenar();
        tren.engancharVagon();
    }
}
