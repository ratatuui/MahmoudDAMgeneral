package org.example;

import java.util.Arrays;

public class matrices_Ud3 {

    static void main() {

        int matriz[][] = {{0,1,2},{3,4,5},{6,7,8}};

        int matriz2[][] = new int[3][3];

        System.out.println(matriz[1][0]);    //"matriz"[fila][columna]
        System.out.println(matriz2[2][1]);   // matriz [i][j]

        for (int i = 0; i <matriz.length ; i++) {    //Estos for son clave,los haremos muchas veces
            for (int j = 0; j < matriz[0].length; j++) {

                System.out.print(matriz[i][j]);//queremos imprimir las columnas, quitaremos ln


            }
            System.out.println();
        }

        int vector[] = {1,2,3,4};

        for (int num : vector){//este for trae valores,ni calcula posiciones ni nada

            System.out.println(num);
        }

        for (int fila[] : matriz){
            System.out.println(Arrays.toString(fila));
        }

        for (int fila[] : matriz){
            for (int columna :fila){
                System.out.print(columna);
            }
            System.out.println();
        }

    }
}
