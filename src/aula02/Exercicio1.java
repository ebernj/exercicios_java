package aula02;

import java.util.Scanner;

/**
 * Exerc�cio 1: Cria��o de uma classe "C�rculo"
Crie uma classe chamada "C�rculo" que represente um c�rculo com raio. A classe
deve ter os seguintes atributos privados: raio (double). Implemente m�todos para
calcular a �rea e o per�metro do c�rculo. Deve herdar da classe
/Curso_java_unb/src/aula3oo/heranca/Forma.java
 */
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do c�rculo: ");
        double raio = scanner.nextDouble();
		
	    Circulo circulo = new Circulo(raio);
	
	    System.out.println("Raio do c�rculo: " + circulo.getRaio());
	    System.out.println("�rea do c�rculo: " + circulo.calcularArea());
	    System.out.println("Per�metro do c�rculo: " + circulo.calcularPerimetro());
	}

}

class Circulo extends aula3oo.heranca.Forma{
	private double raio;
	
	public Circulo(double raio) {
        this.raio = raio;
    }

	public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

