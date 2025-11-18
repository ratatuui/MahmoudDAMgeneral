package org.example;

import java.util.Scanner;

public class Ejercicio4_NumerosPrimos {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el valor...");

        int max = teclado.nextInt();

        fuera:
        for (int i = 2; i <=max ; i++) {

            for (int j = 2; j < i ; j++) {

                if (i % j == 0){
                    continue fuera;
                }

            }
            System.out.print(i + " ");
    }



    }
}
