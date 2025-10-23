package org.example;

import  java.util.Scanner;

public class ejerciciosbateríabucles {

    static void main() {

//
//        Scanner teclado = new Scanner(System.in);
//
//     String buena = "admin1234";
//
//        do {
//            System.out.println("Introduce tu contraseña");
//
//            String contrasenya = teclado.next();
//
//            if (contrasenya.equals(buena)){
//                break;
//            }
//        }while (true);
//
//        System.out.println("Permitido");
// eje1

//   Scanner teclado = new Scanner(System.in);
//
//        System.out.println("Introduce el numero para la cuenta regresiva");
//      int  i =0;
//        int numero = teclado.nextInt();
//
//        for (i = numero; i>0; i-- ){
//
//            System.out.println(i);
//        }
//
        //eje2

//        for (int i=1;i<=50;i++){
//
//
//
//            if ( i % 3 !=0){
//                continue;
//            }
//            System.out.println(i);
//        }
//3

//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Introduce una palabra");
//
//        String palabra = teclado.next();
//        int letras = palabra.length();
//
//       // for (int i=0; i < letras;i++){
//        //4
//        //for (int i=letras-1; i >=0;i--){
//        //5
//
//            System.out.println(palabra.charAt(i));
//
//        }
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la tabla(0-9) que quieras ver");

        int tabla = teclado.nextInt();
        int i = 1;
        
        for (tabla = 0; tabla <= 9; tabla += tabla* i++) {

            System.out.println(tabla);
            break;
        }
    }
}
