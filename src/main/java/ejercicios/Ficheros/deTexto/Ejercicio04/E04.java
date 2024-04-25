package ejercicios.Ficheros.deTexto.Ejercicio04;

import java.io.File;
import java.util.Scanner;

public class E04 {
    public static void main(String[] args) {
        //src\main\java\ejercicios\Ficheros\deTexto\Ejercicio04\FicheroAEliminar.txt
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ruta: ");
        String ruta = teclado.nextLine();

        File fichero = new File(ruta);
        if (fichero.exists()) {
            boolean borrado = fichero.delete();
        } else {
            System.out.println("No se pudo elminar al objetivo, capitan");
        }
    }
}
