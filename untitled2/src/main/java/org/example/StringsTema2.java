package org.example;

public class StringsTema2 {

    public static void main(String[] args) {


        String frase = "Al palo JuanFran del atleti palo";

        //Para saber la longitud de la frase

        int tamanyo = frase.length();
        System.out.println(tamanyo);

        //Para seber la posicion de una letra

        System.out.println(frase.charAt(8));

        // Para separar y mostrar un trozo específico de la frase

        String trozo = frase.substring(8,16);
        System.out.println(trozo);

        String trozo_final = frase.substring(17);
        System.out.println(trozo_final);

        //Mostrar la posición de lo que quieras de la frase
        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        // de una palabra a otra

        int posicion2 = frase.indexOf("palo",10);
        System.out.println(posicion2);

        int posicion_ultimo = frase.lastIndexOf("palo");
        System.out.println(posicion_ultimo);

        // Para cambiar la frase (Mayusculas y minusculas
        String frase_mayusculas = frase.toUpperCase();
        System.out.println(frase_mayusculas);


        String frase_minusculas = frase.toLowerCase();
        System.out.println(frase_minusculas);

        //para comparar en una base de datos
        String base_datos = "Raúl       ";
        System.out.println(base_datos.trim() + "-" + base_datos + "#");

        boolean igual = base_datos.trim().equals("Raúl");
        System.out.println(igual);


        boolean igual_sin_mayusculas = "Raúl".equalsIgnoreCase( "raul");

        //Para remplazar las palabras de la frase por otras

        String frase_reemplazos = frase.replace("palo", "florentino");
        System.out.println(frase_reemplazos);
        //Para sumar Strings
        String equipo = "Real Madrid";
            // No es necesaria
        System.out.println( frase.concat(equipo));
        // =
        System.out.println(frase + equipo);




    }


}
