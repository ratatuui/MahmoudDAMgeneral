package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio2Ejemplo_Ud3 {

    static void main() {

        Random aleatorio = new Random();
        int filas = aleatorio.nextInt(6)+2;
        int matriz[][] = new int [filas][filas];
        int matriz2[][] = new  int[filas][filas];
         int matriz3[][]= new int[filas][filas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt(50)+1;

            }

        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {

                matriz2[i][j] = aleatorio.nextInt(50)+1;

            }

        }

        for (int fila[]:matriz){

            System.out.println(Arrays.toString(fila));
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        for (int fila[]:matriz2){

            System.out.println(Arrays.toString(fila));
        }

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3.length; j++) {

                if (matriz[i][j]>matriz2[i][j]){
                    matriz3[i][j] =matriz[i][j];
                }else{
                    matriz3[i][j]=matriz2[i][j];
                }


            }

        }
        System.out.println("++++++++++++++++++++++++++++++++++");
       for (int fila[] :matriz3){
           System.out.println(Arrays.toString(fila));
       }











    }
}
