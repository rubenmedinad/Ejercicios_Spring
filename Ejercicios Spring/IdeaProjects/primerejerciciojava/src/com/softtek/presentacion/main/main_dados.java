package com.softtek.presentacion.main;

import com.softtek.modelo.dados;

import java.util.Scanner;

public class main_dados {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        dados dados = new dados();
        dados.lanzardados();
        String continuar;
        do {
            System.out.println("¿Quieres lanzar el dado de nuevo? (s/n)");
            continuar = teclado.next();

            if (continuar.equals("s")) {
                dados.lanzardados();
            }
        } while (continuar.equals("s"));
        teclado.close();
    }
}