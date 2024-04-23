package Teoria.Ficheros;

import java.io.File;
import java.io.IOException;

public class Ejemplo_File {
    public static void main(String[] args) {
        System.out.println(File.separator);
        String ruta = "src\\main\\java\\Teoria\\Ficheros\\";

        File fichero = new File(ruta+"fichero.txt");

        System.out.println("El fichero existe? "  + fichero.exists());

        File otroFIche = new File(ruta+"Ejemplo_File.java");

        System.out.println("Existe? "+ otroFIche.exists());

        System.out.println("Ruta absoluta: "+fichero.getAbsolutePath());
        System.out.println("Se puede leer: "+fichero.canRead());
        System.out.println("Se puede escribir: "+fichero.canWrite());
        System.out.println("Se puede ejecutar: "+fichero.canExecute());

        System.out.println("Fecha ulti actualizacion: "+ fichero.lastModified());

        File Ficheronuevo = new File(ruta+"FicheroNuevo.txt");
        try {
            boolean creado = Ficheronuevo.createNewFile();
            if (creado) {
                System.out.println("El fichero se creo papu :v");
            } else {
                if (Ficheronuevo.exists()) {
                    System.out.println("Ya existe papu :v");
                }
            }
        } catch (IOException e) {
            System.out.println("No se pudo crear pipipi :'v");
        }

        System.out.println("\n Eliminar fichero: ");

        boolean borrado = Ficheronuevo.delete();
        if (borrado) {
            System.out.println("Y se marcho...");
        } else {
            System.out.println("Ni idea papu :v");
        }
    }
}
