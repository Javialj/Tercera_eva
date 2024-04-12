package ejercicios.Lamda.Ejercicio01;

import ejercicios.Lamda.Ejercicio2.Persona;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de la lista.
        List<String> lista = new ArrayList<>();
        lista.add("Uno");
        lista.add("Dos");
        lista.add("Tres");
        lista.add("Cuatro");
        lista.add("Cinco");
        lista.add("Veinticuatro");


        //Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras tienen más de 5 caracteres.

        Ejercico2 e2 = new Ejercico2() {
            @Override
            public int numeroConMasde5Caracteres(List<String> lista) {
                int contador = 0;
                for (String elemento: lista){
                    if (elemento.length() > 5){
                        contador++;
                    }
                }
                return contador;
            }
        };
        System.out.println(e2.numeroConMasde5Caracteres(lista));
        //Crea una lista de números enteros y utiliza una expresión lambda para encontrar el número mayor.

        List<Integer> numero = new ArrayList<>();
        Random generador = new Random();
        for (int i = 0; i < 20; i++) {
            numero.add(generador.nextInt(0,11));
        }
        Ejercicio3 e3 = new Ejercicio3() {
            @Override
            public int numero(List<Integer> lista) {
                int mayor = lista.get(0);
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i) > mayor){
                        mayor = lista.get(i);
                    }
                }
                return mayor;
            }
        };
        System.out.println(e3.numero(numero));

        //Crea una lista de números enteros y utiliza una expresión lambda para encontrar la suma de los números pares.

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Pepito",91));
        personas.add(new Persona("Jose",19));
        personas.add(new Persona("Luis",41));
        personas.add(new Persona("Sandro",55));
        personas.add(new Persona("Pepe",62));
        personas.add(new Persona("Hachi",195));
        personas.add(new Persona("Lupe",81));


        //Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para encontrar a la persona más joven.
        //Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una expresión lambda para ordenar la lista por edad, de menor a mayor.
        personas.sort((p1, p2 )-> p1.getEdad() - p2.getEdad());
        //Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las personas que tienen una edad mayor a 30.
        personas.stream().filter(persona -> persona.getEdad() > 30).forEach(persona -> System.out.println(persona));
        //Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una expresión lambda para calcular el precio total de la lista.
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pan",0.99));
        productos.add(new Producto("Leche",1.1));
        productos.add(new Producto("Jamon",1));
        productos.add(new Producto("Estropajo",2.15));
        productos.add(new Producto("Donuts",1.5));
        productos.add(new Producto("Doritos",1.25));
        productos.add(new Producto("Coca-cola",1.25));
        productos.add(new Producto("Aceite",10.5));
        Ejercicio8 e8 = lista1 -> {
            double total = 0;
            for (Producto item : lista1) {
                total = total + item.getPrecio();
            }
            return total;
        };
        double resultado = e8.calcularTotal(productos);
        System.out.printf("Total: %.2f", resultado);
        productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
        System.out.printf("Total: %.2f", resultado);
        System.out.println("____________________________");
        //Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar la lista por precio, de mayor a menor.
        productos.sort((p1, p2) -> (int) (p1.getPrecio()  * 100 - p2.getPrecio() * 100));
        productos.forEach(producto -> System.out.println(producto));
        //Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar los productos que tienen un precio menor a 10.
        productos.stream().filter(producto -> producto.getPrecio() < 10).forEach(producto -> System.out.println(producto));
    }
}
