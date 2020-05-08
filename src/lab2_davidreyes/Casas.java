package lab2_davidreyes;

public class Casas {
private int numcasa;
private int numbloque;
private String color;
private double ancho;
private double largo;
private int pisos;
private int baños;
private String dueño;
private String estado;
private String ing;

    public Casas() {
    }

    public Casas(int numcasa, int numbloque, String color, double ancho,double largo, int pisos, int baños, String dueño, String estado, String ing) {
        this.numcasa = numcasa;
        this.numbloque = numbloque;
        this.color = color;
        this.ancho=ancho;
        this.largo = largo;
        this.pisos = pisos;
        this.baños = baños;
        this.dueño = dueño;
        this.estado = estado;
        this.ing = ing;
    }

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getNumbloque() {
        return numbloque;
    }

    public void setNumbloque(int numbloque) {
        this.numbloque = numbloque;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    @Override
    public String toString() {
        return "Casa:" + "numcasa=" + numcasa + ", numbloque=" + numbloque + ", color=" + color + ", largo=" + largo + ", pisos=" + pisos + ", ba\u00f1os=" + baños + ", due\u00f1o=" + dueño + ", estado=" + estado + ", ing=" + ing ;
    }
    
}
