package Teoria.ClaseObject.ejemploEquals;

public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pepe","1234");
        Usuario usuario2 = new Usuario("Pepe","6543");

        System.out.println(usuario1.equals(usuario2));

        int hascode1 = usuario1.hashCode();
        int hascode2 = usuario2.hashCode();

        System.out.println(hascode1 == hascode2);
    }
}
