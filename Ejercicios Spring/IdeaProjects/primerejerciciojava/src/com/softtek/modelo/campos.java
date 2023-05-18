package com.softtek.modelo;

public class campos {
    int x;

    public campos(int x) {
        this.x = x;
    }
    public campos (){}

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int muestra(){
        System.out.println("X vale "+this.x);
        return x;
    }
    public void incrementa() {
        x++;
        System.out.println("X incrementada vale "+this.x);
    }
}
