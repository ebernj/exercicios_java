package aula01;
/**
 * Extração de Domínio de Email

Escreva um programa em Java que solicite ao usuário um endereço de email e extraia o domínio desse email. 
O domínio é a parte do email após o símbolo @.

Requisitos:

O programa deve solicitar ao usuário um endereço de email e ler a entrada do usuário utilizando a classe java.util.Scanner.

O programa deve utilizar o método indexOf para encontrar a posição do símbolo @ no email.

O programa deve utilizar o método substring para extrair a parte do email após o símbolo @.

O programa deve exibir o domínio extraído.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um endereço de email: ");
        String email = scanner.nextLine();

        int posicaoArroba = email.indexOf('@');
        String dominio = email.substring(posicaoArroba + 1);

        System.out.println("O domínio do email é: " + dominio);
    }
}
