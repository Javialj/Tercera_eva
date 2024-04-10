package Teoria.Biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio("Ccas","MAmahuevo", LocalDate.of(2000,12,1));
        Socio socio2 = new Socio("Dass","HolaMundo", LocalDate.of(2010,11,2));
        Socio socio3 = new Socio("Bass","Tardo", LocalDate.of(1000,10,3));
        Socio socio4 = new Socio("Fass","Pito", LocalDate.of(1987,9,4));
        ArrayList<Socio> socios = new ArrayList<>();
        socios.add(socio1);
        socios.add(socio2);
        socios.add(socio3);
        socios.add(socio4);

        System.out.println(socios);
        System.out.println("________________________________");
        socios.removeIf(socio->socio.getApellido().startsWith("H"));
        System.out.println(socios);
        socios.add(socio2);
        System.out.println("________________________________");
        socios.removeIf(socio ->  socio.getFechaNac().isBefore(LocalDate.of(2000,1,1)));
        System.out.println(socios);
    }
}
