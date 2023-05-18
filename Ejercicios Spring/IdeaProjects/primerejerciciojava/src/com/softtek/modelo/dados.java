package com.softtek.modelo;

public class dados {
    int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public dados (){}
    public dados(int numero) {
        this.numero = numero;
    }
    public void lanzardados(){
        numero = (int) (Math.random() * 6) + 1;

        if (numero == 1){
            System.out.println("El número es 1 \n *  ");
        }
        if (numero == 2){
            System.out.println("El número es 2 \n *   * ");
        } if (numero == 3){
            System.out.println("El número es 3 \n * \n   *  \n     * ");

        } if (numero == 4){
            System.out.println("El número es 4 \n *  * \n *  * ");
        } if (numero == 5){
            System.out.println("El número es 5 \n *   * \n   * \n *   *");
        }
        if (numero == 6){
            System.out.println("El número es 6 \n *  * \n *  * \n *  *");
        }
    }
}
