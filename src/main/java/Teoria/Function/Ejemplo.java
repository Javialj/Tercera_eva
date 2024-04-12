package Teoria.Function;

import ejercicios.person.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Ejemplo {
    public static void main(String[] args) {
        Function<Double, Double> cuadrado = x -> Math.pow(x, 2);
        Double resultado = cuadrado.apply(1.25);
        List<Persona> personas = new ArrayList<>();
        ejercicios.person.Persona p1 = new ejercicios.person.Persona("Mario",22,187);
        ejercicios.person.Persona p2 = new ejercicios.person.Persona("Pepe",52,173);
        ejercicios.person.Persona p3 = new ejercicios.person.Persona("Manuel",27,158);
        ejercicios.person.Persona p4 = new ejercicios.person.Persona("Davis",25,164);
        ejercicios.person.Persona p5 = new ejercicios.person.Persona("Arlbeto",80,184);
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);

        Map<String, Integer> mapaEdades = new HashMap<>();
        mapaEdades.put("Mario",22);
        mapaEdades.put("Pepe",52);
        mapaEdades.put("Manuel",27);
        mapaEdades.put("Davis",25);
        mapaEdades.put("Arlbeto",80);

        Function<String, Integer> aumentarEdad  = edad -> Integer.valueOf(edad + 1);
        //mapaEdades.replaceAll((nombre, edad) ->  aumentarEdad.apply(edad));
        mapaEdades.forEach((nombre, edad) -> System.out.println(nombre+" "+edad));
    }
}
