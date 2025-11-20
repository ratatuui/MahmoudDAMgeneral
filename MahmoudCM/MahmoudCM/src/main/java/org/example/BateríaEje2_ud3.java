package org.example;

import java.util.Random;

public class BateríaEje2_ud3 {

    static void main() {

        Random aleatorio = new Random();

        int matriz[][] = new int[aleatorio.nextInt(5)+1][aleatorio.nextInt(5)+1];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(25)+10;

            }

        }

        for ( int fila[]:matriz ){
            for (int num : fila ){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        System.out.println("Suma de filas : ");

        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma=0;
            for (int j = 0; j < matriz[i].length; j++) {

                suma += matriz[i][j];

            }
            System.out.println("Fila " + (i + 1) + " : " + suma);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Suma de columnas : ");

        for (int i = 0; i < matriz[0].length; i++) {
            suma=0;
            for (int j = 0; j < matriz.length; j++) {

                suma += matriz[j][i];

            }
            System.out.println("Columna " + (i+1) + ": " + suma);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Suma de una fila");
        //si solo se necesita una fila (En este caso) o columna
        suma =0;
        int fila = aleatorio.nextInt(matriz.length-1);
        for (int i = 0; i < matriz[0].length; i++) {
            //Recordemos que en este caso "(Es aleatorio)" la primera casilla es la fila y la segunda es la columna (falta confirmación)
            suma += matriz[fila][i];

        }

        System.out.println(suma);
    }
}
