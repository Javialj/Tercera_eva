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
        personajes.stream().filter(p -> !p.getArma().equals(Arma.Espada)).forEach(p -> System.out.println(p));
        System.out.println("__________________________-");
        personajes.stream().sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre())).forEach(System.out::println);
        System.out.println("__________________________-");
        personajes.stream().filter(p -> p.isHumano()).forEach(System.out::println);
        System.out.println("__________________________-");
        personajes.stream().sorted((p1, p2) -> p2.getEdad() - p1.getEdad()).limit(1).forEach(System.out::println);
        System.out.println("__________________________-");
        System.out.println("__________________________-");
        Personaje viejo = personajes.stream().max((p1, p2) -> p1.getEdad() - p2.getEdad()).get();
        System.out.println(viejo);
    }
}
