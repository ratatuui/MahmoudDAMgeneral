package org.example;

import java.util.Random;
import java.util.Scanner;

public class EjerciciosAleatorios {

    static void main() {
        //eje 1

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

//        int dado1 = aleatorio.nextInt(6)+1;
//        int dado2 = aleatorio.nextInt(6)+1;
//
//        System.out.println("El resultado del primer dado es " + dado1);
//        System.out.println("El resultado del segundo dado es " + dado2);
//
//        int resultado = dado2 + dado1;
//
//        System.out.println("El resultado de la suma es " + resultado );
        //eje 2
        //eje3
//        System.out.println("pon el mínimo");
//
//       int  min = teclado.nextInt();
//
//        System.out.println("pon el maximo");
//
//        int max = teclado.nextInt();
//
//        if (min > max){
//            System.out.println("el minimo no puede ser mayor que el maximo");
//        }else {
//            System.out.println("cuantos numeros aleatorios quieres");
//
//            int req = teclado.nextInt();
//
//           for (int i = 0  ;i < req; i++){
//             int resultado =  aleatorio.nextInt(max - min + 1) + min;
//            System.out.println(resultado);
//
//        }}
//
//
//
//
//
      String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String minusculas = "abcdefghijklmnopqrstuvwxyz";
      String numeros = "0123456789";
      String contra1 = "";
        String contra2 = "";

      String contraf = "";
      int rango = aleatorio.nextInt(9)+4;
        contra1  += mayusculas.charAt(aleatorio.nextInt(mayusculas.length() - 1));
        contra2  += contra1 + minusculas.charAt(aleatorio.nextInt(minusculas.length() - 1));
        for (int i =0 ; i < rango ; i++ ){

        contraf  += contra2 + numeros.charAt(aleatorio.nextInt(numeros.length() - 1));

    }
        System.out.println(contraf);

    }
}
