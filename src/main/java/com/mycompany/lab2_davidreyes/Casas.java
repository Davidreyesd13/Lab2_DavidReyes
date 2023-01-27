package com.mycompany.lab2_davidreyes;

import java.awt.Color;

public class Casas {
int numc;
int bloq;
Color color;
int anch;
int largo;
int bath;
int cuartos;
String Estado;
String due;

    public Casas(int numc, int bloq, Color color, int anch, int largo, int bath, int cuartos, String Estado, String due) {
        this.numc = numc;
        this.bloq = bloq;
        this.color = color;
        this.anch = anch;
        this.largo = largo;
        this.bath = bath;
        this.cuartos = cuartos;
        this.Estado = Estado;
        this.due = due;
    }


    public Casas() {
    }

    public int getNumc() {
        return numc;
    }

    public void setNumc(int numc) {
        this.numc = numc;
    }

    public int getBloq() {
        return bloq;
    }

    public void setBloq(int bloq) {
        this.bloq = bloq;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }
    
    @Override
    public String toString() {
        return "Casas: " + "numc: " + numc + ", bloq: " + bloq + ", color: " + color + ", anch: " + anch + ", largo: " + largo + ", bath: " + bath + ", cuartos: " + cuartos + ", Estado: " + Estado+ ", Dueño: " + due;
    }
     
    
    
    
}
