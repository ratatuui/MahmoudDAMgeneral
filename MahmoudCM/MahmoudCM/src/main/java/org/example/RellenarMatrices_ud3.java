package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class RellenarMatrices_ud3 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        String nombres[][] = new String[2][3] ;

        //Esto es para introducir filas en todos los casos

        for (int i = 0; i < nombres.length; i++) {

            String fila[] = teclado.next().split(";");

            if (fila.length == nombres[i].length) {
                for (int j = 0; j < nombres[i].length; j++) {

                nombres[i][j] = fila[j];

                }
            }else{
                System.out.println("El tamaño no es correcto");
                i--;
            }
        }

        for (String fila[]: nombres){
            System.out.println(Arrays.toString(fila));
        }



    }
}
