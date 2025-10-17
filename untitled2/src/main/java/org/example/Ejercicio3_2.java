package org.example;

import java.util.Map;
import java.util.Scanner;

public class Ejercicio3_2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta un numero....");
        int numero = teclado.nextInt();
        System.out.println("¿Cuantas cifras quieres eliminar?");
        int quitar = teclado.nextInt();

        String numero_string = Integer.toString(numero);
        int tamanyo = numero_string.length();
        int nuevo_tamanyo = tamanyo - quitar;

        String resultado = numero_string.substring(0,nuevo_tamanyo);
        System.out.println("El resultado es " + resultado);

    }
}
