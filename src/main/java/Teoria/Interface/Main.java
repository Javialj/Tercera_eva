package Teoria.Interface;

import Teoria.Interface.Calse;

public class Main {
    public static void main(String[] args) {
        Calse c = new Calse();
        c.metodoAbstracto1();
        System.out.println(c.calcularSuma(5,6));
        c.metodoPorDefecto();
    }
}
