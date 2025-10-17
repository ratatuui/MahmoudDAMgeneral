package org.example;

import java.util.Scanner;

public class eje1_T2 {

    public static void main(String[] args) {

       Scanner teclado =  new Scanner(System.in);
        System.out.println("Introduce una palabra o frase");

        String frase = teclado.next();

        int tamanyo = frase.length();

        System.out.println(tamanyo);

        String frases = teclado.next();

        boolean sin_espacios = Boolean.parseBoolean(frases.trim());














    }

}
