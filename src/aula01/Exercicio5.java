package aula01;
/**
 * Escreva um programa em Java que solicita ao usu�rio uma palavra ou frase e verifica se ela � um pal�ndromo. 
Um pal�ndromo � uma palavra, frase ou sequ�ncia de caracteres que � lida da mesma maneira tanto de tr�s para frente quanto de frente para tr�s, desconsiderando espa�os em branco e diferencia��o entre letras mai�sculas e min�sculas.

Requisitos:

O programa deve solicitar ao usu�rio uma palavra ou frase e ler a entrada do usu�rio utilizando a classe java.util.Scanner.

O programa deve remover os espa�os em branco e converter todos os caracteres para letras min�sculas antes de fazer a verifica��o.

O programa deve comparar a palavra ou frase original com sua vers�o invertida para determinar se � um pal�ndromo.

O programa deve exibir uma mensagem indicando se a palavra ou frase � um pal�ndromo ou n�o.
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
            System.out.println("A palavra ou frase � um pal�ndromo!");
        } else {
            System.out.println("A palavra ou frase n�o � um pal�ndromo.");
        }
    }
}

