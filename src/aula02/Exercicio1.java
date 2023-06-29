package aula02;

import java.util.Scanner;

/**
 * Exercício 1: Criação de uma classe "Círculo"
Crie uma classe chamada "Círculo" que represente um círculo com raio. A classe
deve ter os seguintes atributos privados: raio (double). Implemente métodos para
calcular a área e o perímetro do círculo. Deve herdar da classe
/Curso_java_unb/src/aula3oo/heranca/Forma.java
 */
public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
		
	    Circulo circulo = new Circulo(raio);
	
	    System.out.println("Raio do círculo: " + circulo.getRaio());
	    System.out.println("Área do círculo: " + circulo.calcularArea());
	    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
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

