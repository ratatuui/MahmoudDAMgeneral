package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Practica3_ud3_ZXSpectrum {

    static void main() {
        //Realizaré un programa donde validara una serie de letras que representan los colores que se podían usar en la Spectrum.
        // la matriz necesaria a de ser de una altura y anchura,mínima y máxima de 8 y 48 respectivamente. Además, los valores han de ser múltiplos de 8.
        //el rango de las letras es de la A a la O
        //la validacion consiste en comprobar en que como maximo haya 2 letras diferentes en grupos de 8X8.
        Scanner teclado = new Scanner(System.in);
        //Primero pongo y defino las variables necesarias
        int ancho = 0;
        int alto = 0;
        boolean fallo = false;


        System.out.println("*********Validador de compatibilidad ZX Spectrum*********");
        System.out.println("Introduce la resolucion de tu pantalla (ancho X alto)");
        System.out.println("Ancho:");

        ancho = teclado.nextInt();

        System.out.println();

        //Aqui valido la introduccion del usuario por si el numero no sea divisible entre 8

        if (!(ancho % 8 == 0)) {
            System.out.println("tiene que ser un numero divisible entre 8");
            return;
        }

        teclado.nextLine();
        System.out.println("Alto:");

        alto = teclado.nextInt();
        if (!(alto % 8 == 0)) {
            System.out.println("tiene que ser un numero divisible entre 8");
            return;
        }
        String matriz[][] = new String[alto][ancho];
        System.out.println("Introduce (linea a linea) los colores de tu imagen para cada pixel");
        //anotaciones
//        for (int i = 0; i < alto; i++) {
//           String fila = teclado.nextLine();
//
//           if (fila.length() == ancho){
//
//               if (fila.matches("[A-O]+")){
//                   matriz[i] = fila.split("");
//               }else {
//                   System.out.println("A-O");
//                   i--;
//               }
//           }
//
//        }
//        for (String[] fila: matriz){
//            System.out.println(Arrays.toString(fila));
//        }

        //Aqui uso un for para recorrer las filas y columnas validando las letras correspondientes
        //con el .matches
        externo:
        for (int i = 0; i < matriz.length; i++) {
            String[] fila;
            fila = teclado.next().split("");

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = fila[j];
                if (!(fila[j].matches("[A-O]"))) {
                    System.out.println("solo se permite letas entre (A-O)");
                    i--;
                    continue externo;
                }


            }

        }
        for (String fila[] : matriz) {
            System.out.println(Arrays.toString(fila));
        }
        //En este punto creo otras variables necesarias y creo un aux que me permite registrar en el
        // letras y analizarlas con un bucle for
        int errores = 0;
        String pos1 = matriz[0][0];
        String aux = "z";
        ext:
        for (int i = 0; i < matriz[0].length - 1; i++) {

            if (!matriz[0][i].contains(matriz[0][i + 1])) {

                errores++;

                if (!matriz[0][i].contains(pos1)) {

                    if (aux.contains("z")) {

                        aux = matriz[0][i + 1];

                    } else {
                        if (!matriz[0][i].contains(aux)) fallo = true;

                    }
                }
            }
            i++;

        }
        if (fallo) {
            System.out.println("No es compatible");
        } else {

            System.out.println("Es compatible");

        }
        //Fin del programa
    }
}
