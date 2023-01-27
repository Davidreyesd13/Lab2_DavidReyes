package com.mycompany.lab2_davidreyes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2_DavidReyes {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        ArrayList users = new ArrayList();
        users.add(new Usuario("Andres", 22, "Admin", "admin1234"));
        int opcion = 1, flag = 1;

        while (opcion != 0) {
            System.out.println("1.- Registro de Inmueble/Solar\n"
                    + "2.- Manejo de Estados\n"
                    + "3.- Log In/Sign Up\n"
                    + "0.- Salir");
            opcion = l.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Solo el admin puede entrar\n tiene que logearse");
                    break;

                case 2:
                    System.out.println("Solo el admin puede entrar\n tiene que logearse");
                    break;
                case 3:
                    System.out.println("1.Log In\n2.Sing up");
                    opcion = l.nextInt();
                    switch (opcion) {
                        case 1:
                            while (flag != 0) {
                                System.out.println("----Log in---");
                                System.out.println("Ingrese el user");
                                String user = l.next();
                                System.out.println("Ingrese el password");
                                String pass = l.next();
                                for (int i = 0; i < users.size(); i++) {
                                    if (user.equals("admin") && pass.equals("admin1234")) {
                                        while (opcion != 3) {

                                            System.out.println("1.- Registro de Inmueble/Solar\n"
                                                    + "2.- Manejo de Estados\n"
                                                    + "3.- Logout"
                                                    + "0.- Salir");
                                            opcion = l.nextInt();
                                            switch (opcion) {
                                                case 1:
                                                    System.out.println("1. Crear\n2.Modificar\n3.Eliminar\n4.Lisatr");
                                                    opcion = l.nextInt();
                                                    switch (opcion) {
                                                        case 1:
                                                            System.out.println("1.Casas\n2.Edificios\n3.Solares");
                                                            opcion=l.nextInt();
                                                            switch (opcion) {
                                                                case 1:
                                                                    list.add(crearCasas());
                                                                    break;
                                                                case 2:
                                                                    list.add(crearEdificios());
                                                                break;
                                                                case 3:
                                                                    list.add(crearSolar());
                                                                break;
                                                                default:
                                                                    System.out.println("Opcion no valida");
                                                            }
                                                            //
                                                            break;
                                                        case 2:
                                                            
                                                            break;
                                                        case 3:
                                                            for (Object o : list) {
                                                                System.out.println("" + list.indexOf(o) + "- " + o);
                                                            }
                                                            System.out.println("Ingrese la opcion que desea eliminar");
                                                            opcion = l.nextInt();
                                                            list.remove(opcion);
                                                            break;
                                                        case 4:
                                                            for (Object o : list) {
                                                                System.out.println("" + list.indexOf(o) + "- " + o);
                                                            }
                                                            break;
                                                        case 0:
                                                            System.exit(0);
                                                            break;
                                                        default:
                                                            System.out.println("Opcion no valida");
                                                    }
                                                    break;
                                                case 2:

                                                    break;
                                                case 3:

                                                    break;
                                                case 0:
                                                    System.exit(0);
                                                default:
                                                    System.out.println("Opcion no valida");
                                            }
                                        }//fin while interno
                                    } else if (user.equals(((Usuario) users.get(i)).user) && pass.equals(((Usuario) users.get(i)).Password) && i > 0) {
                                        System.out.println("1.- Registro de Inmueble/Solar\n"
                                                + "2.- Manejo de Estados\n"
                                                + "3.- Logout"
                                                + "\n4. Comprar\n"
                                                + "0.- Salir");
                                        opcion = l.nextInt();
                                        switch (opcion) {
                                            case 1:
                                                System.out.println("No tiene accesos");
                                                break;
                                            case 2:
                                                System.out.println("No tiene accesos");
                                                break;
                                            case 3:
                                                System.out.println("Buen dia");
                                                break;
                                            case 4:
                                                for (Object o : list) {
                                                    System.out.println("" + list.indexOf(o) + ". " + o);
                                                }
                                                System.out.println("Ingrese la opcion que desea comprar");
                                                int c = l.nextInt();
                                                if (list.get(c) instanceof Casas) {
                                                    ((Casas) list.get(c)).setDue(((Usuario) users.get(i)).getNombre());
                                                } else if (list.get(c) instanceof Edificios) {
                                                    ((Edificios) list.get(c)).setDue(((Usuario) users.get(i)).getNombre());
                                                } else {
                                                    ((Solar) list.get(c)).setDue(((Usuario) users.get(i)).getNombre());
                                                }
                                                break;
                                            case 0:
                                                System.exit(0);
                                            default:
                                                System.out.println("Opcion no valida");
                                        }
                                    } else {
                                        System.out.println("usuario no encontrado");
                                        break;
                                    }//fin del if
                                }//fin del for
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre");
                            String nombre = l.next();
                            System.out.println("Ingrese la edad");
                            int edad = l.nextInt();
                            System.out.println("Ingrese el username");
                            String username = l.next();
                            System.out.println("Ingrese el Password");
                            String pass = l.next();
                            users.add(new Usuario(nombre, edad, username, pass));
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida");
            }//fin del switch main
        }//fin del while main
    }// fin del main

    static Casas crearCasas() {
        System.out.println("Ingrese numero de casa");
        int numc = l.nextInt();
        System.out.println("Ingrese el numero de bloque");
        int bloq = l.nextInt();
        Color c = JColorChooser.showDialog(null, "Ingrese el color", Color.yellow);
        System.out.println("Ingrese el ancho");
        int anch = l.nextInt();
        System.out.println("Ingrese el largo");
        int largo = l.nextInt();
        System.out.println("Ingrese el la cantidad de baños");
        int bath = l.nextInt();
        System.out.println("ingrese la cantidad de cuartos");
        int cuartos = l.nextInt();
        System.out.println("Ingrese el estado");
        String estado = l.next();
        return new Casas(numc, bloq, c, anch, largo, bath, cuartos, estado, "");
    }
    static Edificios crearEdificios(){
        System.out.println("Ingrese la cantidad de pisos");
        int pisos = l.nextInt();
        System.out.println("Ingrese cantidad de locales");
        int locales= l.nextInt();
        System.out.println("Ingrese la direccion del edificio");
        l.next();
        String Direccion = l.nextLine();
        System.out.println("Ingrese el estado del edificio");
        String estado = l.next();
        return new Edificios(pisos, locales, Direccion, estado, "");
    }
    static Solar crearSolar(){
        System.out.println("Ingrese el ancho ");
        int anch =l.nextInt();
        System.out.println("Ingrese el largo");
        int largo = l.nextInt();
        return new Solar(anch, largo, largo*anch, "");
    }
}
