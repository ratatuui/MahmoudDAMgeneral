package org.example;

import java.util.Arrays;

public class vectores {

    static void main() {

        //estructura que se puede guardar numeros,nombres,char etc

        int vector [] = {1,6,9,3,5};


        //cambiar numeros por sus posiciones


//        vector = v2.clone();// igualas los vectores
        System.out.println(Arrays.toString(vector));

        System.out.println(vector.length);

        int v2[ ]= new int [8];
        vector [2] = 8;
        vector[0] = 7;
        System.out.println(Arrays.toString(v2));


        for (int i = 0 ;i < v2.length; i ++){

            System.out.println( i + v2[i]);
        }





    }
}
