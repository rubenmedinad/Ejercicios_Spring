package com.softtek.presentacion.main;

import com.softtek.modelo.calificaciones;

import java.util.Scanner;

public class main_calificaciones {
     public static void main(String[] args) {
         calificaciones calificaciones = new calificaciones("Rubén Medina",3);
         calificaciones.setParcial(0, 7);
         calificaciones.setParcial(1, 8);
         calificaciones.setParcial(2, 6);
         double promedio = calificaciones.calcularPromedio();
         System.out.println("El alumno " + calificaciones.getNombreCompleto() + " tiene un promedio de " + promedio);
         System.out.println("Calificaciones de los parciales:");
         calificaciones.mostrarCalificaciones();
         double notaMediaFinal = calificaciones.calcularNotaMediaFinal();
         System.out.println("La nota media final del alumno es: " + notaMediaFinal);

     }

}
