package org.example;

import java.util.Scanner;

public class Practica_UD3_Navidad {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta palabra a imprimir");
        String palabra  = teclado.next();
        teclado.nextLine();
        String palabra_vector[] = palabra.split("");

        System.out.println("Inserta la cant a imprimir ");
        String cantidad = teclado.nextLine();
        String cantidad_vector[] = cantidad.split(" ");

        if ( palabra_vector.length == cantidad_vector.length){

            for (int i = 0;i<palabra_vector.length;i++){

                for (int j=0;j<Integer.parseInt(cantidad_vector[i]);j++) {

                    System.out.print(palabra_vector[i]);
                }
            }





        }else {
            System.out.println("la palbra y las cifras no coinciden");
        }


    }
}
