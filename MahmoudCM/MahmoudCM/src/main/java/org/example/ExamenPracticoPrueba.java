package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExamenPracticoPrueba {

    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
            //declaro donde se guarda los numeros
        int vector[] = new int[25];
            //con un for coloco los numeros de forma aleatoria
        for (int i = 0; i < vector.length; i++) {

            vector[i] = aleatorio.nextInt(90) + 1;

        }
        int vector2[] = Arrays.stream(vector).distinct().toArray();

        System.out.println(Arrays.toString(vector2));

        String matriz[][]= new String[3][3];
        System.out.println("**Introduce los datos de tu carton");
        //Pido al usuario los datos colocandolos posteriormente con un for
        for (int i = 0; i < matriz.length; i++) {

            System.out.print("fila " + (i+1) + ": ");

           String filas[] = teclado.next().split("-");

            if (filas.length == matriz[i].length) {
                for (int j = 0; j < matriz[i].length; j++) {

                    matriz[i][j] = filas[j];

                }
            }else{
                System.out.println("El tamaño no es correcto (N-N-N)");
                i--;
            }

        }
        System.out.println("Datos del carton");
        for (String filas[]:matriz){
            System.out.println(Arrays.toString(filas));

        }
        System.out.println("Premios");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (Arrays.stream(matriz).toList().contains(vector2)){
                    System.out.println("Bingo");
                    
                }else {
                    System.out.println("no bingo");
                    break;
                }

            }

        }

    }
}
