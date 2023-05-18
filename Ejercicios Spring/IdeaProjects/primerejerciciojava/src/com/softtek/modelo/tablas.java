package com.softtek.modelo;

public class tablas {
    public int getNumero() {
        return numero;

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public tablas(int numero) {
        this.numero = numero;
    }
    public tablas(){

    }

    int numero;
    int i=1;
    int resultado;

    public void tablas(){
        while(i<=10){
            resultado=numero*i;
            System.out.println(numero + " * " + i + " = " +resultado);
            i++;
        }
    }
}
