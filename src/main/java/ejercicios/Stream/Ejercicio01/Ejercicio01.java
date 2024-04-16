package ejercicios.Stream.Ejercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Ejercicio01 {
    public static void main(String[] args) {
        //Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15. Utilizando streams, haz lo siguiente:
        //Imprime todos los elementos de la lista, sin ordenar.
        //Imprime todos los elementos de la lista, ordenados.
        //Imprime todos los elementos de la lista, sin repetir, ordenados.
        //Imprime sólo los mayores o iguales a 5.
        //Imprime sólo los mayores o iguales a 5, ordenados.
        //Imprime sólo los mayuores o iguales a 5, ordenados inversamente.
        //Suma todos los elementos de la lista.
        //Suma todos los elementos mayores o iguales a 5.
        //Calcula el promedio de todos los elementos de la lista.
        List<Integer> numeros = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 20; i++) {
            numeros.add(generador.nextInt(1,16));
        }

        System.out.println("a.Imprime todos los elementos de la lista, sin ordenar.");
        numeros.forEach(n -> System.out.print(n + " "));
        System.out.println("\n______________________________");

        System.out.println("\nb.Imprime todos los elementos de la lista, ordenar.");
        numeros.stream().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println("\n______________________________");

        System.out.println("\nc.Imprime todos los elementos de la lista, sin repetir, ordenados.");
        numeros.stream().distinct().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println("\n______________________________");

        System.out.println("\nd.Imprime sólo los mayores o iguales a 5..");
        numeros.stream().filter(n -> n >= 5).distinct().forEach(n -> System.out.print(n + " "));
        System.out.println("\n______________________________");

        System.out.println("\ne.Imprime sólo los mayores o iguales a 5, ordenados.");
        numeros.stream().filter(n -> n >= 5).distinct().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println("\n______________________________");

        System.out.println("\nf.Imprime sólo los mayuores o iguales a 5, ordenados inversamente.");
        numeros.stream().filter(n -> n >= 5).distinct().sorted((p1, p2) -> p2 - p1).forEach(n -> System.out.print(n + " "));
        System.out.println("\n2º FOrma:");
        numeros.stream().filter(n -> n >= 5).distinct().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
        System.out.println("\n______________________________");

        System.out.println("\ng.Suma todos los elementos de la lista.");
        int suma = numeros.stream().reduce(0,(n1,n2) -> n1+n2);
        System.out.println(suma);
        System.out.println("2ª Forma:");
        suma = numeros.stream().mapToInt(n -> n).sum();
        System.out.println(suma);
        System.out.println("\n______________________________");

        System.out.println("\nh.Suma todos los elementos mayores o iguales a 5.");
        suma = numeros.stream().filter(n -> n >= 5).reduce(0,(n1,n2) -> n1 + n2);
        System.out.println(suma);
        System.out.println("\n______________________________");

        System.out.println("\ni.Calcula el promedio de todos los elementos de la lista.");
        double promedio = (double) (numeros.stream().reduce(0, (n1, n2) -> n1 + n2)) / (numeros.stream().count());
        System.out.println(promedio);
        System.out.println("2º Forma con Optional: ");
        promedio = numeros.stream().mapToDouble(n -> n).average().getAsDouble();
        System.out.println(promedio);
        System.out.println("\n______________________________");

    }
}
