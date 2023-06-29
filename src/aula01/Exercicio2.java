package aula01;
/**
 * Escreva um programa em Java que solicite ao usu�rio 2 n�meros inteiros positivos M e N e 
calcule a soma de todos os n�meros pares de M at� N.

Requisitos:

O programa deve utilizar um loop for para iterar pelos n�meros de M a N.

A soma dos n�meros pares deve ser armazenada em uma vari�vel.

Ao final, o programa deve exibir a soma calculada.
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero inteiro positivo (M): ");
        int m = scanner.nextInt();

        System.out.print("Digite o segundo n�mero inteiro positivo (N): ");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos n�meros pares de " + m + " a " + n + " �: " + soma);
    }
}
