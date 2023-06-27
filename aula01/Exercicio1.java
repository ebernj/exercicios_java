package aula01;
/**
 * Calcular a soma dos n�meros pares de 1 a N

Escreva um programa em Java que solicite ao usu�rio um n�mero inteiro positivo N e 
calcule a soma de todos os n�meros pares de 1 at� N.

Requisitos:

O programa deve utilizar um loop for para iterar pelos n�meros de 1 a N.

A soma dos n�meros pares deve ser armazenada em uma vari�vel.

Ao final, o programa deve exibir a soma calculada.
 */
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um n�mero inteiro positivo: ");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos n�meros pares de 1 a " + n + " �: " + soma);
    }
}

