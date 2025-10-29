package org.example;

import java.util.Random;

public class RamdomClass {

    static void main() {

        Random aleatorio = new Random();

       int numero = aleatorio.nextInt(5) + 5;
        int numero2 = aleatorio.nextInt(5,10) ;// = [n,i)

        System.out.println(numero);
        System.out.println(numero2);

        int numero3 = ( int) (aleatorio.nextDouble()*100+ 1);

        System.out.println(numero3);

       double numero4 = Math.random() * 10 +1;

        System.out.println(numero4);
        //eje 2 de ejercicios aleatorios

//        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//
//        String contrasenya = "";
//
//        for (int i = 0 ; i <12;i++) {
//
//             contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length() - 1));
//
//        }
//        System.out.println(contrasenya);
    }
}
