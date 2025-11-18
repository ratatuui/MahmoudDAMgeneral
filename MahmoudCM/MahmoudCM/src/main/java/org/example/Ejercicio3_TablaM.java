package org.example;

import java.util.Scanner;

public class Ejercicio3_TablaM {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce numero maximo...");
        int max = teclado.nextInt();

        tabla:
        for (int i = 1; i <= 9 ; i++) {//esto son las tablas

            System.out.println("Tabla del " + i);

            for (int j = 1 ; j <=10 ; j++) {//esto son las multiplicaciones

                System.out.println(i + " x " + j + " = " + (i*j));

                if (max < (i*j)){
                    break tabla;
                }
            }

        }
    }
}
