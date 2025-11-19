package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2_ud3_LaPrimitiva {

    static void main() {

        Random aleatorio = new Random();
        Scanner key = new Scanner(System.in);
        int numerosg[] = new int[6];

        for (int i = 0; i< numerosg.length; i++){

            numerosg[i] = aleatorio.nextInt(50);
        }

        boolean comprobar= true;

        while (comprobar) {
            Arrays.sort(numerosg);

            comprobar=false;

            for (int i = 0; i < numerosg.length; i++) {

                if (i != numerosg.length - 1 && numerosg[i] == numerosg[i + 1]) {

                    System.out.println("duplicado " + numerosg[i]);
                    numerosg[i] = aleatorio.nextInt(50);
                    comprobar = true;
                }
            }
            System.out.println(Arrays.toString(numerosg));
        //he creado el numero ganador(numerosg)

        System.out.println("Introduce tu boleto");
            String boleto = key.nextLine();
            String vector[] = boleto.split("-");

        boolean numeross = boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}");
        while (numeross){

        numeross = false;
         for (int i = 0;i<vector.length;i++) {

            if (i!=vector.length-1 && vector[i] == vector[i+1] ) {

            }
         }
            System.out.println(Arrays.toString(vector));
        }

    }

}}

