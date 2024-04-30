package ejercicios.Ficheros.deTexto.Ejercicio07;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class E07 {
    public static void main(String[] args) {
        String ruta = "src\\main\\java\\ejercicios\\Ficheros\\deTexto\\Ejercicio07\\datos.txt";

        File fichero = new File(ruta);

        FileWriter fw = null;

        Scanner teclado = null;

        try {
            fw = new FileWriter(fichero, true);
            teclado = new Scanner(System.in);

            String linea = teclado.nextLine();
            while (!linea.equalsIgnoreCase("fin")) {
                fw.write(linea + "\n");
                linea = teclado.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                fw.close();
                teclado.close();
            } catch (IOException e) {
                System.out.println("No se puede cerrar");
            }
        }

    }
}
