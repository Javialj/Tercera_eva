package Teoria.Biblioteca;

import java.time.LocalDate;

public class Socio implements Comparable{
    String nombre;
    String apellido;
    LocalDate fechaNac;

    public Socio(String nombre, String apellido, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "\n" + nombre  + apellido  + fechaNac;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
