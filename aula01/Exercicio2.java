package aula01;
/**
 * Escreva um programa em Java que solicite ao usuário 2 números inteiros positivos M e N e 
calcule a soma de todos os números pares de M até N.

Requisitos:

O programa deve utilizar um loop for para iterar pelos números de M a N.

A soma dos números pares deve ser armazenada em uma variável.

Ao final, o programa deve exibir a soma calculada.
 */
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro positivo (M): ");
        int m = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro positivo (N): ");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares de " + m + " a " + n + " é: " + soma);
    }
}
