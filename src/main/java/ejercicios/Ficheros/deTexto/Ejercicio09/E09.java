package ejercicios.Ficheros.deTexto.Ejercicio09;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class E09 {
    public static void main(String[] args) {
        String ruta = "src\\main\\java\\ejercicios\\Ficheros\\deTexto\\Ejercicio09\\E09.java";
        File fichero = new File(ruta);

        Scanner teclado = null;
        Scanner lector = null;
        int contador = 0;
        boolean encontrado = false;

        try {
            lector = new Scanner(fichero);
            teclado = new Scanner(System.in);
            System.out.println("A: ");
            String linea = teclado.nextLine();
            while (lector.hasNextLine()) {
                contador++;
                String lines = lector.nextLine();
                if (lines.contains(linea)) {
                    System.out.println(contador +" " + lines);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No hay");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            lector.close();
            teclado.close();
        }
    }
}
