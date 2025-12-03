package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entornos_LaFiestaAburrida {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int num = 0;
        System.out.println("**A Saludar**");
        System.out.println("¿Cuantas personas sois?");
            try {
               num = teclado.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Introduce valores numéricos");
                teclado.nextLine();
                return;
            }
            System.out.println("Escribe los nombres");
            teclado.nextLine();
        for (int i = 0; i < num ; i++) {

            String nombres = teclado.nextLine();
            String[] vector = nombres.split(" ");

            if (vector[0].equals("Soy")){

                System.out.println("Hola, " + vector[1]);

            }else {
                System.out.println("Mal,pon (Soy (Nombre))");
                i--;
            }

        }






    }
}
