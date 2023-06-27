package aula01;
/**
 * Extra��o de Dom�nio de Email

Escreva um programa em Java que solicite ao usu�rio um endere�o de email e extraia o dom�nio desse email. 
O dom�nio � a parte do email ap�s o s�mbolo @.

Requisitos:

O programa deve solicitar ao usu�rio um endere�o de email e ler a entrada do usu�rio utilizando a classe java.util.Scanner.

O programa deve utilizar o m�todo indexOf para encontrar a posi��o do s�mbolo @ no email.

O programa deve utilizar o m�todo substring para extrair a parte do email ap�s o s�mbolo @.

O programa deve exibir o dom�nio extra�do.
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um endere�o de email: ");
        String email = scanner.nextLine();

        int posicaoArroba = email.indexOf('@');
        String dominio = email.substring(posicaoArroba + 1);

        System.out.println("O dom�nio do email �: " + dominio);
    }
}
