package com.softtek.modelo;

public class calificaciones {
    private String nombreCompleto;
    private double[] parciales;
    public calificaciones(String nombreCompleto, int cantidadParciales) {
        this.nombreCompleto = nombreCompleto;
        this.parciales = new double[cantidadParciales];
    }
    public String getNombreCompleto() {return nombreCompleto;}
    public void setParcial(int indice, double valor) {
        this.parciales[indice] = valor;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double parcial : parciales) {
            suma += parcial;
        }
        return suma / parciales.length;
    }
    public void mostrarCalificaciones() {
        for (int i = 0; i < parciales.length; i++) {
            System.out.println("Parcial " + (i + 1) + ": " + parciales[i]);
        }
    }


    public double calcularNotaMediaFinal() {
        double suma = 0;
        for (double parcial : parciales) {
            suma += parcial;
        }
        return suma / parciales.length;
    }

}


