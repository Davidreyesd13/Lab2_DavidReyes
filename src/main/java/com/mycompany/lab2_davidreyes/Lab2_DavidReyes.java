package com.mycompany.lab2_davidreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DavidReyes {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        ArrayList list = new ArrayList();
        ArrayList users= new ArrayList();
        users.add(new Usuario("Andres", "Nuila", "Admin", "1234"));
        int opcion;
        System.out.println("1.Crear casa\n2.Crear edificios\n3.Crear Solares\n4.Listar\n0.Salir");
        opcion = l.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    System.out.println("Primer parametro");
                    System.out.println("Segundo parametro");
                    System.out.println("Tercer parametro");
                    System.out.println("cuarto parametro");
                    System.out.println("quinto parametro");
                    //list.add();

                    break;
                case 2:
                    
                    break;
                case 3:
                    for (Object o : list) {
                        System.out.println(""+list.indexOf(o)+"- "+o);
                    }
                    System.out.println("Ingrese la opcion que desea eliminar");
                    opcion= l.nextInt();
                    list.remove(opcion);
                    break;
                case 4:
                    for (Object o : list) {
                        System.out.println(""+list.indexOf(o)+"- "+o);
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
