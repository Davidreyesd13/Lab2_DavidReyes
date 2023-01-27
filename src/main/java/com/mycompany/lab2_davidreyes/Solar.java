package com.mycompany.lab2_davidreyes;

public class Solar {
int anch;
int largo;
int area;

    public Solar() {
    }

    public Solar(int anch, int largo, int area) {
        this.anch = anch;
        this.largo = largo;
        this.area = area;
    }

    public int getAnch() {
        return anch;
    }

    public void setAnch(int anch) {
        this.anch = anch;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Solar " + "anch: " + anch + ", largo: " + largo + ", area: " + area ;
    }
}
