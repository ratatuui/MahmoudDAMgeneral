package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Olivas_ExamenUd3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int ancho = 0;
        int largo = 0;


        System.out.println("******Bienvenido al olivómetro");
        System.out.println("Introduce el tamaño de tu bancal");

        System.out.print("ancho: ");
         ancho = teclado.nextInt();
        System.out.print("largo: ");
        largo = teclado.nextInt();

        String matriz[][]=new String[ancho][largo];

        System.out.println("Introduce por hileras los kg por árbol de tu bancal:");
            //pido al usuario los datos necesarios y compruebo su long.
        for (int i = 0; i < matriz.length; i++) {

                String filas[] = teclado.nextLine().split(" ");
                matriz[i] = filas;



        }


        for (String[] fila :matriz){
            System.out.println(Arrays.toString(fila));
        }

    }
}
