package aula02;

/**
 * Exercício 2 : Simulação de um banco com as classes "Conta" e
"ContaCorrente"
Crie uma classe "Conta" que represente uma conta bancária com atributos privados
número (int) e saldo (double), além de métodos para depositar e sacar dinheiro. Em
seguida, crie uma classe "ContaCorrente" que herde da classe "Conta" e tenha um
atributo privado limite (double) e um método para realizar um saque considerando o
limite disponível. Utilize o encapsulamento e herança para implementar a
funcionalidade.
 */

public class Exercicio2 {

	public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(123, 1000.0);

        contaCorrente.depositar(500.0);
        contaCorrente.sacar(200.0);
        contaCorrente.sacar(1000.0);
        contaCorrente.sacar(800.0);
    }
	
}

class Conta {
    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado. Novo saldo: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado. Novo saldo: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valor);
        }
    }
}

class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            super.sacar(valor);
        } else {
            System.out.println("Limite insuficiente para realizar o saque de R$" + valor);
        }
    }
}


