package aula03;

/**
 * Exerc�cio3
 * O que ocorre ao compilar e executar esse c�digo?
 * Em caso de erro como corrigir? 
 * 
 * 1. O m�todo exibirInformacoes est� final e n�o pode ser overrided
 * 
 */
public class ExercicioMetodoFinal {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5, 10);
        retangulo.exibirInformacoes();
        retangulo.calcularArea();
    }
}

class Forma {
    public  void exibirInformacoes() {
        System.out.println("Esta � uma forma geom�trica.");
    }
}

class Retangulo extends Forma {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

 
    public void exibirInformacoes() {
        System.out.println("Este � um ret�ngulo com largura " + largura + " e altura " + altura + ".");
    }

    public void calcularArea() {
        int area = largura * altura;
        System.out.println("A �rea do ret�ngulo �: " + area);
    }
}