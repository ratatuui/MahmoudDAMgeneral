package org.example;

import java.util.Random;

public class Aleatorios_bis
{
    static void main() {

        Random aleatorio = new Random();

        int num = aleatorio.nextInt(10) + 5;

        System.out.println(num);

       double num3 =  aleatorio.nextDouble();

        System.out.println(num3);

        double num2 =  (int) (Math.random() * 10 + 1);

        System.out.println(num2);
    }
}
