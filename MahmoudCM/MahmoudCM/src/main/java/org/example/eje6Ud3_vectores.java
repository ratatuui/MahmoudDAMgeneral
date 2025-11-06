package org.example;

public class eje6Ud3_vectores {

    static void main() {

        int vector[] = {1,2,3,2,1};
        int ultima_posicon = vector.length-1;
        boolean fallo = true;

        for (int i =0 ; i<vector.length/2;i++){

           if (vector[i] != vector[ultima_posicon-i]){
               System.out.println("no esss");
               fallo=false;
               break;
           }
        }
         if (fallo) System.out.println("es palindromo");
    }
}
