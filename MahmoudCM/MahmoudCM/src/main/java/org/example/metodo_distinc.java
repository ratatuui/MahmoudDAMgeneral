package org.example;

import java.util.Arrays;

public class metodo_distinc {

    static void main() {

        int numeros[] = {1,2,2,3,4,5,6,6,7};

        int limpio[] = Arrays.stream(numeros).distinct().toArray();

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(limpio));
    }
}
