package Teoria.Interface;

public interface InterfaceConTodo {
    int CONSTANTE = 0;
    public void metodoAbstracto1();
    public int calcularSuma(int numeroUno, int numeroDos);
    public default void metodoPorDefecto(){
        System.out.println("Metodo por defecto normal y corriente.");
    };
}
