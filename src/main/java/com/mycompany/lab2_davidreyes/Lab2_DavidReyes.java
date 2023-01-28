package com.mycompany.lab2_davidreyes;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;

public class Lab2_DavidReyes {

    static Scanner l = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        ArrayList<Usuario> users = new ArrayList();
        users.add(new Usuario("Andres", 22, "Admin", "admin1234"));
        int opcion = 1, flag;

        while (opcion != 0) {
            System.out.println("1.- Registro de Inmueble/Solar\n"
                    + "2.- Manejo de Estados\n"
                    + "3.- Log In/Sign Up\n"
                    + "0.- Salir");
            opcion = l.nextInt();
            flag = 1;
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

                                    //Menu de Admin
                                    if (user.equals("admin") && pass.equals("admin1234")) {
                                        while (opcion != 3) {

                                            System.out.println("1.- Registro de Inmueble/Solar\n"
                                                    + "2.- Manejo de Estados\n"
                                                    + "3.- Logout\n"
                                                    + "0.- Salir");
                                            opcion = l.nextInt();
                                            switch (opcion) {
                                                case 1:
                                                    System.out.println("1. Crear\n2.Modificar\n3.Eliminar\n4.Listar");
                                                    int opc = l.nextInt();
                                                    switch (opc) {
                                                        case 1:
                                                            //crear
                                                            System.out.println("1.Casas\n2.Edificios\n3.Solares");
                                                            opc = l.nextInt();
                                                            switch (opc) {
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
                                                            break;
                                                        case 2:
                                                            System.out.println("1.Casa\n2.Edificio\n3.Solar");
                                                            int opm = l.nextInt();
                                                            switch (opm) {
                                                                case 1:
                                                                    //Casas Mod
                                                                    for (Object o : list) {
                                                                        if (o instanceof Casas) {
                                                                            System.out.println("" + list.indexOf(o) + "- " + o);
                                                                        }
                                                                    }
                                                                    System.out.println("Ingrese la casa a modificar: ");
                                                                    int mod = l.nextInt();
                                                                    System.out.println("1.Numero de casa\n2.Numero de bloque\n3.Color\n4.Ancho\n5.Largo\n6.Baños\n7.Cuartos\n8.Estado");
                                                                    opm = l.nextInt();
                                                                    switch (opm) {
                                                                        case 1:
                                                                            System.out.println("Ingrese el nuevo numero de casa");
                                                                            int nc = l.nextInt();
                                                                            ((Casas) list.get(mod)).setNumc(nc);
                                                                            break;
                                                                        case 2:
                                                                            System.out.println("Ingrese el nuevo bloque");
                                                                            int bloq = l.nextInt();
                                                                            ((Casas) list.get(mod)).setBloq(bloq);
                                                                            break;
                                                                        case 3:
                                                                            ((Casas) list.get(mod)).setColor(JColorChooser.showDialog(null, "elija el nuveo color", Color.yellow));
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("Ingrese el nuevo ancho");
                                                                            int anch = l.nextInt();
                                                                            ((Casas) list.get(mod)).setAnch(anch);
                                                                            break;
                                                                        case 5:
                                                                            System.out.println("Ingrese el largo");
                                                                            int larg = l.nextInt();
                                                                            ((Casas) list.get(mod)).setLargo(larg);
                                                                            break;
                                                                        case 6:
                                                                            System.out.println("Ingrese el nuevo numero de baños");
                                                                            int bath = l.nextInt();
                                                                            ((Casas) list.get(mod)).setBath(bath);
                                                                            break;
                                                                        case 7:
                                                                            System.out.println("Ingrese nuevo numeros de cuartos");
                                                                            int cuartos = l.nextInt();
                                                                            ((Casas) list.get(mod)).setCuartos(cuartos);
                                                                            break;
                                                                        case 8:
                                                                            System.out.println("Ingrese el nuevo Estado");
                                                                            String Estado = l.next();
                                                                            ((Casas) list.get(mod)).setEstado(Estado);
                                                                            break;
                                                                        default:
                                                                            System.out.println("Opcion no valida");
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    //Mod Edificios
                                                                    for (Object o : list) {
                                                                        if (o instanceof Edificios) {
                                                                            System.out.println("" + list.indexOf(o) + "- " + o);
                                                                        }
                                                                    }
                                                                    System.out.println("Ingrese el Edificio a modificar: ");
                                                                    mod = l.nextInt();
                                                                    System.out.println("1.Numero de pisos\n2.Cantidad de locales\n3.Direccion por referencia\n4.Estado");
                                                                    opm = l.nextInt();
                                                                    switch (opm) {
                                                                        case 1:
                                                                            System.out.println("Ingrese el numero de pisos");
                                                                            int pisos = l.nextInt();
                                                                            ((Edificios) list.get(mod)).setPisos(pisos);
                                                                            break;
                                                                        case 2:
                                                                            System.out.println("Ingrese la cantidad de locales nueva");
                                                                            int local = l.nextInt();
                                                                            ((Edificios) list.get(mod)).setLocales(local);
                                                                            break;
                                                                        case 3:
                                                                            System.out.println("Ingrese la nueva direccion");
                                                                            l.next();
                                                                            String dic = l.nextLine();
                                                                            ((Edificios) list.get(mod)).setDireccion(dic);
                                                                            break;
                                                                        case 4:
                                                                            System.out.println("Ingrese el nuevo Estado");
                                                                            String Estado = l.next();
                                                                            ((Edificios) list.get(mod)).setEstado(Estado);
                                                                            break;
                                                                        default:
                                                                            System.out.println("Opcion no valida");
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    //mod edificios
                                                                    for (Object o : list) {
                                                                        if (o instanceof Solar) {
                                                                            System.out.println("" + list.indexOf(o) + "- " + o);
                                                                        }
                                                                    }
                                                                    System.out.println("Ingrese el Edificio a modificar: ");
                                                                    mod = l.nextInt();
                                                                    System.out.println("1.ancho\n2.largo");
                                                                    opm = l.nextInt();
                                                                    switch (opm) {
                                                                        case 1:
                                                                            System.out.println("Ingrese el nuevo ancho");
                                                                            int anch = l.nextInt();
                                                                            ((Solar) list.get(mod)).setAnch(anch);
                                                                            break;
                                                                        case 2:
                                                                            System.out.println("Ingrese el nuevo ancho");
                                                                            int lar = l.nextInt();
                                                                            ((Solar) list.get(mod)).setLargo(lar);
                                                                            break;
                                                                        default:
                                                                            System.out.println("Opcion no valida");
                                                                    }
                                                                    break;
                                                                default:
                                                                    System.out.println("Opcion no valida");
                                                            }
                                                            break;
                                                        case 3:
                                                            //eliminar
                                                            for (Object o : list) {
                                                                System.out.println("" + list.indexOf(o) + "- " + o);
                                                            }
                                                            System.out.println("Ingrese la opcion que desea eliminar");
                                                            int ope = l.nextInt();
                                                            list.remove(ope);
                                                            break;
                                                        case 4:
                                                            //listar
                                                            System.out.println("1.Todos\n2.Casas\n3.Edificios\n4.Solar");
                                                            int lisp = l.nextInt();
                                                            switch (lisp) {
                                                                case 1:
                                                                    for (Object o : list) {
                                                                        System.out.println("" + list.indexOf(o) + "- " + o);
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    for (Object o : list) {
                                                                        if (o instanceof Casas) {
                                                                            System.out.println("" + list.indexOf(o) + "- " + o);
                                                                        }
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    for (Object o : list) {
                                                                        if (o instanceof Edificios) {
                                                                            System.out.println("" + list.indexOf(o) + "- " + o);
                                                                        }
                                                                    }
                                                                    break;
                                                                case 4:
                                                                    for (Object o : list) {
                                                                        if (o instanceof Solar) {
                                                                            System.out.println("" + list.indexOf(o) + "- " + o);
                                                                        }
                                                                    }
                                                                    break;
                                                                default:
                                                                    System.out.println("Opcion no valida");
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
                                                    //manejo estados
                                                    for (Object o : list) {
                                                        System.out.println("" + list.indexOf(o) + "- " + o);
                                                    }//impresion
                                                    System.out.println("Ingrese el numero del estado que desea modificar");
                                                    int ope = l.nextInt();
                                                    System.out.println("1.Listo\n2.Construccion\n3.En espera de demolicion\n4.Espera de construccion");
                                                    int op = l.nextInt();
                                                    switch (op) {
                                                        case 1:
                                                            if (list.get(opcion) instanceof Casas) {
                                                                ((Casas) list.get(ope)).setEstado("Listo");
                                                            } else if (list.get(ope) instanceof Edificios) {
                                                                ((Edificios) list.get(ope)).setEstado("Listo");
                                                            } else {
                                                                System.out.println("Solo se aceptan en Casas y Edificios");
                                                            }
                                                            break;
                                                        case 2:
                                                            if (list.get(opcion) instanceof Casas) {
                                                                ((Casas) list.get(ope)).setEstado("Construccion");
                                                            } else if (list.get(ope) instanceof Edificios) {
                                                                ((Edificios) list.get(ope)).setEstado("Construccion");
                                                            } else {
                                                                System.out.println("Solo se aceptan en Casas y Edificios");
                                                            }
                                                            break;
                                                        case 3:
                                                            if (list.get(ope) instanceof Casas) {
                                                                ((Casas) list.get(ope)).setEstado("Espera de Construccion");
                                                            } else if (list.get(ope) instanceof Edificios) {
                                                                ((Edificios) list.get(ope)).setEstado("Espera de Construccion");
                                                            } else {
                                                                System.out.println("Solo se aceptan en Casas y Edificios");
                                                            }
                                                            break;
                                                        case 4:
                                                            if (list.get(ope) instanceof Casas) {
                                                                ((Casas) list.get(ope)).setEstado("Espera de demolicion");
                                                            } else if (list.get(ope) instanceof Edificios) {
                                                                ((Edificios) list.get(ope)).setEstado("Espera de demolicion");
                                                            } else {
                                                                System.out.println("Solo se aceptan en Casas y Edificios");
                                                            }
                                                            break;
                                                        default:
                                                            System.out.println("Opcion no valida");
                                                    }//fin switch manejo de estados
                                                    break;
                                                case 3:
                                                    //log out
                                                    System.out.println("Buen dia");
                                                    flag = 0;
                                                    break;
                                                case 0:
                                                    //salida del sistema
                                                    System.exit(0);
                                                default:
                                                    System.out.println("Opcion no valida");
                                            }
                                        }//fin while interno
                                    } else if (user.equals(users.get(i).getUser()) && pass.equals(users.get(i).getPassword())) {
                                        //parte de usuario
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
                                                flag = 0;
                                                break;
                                            case 4:
                                                // la compra
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
                                    } else if (i == users.size()) {
                                        System.out.println("usuario no encontrado");
                                        flag = 0;
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
    }//fin metodo

    static Edificios crearEdificios() {
        System.out.println("Ingrese la cantidad de pisos");
        int pisos = l.nextInt();
        System.out.println("Ingrese cantidad de locales");
        int locales = l.nextInt();
        System.out.println("Ingrese la direccion del edificio");
        l.next();
        String Direccion = l.nextLine();
        System.out.println("Ingrese el estado del edificio");
        String estado = l.next();
        return new Edificios(pisos, locales, Direccion, estado, "");
    }//fin metodo

    static Solar crearSolar() {
        System.out.println("Ingrese el ancho ");
        int anch = l.nextInt();
        System.out.println("Ingrese el largo");
        int largo = l.nextInt();
        return new Solar(anch, largo, largo * anch, "");
    }// fin metodo
}
