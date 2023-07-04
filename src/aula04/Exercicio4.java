package aula04;
/**
 * Figuras Geométricas Desafio: Crie uma interface chamada Figura com métodos
 * calcularArea() e calcularPerimetro(). Em seguida, crie as classes Quadrado,
 * Circulo e Triangulo que implementam a interface Figura e fornecem
 * implementações para os métodos. Na classe Main, crie objetos das diferentes
 * figuras geométricas e exiba suas áreas e perímetros.
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
 * Compatível com triângulo retângulo
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
        System.out.println("Área: " + quadrado.calcularArea());
        System.out.println("Perímetro: " + quadrado.calcularPerimetro());

        Circulo circulo = new Circulo(3);
        System.out.println("\nCírculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        Triangulo triangulo = new Triangulo(4, 5);
        System.out.println("\nTriângulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    }
}
