package aula02;

import java.util.Scanner;

/**
 * Sistema de contas bancárias
Crie um sistema simples para gerenciar contas bancárias. Para isso utilize as
classes do Exercício 2.
1. Classe "CadastroContas":
- Método main(): realiza a interação com o usuário para criar uma conta
e realizar operações nela.
- Crie dois objetos do tipo "Conta" e dois objetos do tipo
"ContaCorrente"
- Defina um número de conta e saldo inicial para cada uma das
contas criadas.
- Realize algumas operações, como depósito e saque, em cada
uma das contas.
- Exiba o saldo atual das contas após as operações
 */
public class Exercicio5 { //Representa a classe CadastroContas
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando objetos de Conta
        Conta conta1 = new Conta(1);
        Conta conta2 = new Conta(2);

        // Criando objetos de ContaCorrente
        ContaCorrente contaCorrente1 = new ContaCorrente(3, 500.0);
        ContaCorrente contaCorrente2 = new ContaCorrente(4, 1000.0);

        // Definindo saldo inicial para cada conta
        //conta1.depositar(1000.0);
        //conta2.depositar(2000.0);
        //contaCorrente1.depositar(3000.0);
        //contaCorrente2.depositar(4000.0);

        // Operações com as contas
        System.out.print("Digite o valor para depósito na conta "+conta1.getNumero()+": ");
        double valorDepositoConta1 = scanner.nextDouble();
        conta1.depositar(valorDepositoConta1);

        System.out.print("Digite o valor para saque na conta "+conta1.getNumero()+": ");
        double valorSaqueConta1 = scanner.nextDouble();
        conta1.sacar(valorSaqueConta1);

        System.out.print("Digite o valor para depósito na conta  "+conta2.getNumero()+": ");
        double valorDepositoConta2 = scanner.nextDouble();
        conta2.depositar(valorDepositoConta2);

        System.out.print("Digite o valor para saque na conta  "+conta2.getNumero()+": ");
        double valorSaqueConta2 = scanner.nextDouble();
        conta2.sacar(valorSaqueConta2);

        System.out.print("Digite o valor para depósito na conta corrente  "+contaCorrente1.getNumero()+": ");
        double valorDepositoContaCorrente1 = scanner.nextDouble();
        contaCorrente1.depositar(valorDepositoContaCorrente1);

        System.out.print("Digite o valor para saque na conta corrente  "+contaCorrente1.getNumero()+": ");
        double valorSaqueContaCorrente1 = scanner.nextDouble();
        contaCorrente1.sacar(valorSaqueContaCorrente1);

        System.out.print("Digite o valor para depósito na conta corrente  "+contaCorrente2.getNumero()+": ");
        double valorDepositoContaCorrente2 = scanner.nextDouble();
        contaCorrente2.depositar(valorDepositoContaCorrente2);

        System.out.print("Digite o valor para saque na conta corrente  "+contaCorrente2.getNumero()+": ");
        double valorSaqueContaCorrente2 = scanner.nextDouble();
        contaCorrente2.sacar(valorSaqueContaCorrente2);

        // Exibindo o saldo atual das contas
        System.out.println("Saldo atual da conta "+conta1.getNumero()+": " + conta1.getSaldo());
        System.out.println("Saldo atual da conta "+conta1.getNumero()+": " + conta2.getSaldo());
        System.out.println("Saldo atual da conta "+conta1.getNumero()+": " + contaCorrente1.getSaldo());
        System.out.println("Saldo atual da conta "+conta1.getNumero()+": " + contaCorrente2.getSaldo());

        scanner.close();
    }

}

