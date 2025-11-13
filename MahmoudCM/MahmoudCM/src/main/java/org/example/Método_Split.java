package org.example;

import java.util.Arrays;

public class Método_Split {

    static void main() {

        String cadena = "111 222 123 123";

      String profesores[] =  cadena.split(" ");

        System.out.println(Arrays.toString(profesores));

        //pasar a int y funciona si cadena es numeros

        int vector[] = new int[profesores.length];

        for (int i =0;i<profesores.length;i++){

            vector[i] = Integer.parseInt(profesores[i]);

        }
    }
}
