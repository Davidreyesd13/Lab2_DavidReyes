package com.mycompany.lab2_davidreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DavidReyes {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
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
                                                    ((Casas)list.get(c)).setDue(((Usuario)users.get(i)).getNombre());
                                                }else if(list.get(c) instanceof Edificios){
                                                    ((Edificios)list.get(c)).setDue(((Usuario)users.get(i)).getNombre());
                                                }else {
                                                    ((Solar)list.get(c)).setDue(((Usuario)users.get(i)).getNombre());
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
            }
        }
    }
}
