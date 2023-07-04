package aula04;
/**
 * Figuras Geom�tricas Desafio: Crie uma interface chamada Figura com m�todos
 * calcularArea() e calcularPerimetro(). Em seguida, crie as classes Quadrado,
 * Circulo e Triangulo que implementam a interface Figura e fornecem
 * implementa��es para os m�todos. Na classe Main, crie objetos das diferentes
 * figuras geom�tricas e exiba suas �reas e per�metros.
 */

interface Figura {
    double calcularArea();
    double calcularPerimetro();
}

class Quadrado implements Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
}

class Circulo implements Figura {
    private double raio;
    private static final double PI = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * PI * raio;
    }
}

/**
 * Compat�vel com tri�ngulo ret�ngulo
 */
class Triangulo implements Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((base * base) + (altura * altura));
        return base + altura + hipotenusa;
    }
}

public class Exercicio4 {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        System.out.println("Quadrado:");
        System.out.println("�rea: " + quadrado.calcularArea());
        System.out.println("Per�metro: " + quadrado.calcularPerimetro());

        Circulo circulo = new Circulo(3);
        System.out.println("\nC�rculo:");
        System.out.println("�rea: " + circulo.calcularArea());
        System.out.println("Per�metro: " + circulo.calcularPerimetro());

        Triangulo triangulo = new Triangulo(4, 5);
        System.out.println("\nTri�ngulo:");
        System.out.println("�rea: " + triangulo.calcularArea());
        System.out.println("Per�metro: " + triangulo.calcularPerimetro());
    }
}
