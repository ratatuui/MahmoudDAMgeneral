package org.example;

import java.util.Scanner;

public class Practica2_Ud2
{
    static void main() {

        //Primero pongo las variables necesarias y las igualo a 0

        double num1 = 0;
        double num2 = 0;
        String raiz = "r";

        Scanner user = new Scanner(System.in);

        // Luego con la estructura do-while y try-cath controlo que el numero sea numero
            do {


            try {


                System.out.println("introduce el primer numero");
                num1 = user.nextDouble();


            }catch (Exception e) {
                System.out.println("Pon numeros");
                return;

        }}while (num1 >=0 && num1 <=0);

            // aquí creo el menú y recopilo el signo/operación deseada

            System.out.println("selecciona operación");
            System.out.println("[+].............Suma");
            System.out.println("[-].............Resta");
            System.out.println("[x].............Multiplicar");
            System.out.println("[/].............Dividir");
            System.out.println("[r].............Raiz cuadrada");

            String signo = user.next();

            // En este punto creo una condicción de que si la operación es una raíz (r) termina mostrando el resultado o si no sigue el programa

            if (signo.equals(raiz) || num1 > 0){

              double  resultado = Math.sqrt(num1);
                System.out.println(resultado);
              return;


            }else { System.out.println("introduce el segundo numero");
            // Aqui repito la estructura inicial de permitir exclusivamente numeros
        do {
            try {

                num2 = user.nextDouble();


            }catch (Exception e) {
                System.out.println("Pon numeros");
                return;

            }}while (num2 > 0 && num2 < 0);

            //Para finalizar la estructura Switch-case-default, divide los resultados, los resuelve y los muestra por separado
        switch (signo.toLowerCase()) {

            case "+":
                double resultado_s = num1 + num2;
                System.out.println(resultado_s);
                break;

            case "-":
                double resultado_r = num1 - num2;
                System.out.println(resultado_r);
                break;

            case "x":
                double resultado_m = num1 * num2;
                System.out.println(resultado_m);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("el denominador no puede ser cero");
                } else {
                    double resultado_d = num1 / num2;
                    System.out.println(resultado_d);
                }
            default:
                System.out.println("pon signo, en el momento de eligir ");

                //**FIN DEL PROGRAMA**

        }}
    }
}
