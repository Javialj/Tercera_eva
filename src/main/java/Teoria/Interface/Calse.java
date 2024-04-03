package Teoria.Interface;

public class Calse implements InterfaceConTodo {

    @Override
    public void metodoAbstracto1() {
        System.out.println("Pito");
    }

    @Override
    public int calcularSuma(int numeroUno, int numeroDos) {
        return numeroDos + numeroUno;
    }
}
