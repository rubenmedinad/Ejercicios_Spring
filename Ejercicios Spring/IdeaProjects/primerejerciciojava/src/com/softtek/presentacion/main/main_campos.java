package com.softtek.presentacion.main;

import com.softtek.modelo.campos;

public class main_campos {
    public static void main(String[] args) {
        campos campo = new campos(5);

        int valorX = campo.muestra();
        campo.incrementa();

    }
}
