package aula01;
/**
 * Escreva um programa em Java que solicita ao usuário uma palavra ou frase e verifica se ela é um palíndromo. 
Um palíndromo é uma palavra, frase ou sequência de caracteres que é lida da mesma maneira tanto de trás para frente quanto de frente para trás, desconsiderando espaços em branco e diferenciação entre letras maiúsculas e minúsculas.

Requisitos:

O programa deve solicitar ao usuário uma palavra ou frase e ler a entrada do usuário utilizando a classe java.util.Scanner.

O programa deve remover os espaços em branco e converter todos os caracteres para letras minúsculas antes de fazer a verificação.

O programa deve comparar a palavra ou frase original com sua versão invertida para determinar se é um palíndromo.

O programa deve exibir uma mensagem indicando se a palavra ou frase é um palíndromo ou não.
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String entrada = scanner.nextLine();

        String entradaFormatada = entrada.toLowerCase().replaceAll(" ", "");
        String entradaInvertida = new StringBuilder(entradaFormatada).reverse().toString();

        if (entradaFormatada.equals(entradaInvertida)) {
            System.out.println("A palavra ou frase é um palíndromo!");
        } else {
            System.out.println("A palavra ou frase não é um palíndromo.");
        }
    }
}

