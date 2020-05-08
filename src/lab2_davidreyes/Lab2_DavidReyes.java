package lab2_davidreyes;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_DavidReyes {

    public static void main(String[] args) {
        ArrayList<login> log = new ArrayList();
        log.add(new login("leobanegas", "99"));
        Scanner leer = new Scanner(System.in);
        ArrayList<Casas> lista = new ArrayList();
        int construccion = 0, demolicion = 0;
        int numcasa;
        int numbloque;
        String color;
        double ancho;
        double largo;
        int pisos;
        int baños;
        String dueño;
        String estado = "";
        String ing;
        while (true) {

            System.out.println("Ingrese el usuario");
            String usuario = leer.nextLine();
            System.out.println("Ingrese la contraseña");
            String pass = leer.nextLine();
            if (log.get(0).getUser().equals(usuario) && log.get(0).getPass().equals(pass)) {//validacion del login
                while (true) {

                    System.out.println("1.Registros de casas\n2.Manejo de estados\n0.salir");
                    int opcion = leer.nextInt();
                    switch (opcion) {
                        case 0:
                            System.exit(0);
                        case 1:
                            System.out.println("1.Crear casa\n2.Listar casas\n3.Modificar casas\n4.Borrar casa");
                            opcion = leer.nextInt();
                            switch (opcion) {
                                case 1:
                                    System.out.println("Ingrese el numero de casa");
                                    numcasa = leer.nextInt();
                                    while (numcasa < 0) {
                                        System.out.println("Solo numeros positivos");
                                        System.out.println("Ingrese el numero de casa");
                                        numcasa = leer.nextInt();
                                    }
                                    System.out.println("Ingrese numero de bloque");
                                    numbloque = leer.nextInt();
                                    while (numbloque < 0) {
                                        System.out.println("SOlo numeros positivos");
                                        System.out.println("Ingrese numero de bloque");
                                        numbloque = leer.nextInt();
                                    }
                                    System.out.println("Ingrese color");
                                    leer.nextLine();
                                    color = leer.nextLine();
                                    System.out.println("Ingrese ancho de la casa");
                                    ancho = leer.nextDouble();
                                    while (ancho < 0) {
                                        System.out.println("Solo numeros positivos");
                                        System.out.println("Ingrese ancho de la casa");
                                        ancho = leer.nextDouble();
                                    }
                                    System.out.println("Ingrese Largo");
                                    largo = leer.nextDouble();
                                    System.out.println("De cuantos pisos es");
                                    pisos = leer.nextInt();
                                    System.out.println("Ingrese cantidad de baños");
                                    baños = leer.nextInt();
                                    System.out.println("tiene dueño?");
                                    String resp = leer.next();
                                    if (resp.equals("Si")) {
                                        System.out.println("Ingrese el nombre");
                                        leer.nextLine();
                                        dueño = leer.nextLine();
                                    } else {
                                        dueño = "No tiene";
                                    }
                                    System.out.println("Ingrese el Estado de la casa"
                                            + "\n1.Lista\n2.Construccion\n3.Construccion en espera"
                                            + "\n4.Espera de demolicion");
                                    int est = leer.nextInt();
                                    switch (est) {
                                        case 1:
                                            estado = "Lista";
                                            break;
                                        case 2:
                                            if (construccion < 5) {
                                                estado = "Construccion";
                                                construccion++;
                                            } else {
                                                System.out.println("No se pueden ingresar mas de construccion");
                                            }

                                            break;
                                        case 3:
                                            estado = "Construccion en espera";
                                            break;
                                        case 4:
                                            if (demolicion < 3) {
                                                estado = "Espera de demolicion";
                                                demolicion++;
                                            }else{
                                                System.out.println("No se puede agregar mas");
                                            }
                                            break;
                                        default:
                                            System.out.println("Opcion no validad");
                                            break;
                                    }

                                    System.out.println("Nombre del Ingeniero");
                                    leer.nextLine();
                                    ing = leer.nextLine();
                                    lista.add(new Casas(numcasa, numbloque, color, ancho, largo, pisos, baños, dueño, estado, ing));
                                    System.out.println("Casa Creada correctamente");
                                    break;
                                case 2:
                                    int cont = 1;
                                    for (Casas l : lista) {
                                        System.out.println(cont + "." + l);
                                        cont++;
                                    }
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    if (lista.isEmpty()) {
                                        System.out.println("Debe agregar casas");
                                    } else {
                                        cont = 1;
                                        for (Casas l : lista) {
                                            System.out.println(cont + "." + l);
                                            cont++;
                                        }
                                        System.out.println("Ingrese la posicion de la casa que desea borrar");
                                        int pos = leer.nextInt();
                                        lista.remove(pos - 1);
                                    }
                                    break;
                                default:
                                    System.out.println("Opcion invalida");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese el Estado a listar"
                                    + "\n1.Lista\n2.Construccion\n3.Construccion en espera"
                                    + "\n4.Espera de demolicion");
                            int est = leer.nextInt();
                            switch (est) {
                                case 1:
                                    int cont = 1;
                                    for (Casas l : lista) {
                                        if (l.getEstado().equals("Lista")) {
                                            System.out.println(cont + "." + l);
                                            cont++;
                                        }
                                    }
                                    break;
                                case 2:
                                    cont = 1;
                                    for (Casas l : lista) {
                                        if (l.getEstado().equals("Construccion")) {
                                            System.out.println(cont + "." + l);
                                            cont++;
                                        }
                                    }
                                    break;
                                case 3:
                                    cont = 1;
                                    for (Casas l : lista) {
                                        if (l.getEstado().equals("Construccion en espera")) {
                                            System.out.println(cont + "." + l);
                                            cont++;
                                        }
                                    }
                                    break;
                                case 4:
                                    cont = 1;
                                    for (Casas l : lista) {
                                        if (l.getEstado().equals("Espera de demolicion")) {
                                            System.out.println(cont + "." + l);
                                            cont++;
                                        }
                                    }
                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }

                            break;
                        default:
                            System.out.println("Opcion incorrecta");
                    }
                }
            } else {
                System.out.println("Contraseña o Usario incorrecta");
            }
        }
    }
}
