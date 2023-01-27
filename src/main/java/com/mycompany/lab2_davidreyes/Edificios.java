package com.mycompany.lab2_davidreyes;

public class Edificios {

    int pisos;
    int locales;
    String Direccion;
    String estado;
    String due;

    public Edificios(int pisos, int locales, String Direccion, String estado, String due) {
        this.pisos = pisos;
        this.locales = locales;
        this.Direccion = Direccion;
        this.estado = estado;
        this.due = due;
    }

    public Edificios() {
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
    }

    @Override
    public String toString() {
        return "Edificio: " + "pisos: " + pisos + ", locales: " + locales + ", Direccion: " + Direccion + ", estado: " + estado + ", Dueño: " + due;
    }

}
