package org.example;

import javax.swing.*;
import java.util.Scanner;

public class rata {

    public static void main(String[] args) {
        final int ALTURAMIN = 140;
        final int ALTURAMAX = 230;
        int altura = 0;
        int peso = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido al raton jugueton");

        System.out.println("introduce tu altura");
        altura = teclado.nextInt();
        if (altura < ALTURAMIN) {
            double resultado = ALTURAMIN - altura;
            System.out.println("no puedes subir,te faltan " + resultado + "cm");

        } else if (altura > ALTURAMAX || altura <= 0) {
            System.out.println("ERROR,vueve a introducirlo");

        } else if (altura > ALTURAMIN) {

            System.out.println("introduce tu peso");

            peso = teclado.nextInt();
            double pesomin = altura * 2 / 8;
            double pesomax = 120;

            if (peso >= pesomax) {

                double resultadop = 120 - peso;

                System.out.println("no puedes subir,te sobran " + resultadop + "kg");

            }else if (peso >= pesomin){

            System.out.println("sube a la atracción");
            }
        }
    }
}
