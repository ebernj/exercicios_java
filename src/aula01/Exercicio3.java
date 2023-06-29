package aula01;
/**
 * Adivinhe o número

Escreva um programa em Java que gera um número aleatório entre 1 e 100 e 
permite que o usuário adivinhe qual é esse número. O programa deve fornecer dicas para ajudar o 
usuário a chegar à resposta correta. O programa deve continuar executando até que o 
usuário adivinhe corretamente o número.

Requisitos:

 O programa deve gerar um número aleatório entre 1 e 100 utilizando a classe java.util.Random.

 O programa deve solicitar ao usuário que adivinhe o número e ler a entrada do usuário utilizando a classe java.util.Scanner.

 O programa deve fornecer dicas ao usuário após cada tentativa, indicando se o número a ser adivinhado é maior ou menor 
 do que a tentativa atual.

 O programa deve continuar executando até que o usuário adivinhe corretamente o número.

 Ao final, o programa deve exibir o número total de tentativas realizadas pelo usuário para adivinhar o número.
 */

import java.util.Random;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);
        int tentativas = 0;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor do que " + palpite + "!");
            } else if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior do que " + palpite + "!");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);
    }
}
