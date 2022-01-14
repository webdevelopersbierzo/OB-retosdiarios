package com.retodia5;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String texto = "";
        boolean ok;

        do{

            Scanner sc = new Scanner(System.in);
            sc.reset();
            System.out.println("Introduce un texto");
            try{
                texto = sc.nextLine();

            }catch(InputMismatchException e){
                System.out.println("Texto no valido" + e.getMessage());
            }
            ok = true;

        }while(!ok);



        System.out.println(Util.stringToArray(texto));

    }
}
