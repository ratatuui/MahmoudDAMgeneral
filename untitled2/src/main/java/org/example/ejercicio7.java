package org.example;

import java.util.Scanner;

public class ejercicio7 {
public  static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Hay tomate? ");
        char tomate = teclado.next().charAt(0);

        System.out.println("¿Hay aceite");
        char aceite = teclado.next().charAt(0);

        System.out.println("¿Hay jamon");
        char jamon = teclado.next().charAt(0);

        if (tomate == 'S' || aceite == 'S' || jamon == 'S') {
            System.out.println("no comprar ");

        }else{
            System.out.println(" a comprar ");

            }


    }
}
