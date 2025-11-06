package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class eje5Ud3_vectores {

    static void main() {

        int vector[] = {2,3,4,5,1,6};

        System.out.println(Arrays.toString(vector));
        int aux = 0;

        aux = vector[vector.length-1];

        for (int i = vector.length-1;i>=1;i--){
            if (i == vector.length-1){
                aux = vector[i];
                vector[i] =  vector[i-1];

            }else {
                vector[i]= vector[i-1];
            }
        }

        vector[0]=aux;

        System.out.println(Arrays.toString(vector));
        System.out.println(aux);

    }
}
