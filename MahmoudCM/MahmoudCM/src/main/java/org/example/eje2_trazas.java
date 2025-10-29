package org.example;

import java.util.Scanner;

public class eje2_trazas
{
    static void main() {

        //no funciona
        int a, b, c, d;

         Scanner sc  = new Scanner(System.in);
         a = sc.nextInt();
        b = 0;
        c = 1;

        while (a != 0) {
            b++;
            c = c * a / b;
            a = sc.nextInt();
        }

        d = b + c;


        System.out.println(d);

    }
}

