package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica1_ud3_samurais {

    static void main() {

        Scanner key = new Scanner(System.in);
        Random aleatorio = new Random();

        int resultado = 0;
        int resultado2 = 0;
        boolean fallo = false;
        do {

                System.out.println("Equipo 1");
                System.out.println("introduce la potencia de los samurais ");

                String potencia1 = key.nextLine();
                String[] vector = potencia1.split(" ");
                if (vector.length == 7){



            System.out.println(Arrays.toString(vector));

            int tamanyo = vector.length;

            for (int i = 0; i < tamanyo; i++) {

                resultado += Integer.parseInt(vector[i]);

                if ( resultado<30){

                    System.out.println("Error.La potencia ha de ser menor de 30 ");
                    System.out.println(resultado);
                    return;
                }

            }
            System.out.println(resultado);
        }
         System.out.println("equipo completado");


            System.out.println("Equipo 2");
            System.out.println("introduce la potencia de los samurais ");

            String potencia2 = key.nextLine();
            String[] vector2 = potencia2.split(" ");

            System.out.println(Arrays.toString(vector2));

            int tamanyo2 = vector2.length;

            for (int i = 0; i < tamanyo2; i++) {

                resultado2 += Integer.parseInt(vector2[i]);

                if (resultado < 30 ){

                    System.out.println("Error.La potencia ha de ser menor de 30 ");
                    System.out.println(resultado2);
                    return;
                }

            }
            System.out.println(resultado2);



        System.out.println("equipo completado");
        System.out.println(".........................");
        System.out.println("*COMIENZA LA BATALLA*");

        int turnow = aleatorio.nextInt(1,8);
        for (int i = turnow;i<potencia1.length();i++){

          int v1 = Integer.parseInt(vector[i - 1]);
            int v2 = Integer.parseInt(vector2[i - 1]);

            if (v1>v2){
                System.out.println("El samurai del equipo 1 de esta posicion " + i + "gana");

            }else if (v2>v1){
                System.out.println("El samurai del equipo 2 de esta posicion " + i + "gana");
            }



        }

    }while (fallo);











    }
}
