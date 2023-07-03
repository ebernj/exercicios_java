package aula03;
/**
 * Exerc�cio 4
 * Qual o resultado do programa
 */
public class ExercicioPassagemParametros {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Antes da chamada do m�todo: a = " + a + ", b = " + b);
        alterarValores(a, b);
        System.out.println("Ap�s a chamada do m�todo: a = " + a + ", b = " + b);
    }

    public static void alterarValores(int x, int y) {
        x += 5;
        y *= 2;
        System.out.println("Dentro do m�todo: x = " + x + ", y = " + y);
    }
}