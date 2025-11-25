package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Practica3_ud3_ZXSpectrum {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int ancho = 0;
        int alto = 0;


        System.out.println("*********Validador de compatibilidad ZX Spectrum*********");
        System.out.println("Introduce la resolucion de tu pantalla (ancho X alto)");
        System.out.println("Ancho:");

            ancho = teclado.nextInt();

            System.out.println();



        if (!(ancho % 8 == 0)){
            System.out.println("tiene que ser un numero divisible entre 8");
            return;
        }

        teclado.nextLine();
        System.out.println("Alto:");

        alto = teclado.nextInt();
        if (!(alto % 8 == 0)){
            System.out.println("tiene que ser un numero divisible entre 8");
            return;
        }
        String matriz[][]=new String[alto][ancho];
        System.out.println("Introduce (linea a linea) los colores de tu imagen para cada pixel");

        for (int i = 0; i < alto; i++) {
           String fila = teclado.nextLine();

           if (fila.length() == ancho){
               for (int j = 0; j < matriz.length; j++) {

                   matriz[i][j] = fila[j];
               }

               if (fila.matches("[A-O]+")){
                   matriz[i] = fila.split("");
               }else {
                   System.out.println("A-O");
                   i--;
               }
           }

        }
        for (String[] fila: matriz){
            System.out.println(Arrays.toString(fila));
        }





//        externo:
//        for (int i = 0; i < matriz.length; i++) {
//            String[] fila;
//            fila = teclado.next().split("");
//
//            for (int j = 0; j < matriz[i].length; j++) {
//                matriz[i][j] = fila[j];
//                if (!(fila[j].matches("A-O"))){
//                    System.out.println();
//                }else{
//                    System.out.println("solo se permite letas entre (A-O)");
//                    i--;
//                    continue externo;
//                }
//
//            }
//
//        }
//        for (String fila[] :matriz){
//            System.out.println(Arrays.toString(fila));
//        }


    }
}
