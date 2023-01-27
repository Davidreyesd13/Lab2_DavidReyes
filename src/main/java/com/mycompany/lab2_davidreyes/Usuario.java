package com.mycompany.lab2_davidreyes;

public class Usuario {

    String nombre;
    int edad;
    String user;
    String Password;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String user, String Password) {
        this.nombre = nombre;
        this.edad = edad;
        this.user = user;
        this.Password = Password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @Override
    public String toString() {
        return "Usuario " + "nombre: " + nombre + ", apellido: " + edad + ", user: " + user + ", Password: " + Password;
    }

}
