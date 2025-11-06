package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EjerciciosVectores {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int vector[] = new int[8];
        int contador = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(501);
            contador += vector[i];

        }
        System.out.println(contador);
        System.out.println(Arrays.toString(vector));
        System.out.println("//eje 2//");

        int vector2[] = {4, 7, 3, 4, 9};
        int aux = 0;

        for (int i2 = 0; i2 < vector2.length / 2; i2++) {

            aux = vector2[i2];
            vector2[i2] = vector2[vector2.length - 1 - i2];
            vector2[vector2.length - 1 - i2] = aux;

        }
        System.out.println(Arrays.toString(vector2));
        System.out.println("//eje 3//");

        int vector3[] = new int[25];




        for (int i3 = 0; i3 < vector3.length; i3++) {

            vector3[i3] = aleatorio.nextInt(101);


        }
        System.out.println("numero para buscar");
        int num = teclado.nextInt();

        int contador3 = 0;
        for (int i3 = 0 ; i3 <vector3.length;i3++) {
            if (vector3[i3]==num){

                contador3++;
            }
        }
        System.out.println("el numro " + num + " aparece "+ contador3 +" veces");



    }
}



