package ejercicios.Ficheros.deTexto.Ejercicio03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        String ruta = "src\\main\\java\\ejercicios\\Ficheros\\deTexto\\Ejercicio03\\nombres.csv";

        File fichero = new File(ruta);
        if (fichero.exists()){
            FileWriter fw = null;
            try {
                fw = new FileWriter(fichero, true);
                String linea = pedirNombre();
                fw.write(linea);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                System.out.println("AAA ;v");
            }
        } else {
            System.out.println("No existe :v");
        }

    }
    private static String pedirNombre() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.println("Apellido1: ");
        String apellido1 = teclado.nextLine();
        System.out.println("Apellido2: ");
        String apellido2 = teclado.nextLine();

        return nombre + "|" + apellido1 + "|" + apellido2;
    }
}
