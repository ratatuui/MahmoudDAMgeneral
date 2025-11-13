package org.example;

import java.util.Arrays;
import java.util.Collections;

public class ordenar {

    static void main() {

        int  vector[] = {3,0,2,5,4};

        int vector2[] = vector.clone();

        Arrays.sort(vector2);

        System.out.println(Arrays.toString(vector2));

//        Arrays.sort(vector2, Collections.reverseOrder());
        System.out.println(Arrays.toString(vector2));
        int num = Arrays.binarySearch(vector2,5);

        System.out.println(num);


    }
}
