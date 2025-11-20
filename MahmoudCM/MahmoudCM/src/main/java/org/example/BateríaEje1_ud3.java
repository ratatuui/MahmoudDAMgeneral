package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class BateríaEje1_ud3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Introduce la matriz");
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                int numeros = teclado.nextInt();

                matriz[i][j] = numeros;

            }

        }

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();

        }
        //Para imprimir una matriz se puede como el ejemplo de arriba o con el for ich

        System.out.println("Introduce un numero al que buscar");

        int buscar = teclado.nextInt();
        externo:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == buscar ){
                    //Para imprimir la posicion hay que poner ("")
                    System.out.println("El numero " + buscar + " esta en la posicion (" + i + "," + j + " ");
                    break externo;
                }
                //me imprimira todos los numeros que hay pero si solo quiero el primero^^;
            }

        }




    }
}
