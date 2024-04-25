package Teoria.Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploScannerNextLine {
    public static void main(String[] args) {
        String ruta = "src\\main\\java\\Teoria\\Ficheros\\";
        File fichero = new File(ruta + "F.txt");
        Scanner lector = null;
        try {
            lector = new Scanner(fichero);
            while (lector.hasNext()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido una excepción: "+e.getMessage());
        } catch (Exception e) {
            System.out.println("Ha ocurrido una excepción: "+e.getMessage());
            e.printStackTrace();
        } finally {
            lector.close();
            System.out.println("Fin");
        }
    }
}
