package aula01;
/**
 * Calcular a soma dos números pares de 1 a N

Escreva um programa em Java que solicite ao usuário um número inteiro positivo N e 
calcule a soma de todos os números pares de 1 até N.

Requisitos:

O programa deve utilizar um loop for para iterar pelos números de 1 a N.

A soma dos números pares deve ser armazenada em uma variável.

Ao final, o programa deve exibir a soma calculada.
 */
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares de 1 a " + n + " é: " + soma);
    }
}

