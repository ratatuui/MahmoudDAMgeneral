package org.example;

import javax.sound.midi.Soundbank;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActividadGeneraciones {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();
        int anyo_nacimiento_int = 0;
        boolean seguir = true;
        final int ANYO_NACIMIENTO = 0;
        final int ANYO_Minimo = 1900;
        int modo = 0;
        int edad = 0;

        System.out.println("elige modo");
        System.out.println("1");
        System.out.println("2");



        if (teclado.hasNextInt()){

            modo = teclado.nextInt();

        }else {
            System.out.println();

            seguir = false;
        }

        if (seguir){
            if (modo==1);

            System.out.println("introduce tu año de nacimiento");

            String anyo_nacimiento = teclado.next();


            try {

                anyo_nacimiento_int = Integer.parseInt(anyo_nacimiento);

            }catch (InputMismatchException e){
                System.out.println("El formato no es correcto");
                return;
            }


        } else if (modo == 2) {

            System.out.println("introduce la edad");
            if (teclado.hasNextInt()){
                edad = teclado.nextInt();
            }else{
                System.out.println("la edad no tiene formato correcto");
                return;
            }

           if (edad >= 0 ){
              anyo_nacimiento_int = anyo_actual - edad ;


           }else {
               System.out.println("la edad es incorrecta");
               return;
           }

            if (anyo_nacimiento_int >= ANYO_Minimo && anyo_nacimiento_int <= anyo_actual){

                if (anyo_nacimiento_int<=1927){
                    System.out.println("s_bautizar");
                }else if (anyo_nacimiento_int>=1928 && anyo_nacimiento_int<=1944){
                    System.out.println("g silent");
                }else if (anyo_nacimiento_int>=1945 && anyo_nacimiento_int<=1964){
                    System.out.println();
                } else if (anyo_nacimiento_int>=1965 && anyo_nacimiento_int<=1981 ) {
                    System.out.println("b");

                } else if (anyo_nacimiento_int>=1982 && anyo_nacimiento_int<= 1994) {
                    System.out.println("m");

                } else if (anyo_nacimiento_int>=1995 && anyo_nacimiento_int<=2009) {
                    System.out.println("z");
                }

            }
        }




    }


}
