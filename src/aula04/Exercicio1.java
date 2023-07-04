package aula04;

/**
 * Criação de classes abstratas Implemente uma classe abstrata chamada "Veiculo"
que contenha os seguintes métodos abstratos:
- acelerar(int velocidade): acelera o veículo para a velocidade
especificada.
- frear(): realiza a frenagem do veículo. Crie duas classes derivadas de
"Veiculo" chamadas "Carro" e "Moto". Implemente os métodos abstratos de
acordo com o comportamento esperado para cada tipo de veículo. Em
seguida, crie instâncias de Carro e Moto e teste os métodos implementados.
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
    public abstract void acelerar(int velocidade); //acelera o veículo para a velocidade especificada.
    public abstract void frear();
}

class Carro extends Veiculo {
    @Override
    public void acelerar(int velocidade) {
        System.out.println("O carro está acelerando para " + velocidade + " km/h.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}

class Moto extends Veiculo {
    @Override
    public void acelerar(int velocidade) {
        System.out.println("A moto está acelerando para " + velocidade + " km/h.");
    }

    @Override
    public void frear() {
        System.out.println("A moto está freando.");
    }
}


