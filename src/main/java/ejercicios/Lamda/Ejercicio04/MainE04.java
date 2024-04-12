package ejercicios.Lamda.Ejercicio04;

import java.util.function.Function;

public class MainE04 {
    Function<String,  Integer> funcion1 = s -> s.length();

    Function<Integer, Integer>  funcion2 = integer -> (int) Math.pow(integer,2);

    Function<Double, Double> funcion3 = aDouble -> aDouble / 10;
}
