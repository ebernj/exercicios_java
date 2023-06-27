package aula01;
/**
 * Adivinhe o n�mero

Escreva um programa em Java que gera um n�mero aleat�rio entre 1 e 100 e 
permite que o usu�rio adivinhe qual � esse n�mero. O programa deve fornecer dicas para ajudar o 
usu�rio a chegar � resposta correta. O programa deve continuar executando at� que o 
usu�rio adivinhe corretamente o n�mero.

Requisitos:

 O programa deve gerar um n�mero aleat�rio entre 1 e 100 utilizando a classe java.util.Random.

 O programa deve solicitar ao usu�rio que adivinhe o n�mero e ler a entrada do usu�rio utilizando a classe java.util.Scanner.

 O programa deve fornecer dicas ao usu�rio ap�s cada tentativa, indicando se o n�mero a ser adivinhado � maior ou menor 
 do que a tentativa atual.

 O programa deve continuar executando at� que o usu�rio adivinhe corretamente o n�mero.

 Ao final, o programa deve exibir o n�mero total de tentativas realizadas pelo usu�rio para adivinhar o n�mero.
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

        System.out.println("Adivinhe o n�mero entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite > numeroSecreto) {
                System.out.println("O n�mero secreto � menor do que " + palpite + "!");
            } else if (palpite < numeroSecreto) {
                System.out.println("O n�mero secreto � maior do que " + palpite + "!");
            } else {
                System.out.println("Parab�ns! Voc� acertou o n�mero secreto em " + tentativas + " tentativas.");
            }
        } while (palpite != numeroSecreto);
    }
}
