package ejercicios.person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Mario",22,187);
        Persona p2 = new Persona("Pepe",52,173);
        Persona p3 = new Persona("Manuel",27,158);
        Persona p4 = new Persona("Davis",25,164);
        Persona p5 = new Persona("Arlbeto",80,184);
        ArrayList<Persona> persona = new ArrayList<>();
        persona.add(p1);
        persona.add(p2);
        persona.add(p3);
        persona.add(p4);
        persona.add(p5);
    }
    public static void imprimirPersona(ArrayList<Persona> persona){

    }
}
