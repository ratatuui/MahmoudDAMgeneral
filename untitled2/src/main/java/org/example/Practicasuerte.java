 package org.example;

import java.util.Scanner;

public class Practicasuerte {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu fecha de nacimiento en formato (dd mm aaaa) ");
        int resultado = 0;

        String fechan = teclado.nextLine();

        if (fechan.length() == 10) {

            fechan.replace("   ", "" );
            fechan.replace("/","");

            String dd = fechan.substring(0, 2);
            String mm = fechan.substring(3, 5);
            String aaaa = fechan.substring(6, 10);

            String trozo =dd.substring(1,2);
            String trozo1 = mm.substring(4,5);


               int q = Integer.parseInt(trozo);

               int f = Integer.parseInt(trozo1);

            if (q == 0 || f == 0) {
                return;}
                int dia = Integer.parseInt(dd);
                int mes = Integer.parseInt(mm);
                int anyo = Integer.parseInt(aaaa);

                resultado = dia + mes + anyo;
                System.out.println("el resultado es " + resultado);



        }

        String resultado1 = Integer.toString(resultado);


        String a = resultado1.substring(0,1);
        String b = resultado1.substring(1,2);
        String c = resultado1.substring(2,3);
        String d = resultado1.substring(3,4);

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);
        int w = Integer.parseInt(c);
        int z = Integer.parseInt(d);

        int resultadof = x + y + w + z;

        System.out.println(" Tu numero de la suerte es " + resultadof);







    }
}
