package Teoria.Predicate;

import java.util.function.Predicate;

public class MainPredicate {
    public static void main(String[] args) {
        Predicate<Integer> predicate1 = año -> {return año >= 1981 && año <= 1996;};
        System.out.println(predicate1.test(1993));
    }
    public static boolean esMilenial(int año) {
        boolean esMillenial  = false;
        return año >= 1981 && año <= 1996;
    }
}
