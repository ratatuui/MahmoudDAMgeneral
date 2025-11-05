package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejenumeropensado_prac {

    static void main() {


        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);
        int i = 1;
        int contador = 0;
        int num = aleatorio.nextInt(101);
        System.out.println("Acabo de pensar un munero (0-100) Adivinalo");


        do {
            contador = i++;
            try {
                int user = teclado.nextInt();
                if (user < num) {
                    System.out.println("tu numero es menor " + contador +" intento");
                } else if (user > num) {
                    System.out.println("tu numero es mayor " + contador +" intento");
                } else if (user == num) {
                    System.out.println("ese es el numero " + contador +" intento");

                }
            } catch (Exception e) {
                System.out.println("pon numeros");
            }
        } while ( contador== 10);






    }

}
