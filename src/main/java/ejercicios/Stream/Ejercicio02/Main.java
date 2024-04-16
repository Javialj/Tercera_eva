package ejercicios.Stream.Ejercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personaje> personajes = new ArrayList<>();
        personajes.add(new Personaje("Gandalf",Integer.MAX_VALUE,Arma.Baston,false));
        personajes.add(new Personaje("Aragorn",88,Arma.Espada,true));
        personajes.add(new Personaje("Gimli",140,Arma.Hacha,false));
        personajes.add(new Personaje("Legola",2931,Arma.Arco,false));
        personajes.add(new Personaje("Boroner",41,Arma.Espada,true));
        personajes.add(new Personaje("Frodo",51,Arma.Anillo,false));
        personajes.add(new Personaje("Sam",33,Arma.Espada,false));

        personajes.stream().filter(p -> p.getEdad() < 90 && p.getArma() == Arma.Espada).forEach(p -> System.out.println(p));
        System.out.println("__________________________-");
        personajes.stream().filter(p -> p.getArma() != Arma.Espada).forEach(p -> System.out.println(p));
        System.out.println("__________________________-");

    }
}
