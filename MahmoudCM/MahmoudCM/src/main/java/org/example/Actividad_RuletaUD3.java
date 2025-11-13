package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Actividad_RuletaUD3 {

    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        final  String colores[] = {"rojo" , "negro"};

        Integer numeros[] = new Integer[37];


        for (int i = 0; i < numeros.length; i++) {

            numeros[i]=i;
        }

        final String par_impar[] = {"par","impar"};

        System.out.println("introduce tu num de apuesta (0-36)");

        int numero_apuesta = teclado.nextInt();

        if (!Arrays.asList(numeros).contains(numero_apuesta)){
            System.out.println("el numero no es válido");
            return;
        }
        String color_apuesta ="";
        String par_impar_apuesta = " ";
        if (numero_apuesta != 0){

            System.out.println("introduce el color");

             color_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(colores).contains(color_apuesta)){
                System.out.println("el color no es válido");
                return;
            }

            System.out.println("introduce apuesta par y impar");

             par_impar_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(par_impar).contains(par_impar_apuesta)){
                System.out.println("error|| par o impar");
                return;
            }

        }

        String color_sorteo = colores[aleatorio.nextInt(2)];// colores[0] o colores[1]
        int numero_sorteo = numeros[aleatorio.nextInt(37)];

        String par_impar_sorteo = numero_sorteo%2 == 0 ? "par":"impar";// o un if

        System.out.println("ha salido " + numero_sorteo + " " + color_sorteo+ " " + par_impar_sorteo);

        if (numero_sorteo ==numero_apuesta && color_sorteo.equals(color_apuesta) && par_impar_sorteo.equals(par_impar_apuesta) ){

        }





    }
}
