package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class eje9_10Ud3_vectores {

    static void main() {

        String palabras[] = {"mandarina","jacobo","melocoton","melon"};

        Scanner teclado = new Scanner(System.in);

        System.out.println("intro. una letra inicial");
        char letra = teclado.next().charAt(0);

        for (int i = 0 ; i< palabras.length;i++){

            if (letra == palabras[i].charAt(0)){
                System.out.println(palabras[i]);
            }
        }



    }
}
