package org.example;

import  java.util.Scanner;

public class Practica3_ISBN {

    static void main() {


        System.out.println("Validador de isbn");
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un modo");
        System.out.println("{1} Validar ISBN");
        System.out.println("{2} Reparar ISBN");

            int modo = sc.nextInt();
            if (modo == 1){

                    System.out.println("Escribe el isbn");
                    int isbn = sc.nextInt();

                   String num = Integer.toString(isbn);
                int tamanyo = num.length();
                if (tamanyo != 10 ) {
                    System.out.println("Pon 10 cifras");

                }else {
                    int i;
                    for (i = 0; i == tamanyo; i = i++ * isbn) ;
                    System.out.println(i);
                }

//                String a = num.substring(0,1);
//                String b = num.substring(1,2);
//                String c = num.substring(2,3);
//                String d = num.substring(3,4);
//                String e = num.substring(4,5);
//                String f = num.substring(5,6);
//                String g = num.substring(6,7);
//                String h = num.substring(7,8);
//                String i = num.substring(8,9);
//                String j = num.substring(9,10);


            }else if (modo == 2){
                System.out.println("escribe el isbn y remplaza una de sus cifras por ?");
                int isbnn = sc.nextInt();
                String num2 = Integer.toString(isbnn);
                int tamanyo = num2.length();
                if (tamanyo != 10 ) {
                    System.out.println("Pon 10 cifras");
            }else {
                    
                }


    }
}}
