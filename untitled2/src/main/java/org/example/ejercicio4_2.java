package org.example;

import javax.sound.sampled.FloatControl;
import java.util.Scanner;

public class ejercicio4_2 {

    public static void main(String[] args) {

        String texto = "Hola Mundo, bienvenido a Mundo. Mundo es genial.";
        String palabra = "Mundo";

        int texto_tamnyo = texto.length();
        int palabra_tamanyo = palabra.length();

        String frase_sin = texto.replace(palabra,"");
        int conteo = frase_sin.length();
        int resta = texto_tamnyo - conteo;
        int resultado = resta / palabra_tamanyo;
        System.out.println(resultado);

        boolean esta = texto.contains(palabra);
        System.out.println(esta);
    }
}
