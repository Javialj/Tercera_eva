package Excepciones.Videos.V1Excepciones;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Video1 {
    public static void main(String[] args) {

        //Excepciones no verificadas
        try{
            int dividendo = 10;
            int divisor = 0;
            int conciente = dividendo/divisor; //.ArithmeticException: / by zero
        } catch (ArithmeticException exceptionA){
            System.out.println("No se puede papu :v.");
            System.out.println(exceptionA.getMessage());
        }
        System.out.println("____________________");
        try  {
            int[] array = new int[3];
            int numero = array[3]; // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        } catch (ArrayIndexOutOfBoundsException exceptionB) {
            System.out.println("Que no se puede COÑO >:v¡");
            System.out.println(exceptionB.getMessage());
            System.out.println(exceptionB.getStackTrace());
        }

        System.out.println("____________________");

        try {
            String cadena = null;
            System.out.println(cadena.toLowerCase()); //NullPointerException: Cannot invoke "String.toLowerCase()" because "cadena" is null
        } catch (NullPointerException exceptionC) {
            System.out.println("Solo tienes una neurona y se fue de sabatico verdad?");
        }

        System.out.println("____________________");

        try {
            int numero = Integer.parseInt("cochinillo"); //.NumberFormatException: For input string: "cochinillo"
        } catch (NumberFormatException exceptionC) {
            System.out.println("Que numero se llama cochinillo? Reprobaste inicial verda'?");
        }
        //Exepciones verificadas
        //FileReader  fr = new FileReader("archivo.txt");

        System.out.println("____________________");

        try {
            FileReader fr = new FileReader("archivo.txt");
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra....... puto¡");
        }
        System.out.println("Y ya te puso el cuerno weon");
    }
}


