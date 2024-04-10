package ejercicios.Lamda.Ejercico03;

import java.util.function.Predicate;

public class MainEjercicio03 {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = entero -> entero % 5==0;
        System.out.println("25 es multiplo de 5: " + predicate1.test(25));
        Predicate<String> predicate2 = palabra -> !palabra.endsWith("s");
        System.out.println("Pasos termina con s: " + predicate2.test("Pasos"));
        Predicate<Integer> predicate3 = entero -> entero % 3==0 && entero % 2 == 0;
        System.out.println("13 es par y multiplo de 3: " + predicate3.test(13));
        System.out.println("12 es par y multiplo de 3: " + predicate3.test(12));
        System.out.println("22 es par y multiplo de 3: " + predicate3.test(22));
        Predicate<Character> predicate4 = caracter -> Character.isLetter(caracter) && Character.isUpperCase(caracter);
        System.out.println("5: " + predicate4.test('5'));
        System.out.println("S: " + predicate4.test('S'));
        System.out.println("s: " + predicate4.test('s'));
        Predicate<Integer> predicate5 = entero -> entero % 7==0 && entero % 2 != 0;
        System.out.println("21 es multiplo de 7 y es impar: " + predicate5.test(21));
        System.out.println("28 es multiplo de 7 y es impar: " + predicate5.test(28));
        Predicate<Integer> predicate6 = entero -> entero % 7==0 || entero % 2 != 0;
        System.out.println("21 es multiplo de 7 o es impar: " + predicate6.test(21));
        System.out.println("13 es multiplo de 7 o es impar: " + predicate6.test(13));



    }
}
