package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Olivos_class {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int ancho=0;
        int largo=0;

        // Siempre cuando tenemos una entrada
        do {


            try {
            System.out.println("Introduce ancho");
             ancho = teclado.nextInt();

            System.out.println("Introduce largo");
             largo = teclado.nextInt();

            break;
            }catch (InputMismatchException e){
            System.out.println("Formato incorrecto");
             }
        }while (true);

        int bancal[][] = new int[largo][ancho];
        bancal:
        for (int i = 0; i < bancal.length; i++) {

            String fila[] = teclado.nextLine().split(" ");

            if (fila.length == bancal[i].length){

                for (int j = 0; j < bancal[i].length; j++) {

                    //LA DIFERENCIA CON LA SOLUCIÓN ES EL .MATCHES (FORMA DIFICIL)

                    if (fila[j].matches("[\\d ]{1,2}")){

                        if (Integer.parseInt(fila[j]) <1 || Integer.parseInt(fila[j]) > 50){
                            System.out.println("introduce valores correctos(1-50)");
                            continue bancal;
                        }else {

                            bancal[i][j] = Integer.parseInt(fila[j]);
                        }
                    }else {
                        System.out.println("Introduce numeros");
                        i--;
                        continue bancal;
                    }

                }

            }else {
                System.out.println("formato incorrecto");
            }

        }

        for (int fila[] : bancal){
            System.out.println(Arrays.toString(fila));
        }








    }
}
