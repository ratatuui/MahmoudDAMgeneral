package org.example;

import java.util.Scanner;

public class stringeje7 {

    public  static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Hay tomate? ");
        String tomate = teclado.next();

        System.out.println("¿Hay aceite");
        String aceite = teclado.next();

        System.out.println("¿Hay jamon");
        String jamon = teclado.next();

        if (tomate.equals("si")  || aceite.equals( "si" ) || jamon.equals("si")) {
            System.out.println("no comprar ");

        }else{
            System.out.println(" a comprar ");

        }


    }
}
