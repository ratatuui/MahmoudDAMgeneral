package org.example;

import java.io.OutputStream;
import java.util.Scanner;

public class BateríaEje3_ud3 {

    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuántos alumnos tienes? ");
        int alumnos = teclado.nextInt();

        System.out.println("Cuántas asignaturas tienen? ");
        int asignaturas = teclado.nextInt();//RECORDEMOS QUE SON NUMEROS

        teclado.nextLine();//Cambiamos a letras

        String notas[][] =new String[alumnos+1][asignaturas];

        notas[0][0] = "Estudiantes";

        for (int i = 1; i < notas.length; i++) {
            System.out.println("Introduce el nombre de alumno " + i + ":");
            notas[i][0] = teclado.next();

        }
        for (int i = 0; i < notas[0].length; i++) {
            System.out.println("Introduce asignatura " + i);
            notas[0][i]= teclado.next();

        }
        for (int i = 1; i <notas.length ; i++) {
            for (int j = 1; j < notas[i].length ; j++) {

                System.out.println("Introduce la nota de " + notas[i][0] + " para la asignatura de " + notas[0][j]);
                notas[i][j] = teclado.next();

            }

        }
                   //no me funciona lo de estidiantes cuidado
        for (String fila[] : notas){
            for (String valor : fila){
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
