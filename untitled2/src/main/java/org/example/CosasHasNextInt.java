package org.example;

import  java.util.Scanner;

public class CosasHasNextInt {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        if (teclado.hasNextInt()){
            int numero = teclado.nextInt();
            System.out.println(numero);
        }else {
            System.out.println("Formato incorrecto");
        }

       // try {
         //   int resultado = 10// parseInt();
       // } catch (Exception e) {
            System.out.println();
       // }catch (Exception e1){
            System.out.println();
      // }





    }

}
