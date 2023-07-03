package aula03;

/**
 * Considere as classes Veiculo, Carro e Moto. A classe Veiculo método acelerar(). 
 * As classes Carro e Moto herdam da classe Veiculo e implementam o método acelerar() para exibir a velocidade máxima atingida por cada veículo.
 * Crie uma instância de Carro e uma instância de Moto. Chame o método acelerar() para cada uma delas e exiba o resultado. 
 */

class Veiculo {
    public void acelerar() {
        // Implementação vazia
    }
}

class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Velocidade máxima do carro: 200 km/h");
    }
}

class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Velocidade máxima da moto: 180 km/h");
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.acelerar();
        moto.acelerar();
    }
}
