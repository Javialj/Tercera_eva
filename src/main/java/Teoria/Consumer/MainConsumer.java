package Teoria.Consumer;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;


public class MainConsumer {
    public static void main(String[] args) {
        Consumer<String> consumer1 = nombre -> System.out.println("HOLA " + nombre + "Pinche puto¡");

        consumer1.accept("Ivan");

        ArrayList<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 25; i++) {
            numeros.add(generador.nextInt(1,1001));
        }
        numeros.forEach(Integer -> System.out.print(Integer + " "));

        System.out.println("_________________________");
        numeros.sort((p1, p2) -> p1 - p2);
        numeros.forEach(Integer -> System.out.print(Integer + " "));
        System.out.println("_________________________");
        numeros.stream().filter(numero  -> numero % 2 == 0).sorted((n1, n2) -> n2 - n1).forEach(numero -> System.out.println(numero + " "));
    }
}
