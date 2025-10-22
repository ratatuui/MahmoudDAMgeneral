package org.example;

import java.util.Scanner;

public class Practica_6 {

    static void main() {

        System.out.println("BIENBENIDO A LA CALCULADORA RÁPIDA");
        System.out.println("Introduce un operando");

        Scanner teclado = new Scanner(System.in);
        double numero1 = teclado.nextDouble();


        System.out.println("selecciona operación");
        System.out.println("[+].............Suma");
        System.out.println("[-].............Resta");
        System.out.println("[x].............Multiplicar");
        System.out.println("[/].............Dividir");
        System.out.println("[R].............Raiz cuadrada");

        String signo = teclado.nextLine();
        teclado.nextLine();
        System.out.println("introduce el segundo operando");

        double numero2 = teclado.nextDouble();






               switch (signo.toLowerCase()) {


                   case "+":
                       double resultado_s = numero1 + numero2;
                       System.out.println(resultado_s);
                       break;

                   case "-":
                       double resultado_r = numero1 - numero2;
                       System.out.println(resultado_r);
                       break;

                   case "x":
                       double resyltado_m = numero1 * numero2;
                       System.out.println(resyltado_m);
                       break;

                   case "/":
                       double resultado_d = numero1 / numero2;
                       System.out.println(resultado_d);
                       break;

                   case "r":
                       double resultador = Math.sqrt(numero1);
                       System.out.println(resultador);
                       break;

                   default:
               }


    }
}
