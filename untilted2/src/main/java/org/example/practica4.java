package org.example;

import java.util.Scanner;

public class practica4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int multiplicando = 0;
        int multiplicador = 0;

        do {

            try {
                System.out.println("introduce un multplicando de 3 cifras");
                multiplicando = teclado.nextInt();
                System.out.println("introduce un multplicador de 3 cifras");
                multiplicador = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("No es válido,pon números");
               return;
            }



        } while (multiplicando < 100 || multiplicando > 999 || multiplicador < 100 || multiplicador > 999);



        String numx = Integer.toString(multiplicador);
        String numc = numx.substring(0,1);
        String numc_1 = numx.substring(1,2);
        String numc_2 = numx.substring(2,3);
        int a = Integer.parseInt(numc);
        int b = Integer.parseInt(numc_1);
        int c = Integer.parseInt(numc_2);

        int resutado1 = c * multiplicador;
        int resutado2 = b * multiplicador;
        int resutado3 = a * multiplicador;

        int resultado = multiplicador * multiplicando;
        System.out.println(" el resultado es " + resultado);
        System.out.println("El proceso es ");
        System.out.println("        " + multiplicando);
        System.out.println(" X       "  + multiplicador);
        System.out.println("--------------------------");
        System.out.println("                  "  + resutado1);
        System.out.println("               "   + resutado2);
        System.out.println("  X        " + resutado3);
        System.out.println("____________________________ ");
        System.out.println("            "  + resultado);


    }



}
