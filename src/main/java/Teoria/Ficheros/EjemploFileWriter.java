package Teoria.Ficheros;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFileWriter {
    public static void main(String[] args) {
        String ruta = "src\\main\\java\\Teoria\\Ficheros\\";

        File fichero = new File(ruta+"escribir.txt");
        FileWriter fw = null;
        try {
            fw = new FileWriter(fichero);
            fw.write("Hola :D");
            fw.write("\nPuto >:v");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println("No se pudo cerrar. "+ e.getMessage());
            }
        }

    }
}
