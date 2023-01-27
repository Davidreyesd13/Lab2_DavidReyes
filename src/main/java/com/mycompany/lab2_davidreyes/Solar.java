package com.mycompany.lab2_davidreyes;

public class Solar {

    int anch;
    int largo;
    int area;
    String due;

    public Solar() {
    }

    public Solar(int anch, int largo, int area, String due) {
        this.anch = anch;
        this.largo = largo;
        this.area = area;
        this.due = due;
        this.due = due;
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

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    @Override
    public String toString() {
        return "Solar " + "anch: " + anch + ", largo: " + largo + ", area: " + area + ", Dueño: " + due;
    }
}
