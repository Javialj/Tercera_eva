package ejercicios.Lamda.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class E2Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Felipe R", 54,new String[]{"Nauseas", "Mareos"});
        Paciente paciente2 = new Paciente("Irene M", 32,new String[]{"Tos", "Cansancio", "Mareos"});
        Paciente paciente3 = new Paciente("Carmen C", 15,new String[]{"Ansiedad"});
        Paciente paciente4 = new Paciente("Santiago A", 8,new String[]{"Fractura de cadera"});
        Paciente paciente5 = new Paciente("Isabel A", 60,new String[]{"Tos", "Amnesia", "Fiebre", "Dolor"});

        List<Paciente> pacientes = new ArrayList<>();
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);

        System.out.println(pacientes);
        System.out.println("_______________________________________");
        System.out.println("Ordenamos por nombre:");
        pacientes.sort((p1, p2) ->  p1.getNombre().compareTo(p2.getNombre()));
        System.out.println(pacientes);
        System.out.println("Al reves:");
        pacientes.sort((p1, p2) ->  p2.getNombre().compareTo(p1.getNombre()));
        System.out.println(pacientes);
        System.out.println("_______________________________________");
        System.out.println("Ordenamos por edad:");
        pacientes.sort((p1, p2) -> p1.getEdad() - p2.getEdad());
        System.out.println(pacientes);
        System.out.println("Al reves:");
        pacientes.sort((p1, p2) -> p2.getEdad() - p1.getEdad());
        System.out.println(pacientes);
        System.out.println("_______________________________________");
        System.out.println("Ordenamos por cantidad de sintomas::");
        pacientes.sort((p1, p2) -> p1.getSíntomas().length - p2.getSíntomas().length);
        System.out.println(pacientes);
        System.out.println("Al reves:");
        pacientes.sort((p1, p2) -> p2.getSíntomas().length - p1.getSíntomas().length);
        System.out.println(pacientes);

    }
}
