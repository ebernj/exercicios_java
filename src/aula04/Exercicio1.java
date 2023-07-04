package aula04;

/**
 * Cria��o de classes abstratas Implemente uma classe abstrata chamada "Veiculo"
que contenha os seguintes m�todos abstratos:
- acelerar(int velocidade): acelera o ve�culo para a velocidade
especificada.
- frear(): realiza a frenagem do ve�culo. Crie duas classes derivadas de
"Veiculo" chamadas "Carro" e "Moto". Implemente os m�todos abstratos de
acordo com o comportamento esperado para cada tipo de ve�culo. Em
seguida, crie inst�ncias de Carro e Moto e teste os m�todos implementados.
 */
public class Exercicio1 {
	
	public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar(80);
        carro.frear();

        Moto moto = new Moto();
        moto.acelerar(60);
        moto.frear();
    }

}

abstract class Veiculo {
    public abstract void acelerar(int velocidade); //acelera o ve�culo para a velocidade especificada.
    public abstract void frear();
}

class Carro extends Veiculo {
    @Override
    public void acelerar(int velocidade) {
        System.out.println("O carro est� acelerando para " + velocidade + " km/h.");
    }

    @Override
    public void frear() {
        System.out.println("O carro est� freando.");
    }
}

class Moto extends Veiculo {
    @Override
    public void acelerar(int velocidade) {
        System.out.println("A moto est� acelerando para " + velocidade + " km/h.");
    }

    @Override
    public void frear() {
        System.out.println("A moto est� freando.");
    }
}


