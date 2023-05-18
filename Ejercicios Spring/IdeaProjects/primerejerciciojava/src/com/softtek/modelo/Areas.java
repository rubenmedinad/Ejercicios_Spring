package com.softtek.modelo;

public class Areas {
    float alto;
    float largo;
    float radio;



    public float getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public Areas(){}
    public Areas(float alto, float largo, float radio) {
        this.alto = alto;
        this.largo = largo;
        this.radio = radio;
    }
    public  void areaCirculo(){
        System.out.println("El area del circulo es: "+Math.PI * Math.pow(this.radio,2));
    }
    public void areaRectangulo(){
        System.out.println("El area del rectangulo es: "+this.alto*this.largo);
    }
}
