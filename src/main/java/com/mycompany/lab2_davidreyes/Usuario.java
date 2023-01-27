package com.mycompany.lab2_davidreyes;

public class Usuario {

    String nombre;
    String apellido;
    String user;
    String Password;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String user, String Password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.user = user;
        this.Password = Password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return "Usuario " + "nombre: " + nombre + ", apellido: " + apellido + ", user: " + user + ", Password: " + Password;
    }

}
