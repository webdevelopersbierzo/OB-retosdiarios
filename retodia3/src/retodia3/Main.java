package retodia3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "";
        boolean ok = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.println("Introduce el nombre completo: ");
                name = sc.nextLine();
                ok = true;

            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        }
        while (!ok);


        System.out.println(separateWord(name));
    }

    /**
     * Function that collects a string and separates the strings
     *
     * @param name Full name
     * @return String the value of the array fullname
     */
    public static String separateWord(String name) {
        String[] fullname = name.split(" ");

        if (fullname.length == 4) {
            System.out.println(nombreComun(fullname[0], fullname[1]));
            return fullname[0] + " " + fullname[1] + " " + fullname[2] + " " + fullname[3];
        } else if (fullname.length == 3) {
            System.out.println(nombreComun(fullname[0], fullname[1]));
            return fullname[0] + " " + fullname[1] + " " + fullname[2];
        } else if (fullname.length == 2) {
            System.out.println(nombreComun(fullname[0], fullname[1]));
            return fullname[0] + " " + fullname[1];
        } else if (fullname.length == 1) {
            if(name==""){
                return "Esta vacio";            }
            System.out.println(nombreComun(fullname[0]));
            return fullname[0];
        } else {
            return "El nombre es muy largo";
        }
    }

    /**
     * Function that determines if a name is common
     *
     * @param nombre1 String name
     * @return String
     */
    public static String nombreComun(String nombre1) {
        String[] commonName = {"Oscar", "Juan", "Antonio", "Jose", "Manuel", "David", "Javier"};
        String resultado;
        boolean ok;
        do {
            for (int i = 0; i < commonName.length; i++) {
                if (nombre1.equals(commonName[i])) {
                    resultado = "Es un nombre comun 1";
                    ok = true;
                }
            }
            ok = true;
        } while (!ok);
        resultado = "No es nombre comun";
        return resultado;

    }

    public static String nombreComun(String nombre1, String nombre2) {
        String[] commonName = {"Oscar", "Juan", "Antonio", "Jose", "Manuel", "David", "Javier"};
        String resultado = " ";
        boolean ok;
        do {
            for (String s : commonName) {
                if (nombre1.equals(s) || nombre2.equals(s)) {
                    resultado = "Es un nombre comun 2";
                    ok = true;
                }
            }
            ok = true;
        } while (!ok);
        resultado = "No es un nombre comun";
        return resultado;

    }

}
