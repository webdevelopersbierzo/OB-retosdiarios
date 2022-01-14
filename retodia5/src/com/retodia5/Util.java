package com.retodia5;


import java.util.ArrayList;
import java.util.Arrays;


public class Util {
    // Atributos

    // constructores


    // metodos
    public static ArrayList stringToArray(String cadena) {
        ArrayList<Integer> resultado;
        resultado = (ArrayList<Integer>) Arrays.asList(convertToArray(cadena));
        System.out.println("desde el metoddo stringToArray");
        return resultado;
    }

    public static Integer[] convertToArray(String cadena) {
        String cleanString = clearSTring(cadena); // Limpiamos cadena
        Integer[] numeros = new Integer[cleanString.length()-1]; // creamos un array objetos

        String[] arrayclean = cleanString.split(",");// convertimos la cadena en un array String

        for (int i = 0; i < arrayclean.length; i++) {
            try {
                numeros[i] = Integer.parseInt(arrayclean[i]);
            } catch (Exception ex) {
                System.out.println("Error al parsear el numero" + ex.getMessage());
            }
        }
        return numeros;

    }

    public static String clearSTring(String cadena) {
   
        if ((cadena.startsWith("[")) || (cadena.endsWith("]"))) {
            String clearOk = "";
            // quitamos [ ]
            clearOk = cadena.replace("[", "");
            clearOk = clearOk.replace("]", "");


            return clearOk;
        }



        return "Error  tu entrada debera empezar por [";

    }


}
