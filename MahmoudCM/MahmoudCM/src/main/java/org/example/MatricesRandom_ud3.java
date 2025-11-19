package org.example;

import java.util.Arrays;
import java.util.Random;

public class MatricesRandom_ud3 {

    static void main() {

        Random aleatorio = new Random();
        int filas = aleatorio.nextInt(6)+2;
        int matriz[][] = new int [filas][filas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(50)+1;

            }

        }

        for (int fila[]:matriz){

            System.out.println(Arrays.toString(fila));
        }
            //modo sencillo
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i==j){

                    System.out.print(matriz[i][j] + " ");

                }

            }

        }
        //modo complicado
        for (int i = 0; i < matriz.length; i++) {

            System.out.print (matriz[i][i] + " ");

        }
        //diagonal
        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length-1; j >=0 ; j--) {

                System.out.print(matriz[i][j-i] + " ");
                break;
            }

        }
        //diagonal otro
        for (int i = 0; i < matriz.length; i++) {

            System.out.print(matriz[i][matriz.length-1-i] + " ");

        }
            

    }
}
