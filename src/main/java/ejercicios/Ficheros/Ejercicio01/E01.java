package ejercicios.Ficheros.Ejercicio01;

import java.io.File;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String ruta = "src\\main\\java\\";

        File fichero = new File(ruta + teclado.nextLine());

        if (fichero.exists()){
            System.out.println("Si existe :v");
            if (fichero.isDirectory()){
                System.out.println("Es un directorio");
            } else {
                System.out.println("Se trata de un fichero pendejo >:v");
                System.out.println("Nombre: " + fichero.getName());
                System.out.println("Tamaño: " + fichero.length());
                System.out.println("Nombre: " + fichero.getName());
                //RVX
            }
        } else {
            System.out.println("No existe :'v");
        }


    }
}
