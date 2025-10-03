package org.example;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero para dividir");

     double num1 = teclado.nextDouble();

        System.out.println(" introduce el divisor");

        double num2 = teclado.nextDouble();

        if( num2 == 0){
            System.out.println("ERROR,el divisor no puede ser 0");
            return;
        }

        double resultado = (num1 / num2);

        System.out.println("el resultado es" + resultado);


    }
}