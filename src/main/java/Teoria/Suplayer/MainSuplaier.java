package Teoria.Suplayer;

import java.util.Random;
import java.util.function.Supplier;

public class MainSuplaier {

    public static void main(String[] args) {
        Random generador = new Random();
        Supplier<Integer> numeroRandom = () -> generador.nextInt(1,1001);
        int numero = numeroRandom.get();
        System.out.println(numero);
    }
}
