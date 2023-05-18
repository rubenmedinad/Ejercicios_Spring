package com.softtek.presentación;
import com.softtek.modelos.ejercicio1.circulo;
import com.softtek.modelos.ejercicio1.Figura;
import com.softtek.modelos.ejercicio1.rectangulo;
public class main_figura {
    public static void main(String[] args) {
        Figura figura = new Figura(10, 20);
        System.out.println(figura.posicion());

        circulo circulo = new circulo(30, 40, 5.0);
        System.out.println(circulo.posicion());

        rectangulo rectangulo = new rectangulo(50, 60, 10.0, 20.0);
        System.out.println(rectangulo.posicion());
    }

}
