package ejercicios.Stream.Ejercicio03;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String animales = "Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao, Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra\n" +
                "Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo, Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo, Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera, Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga, Urraca, Vaca, Yak, Zorro.";

        String[] arrayAnimales = animales.split(", ");

        ArrayList<String> listAnimales = new ArrayList<>();
        //Forma1
        for (String elementos : arrayAnimales) {
            listAnimales.add(elementos);
        }
        //Forma2
        listAnimales.addAll(Arrays.asList(arrayAnimales));

        Scanner teclado = new Scanner(System.in);
        System.out.println("Letra: ");
        String letra = teclado.nextLine().substring(0,1);
        listAnimales.stream().filter(a -> a.toLowerCase().startsWith(letra)).forEach(System.out::println);
        System.out.println("_______________________-");
        listAnimales.stream().sorted((a1, a2)  -> a1.length() - a2.length()).max((a1, a2)  -> a1.length() - a2.length()).get();

    }
}
