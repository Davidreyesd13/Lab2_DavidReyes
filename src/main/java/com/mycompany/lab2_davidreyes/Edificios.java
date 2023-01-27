package com.mycompany.lab2_davidreyes;

public class Edificios {
int pisos;
int locales;
String Direccion;
String estado;

    public Edificios(int pisos, int locales, String Direccion, String estado) {
        this.pisos = pisos;
        this.locales = locales;
        this.Direccion = Direccion;
        this.estado = estado;
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

    @Override
    public String toString() {
        return "Edificio: " + "pisos: " + pisos + ", locales: " + locales + ", Direccion: " + Direccion + ", estado: " + estado;
    }
 
}
