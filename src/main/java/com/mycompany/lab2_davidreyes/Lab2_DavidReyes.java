package com.mycompany.lab2_davidreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DavidReyes {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        ArrayList list = new ArrayList();
        int opcion;
        System.out.println("1.Crear\n2.Modificar\n3.Eliminar\n4.Listar\n0.Salir");
        opcion = l.nextInt();
        while (opcion != 0) {
            switch (opcion) {
                case 1:

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