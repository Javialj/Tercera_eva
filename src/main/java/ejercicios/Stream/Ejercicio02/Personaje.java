package ejercicios.Stream.Ejercicio02;

public class Personaje {
    String nombre;
    int Edad;
    Arma arma;
    boolean humano;

    public Personaje(String nombre, int edad, Arma arma, boolean humano) {
        this.nombre = nombre;
        Edad = edad;
        this.arma = arma;
        this.humano = humano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public boolean isHumano() {
        return humano;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", Edad=" + Edad +
                ", arma=" + arma +
                ", humano=" + humano +
                '}';
    }
}
