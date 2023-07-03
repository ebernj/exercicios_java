package aula03;

/**
 * Considere as classes Veiculo, Carro e Moto. A classe Veiculo m�todo acelerar(). 
 * As classes Carro e Moto herdam da classe Veiculo e implementam o m�todo acelerar() para exibir a velocidade m�xima atingida por cada ve�culo.
 * Crie uma inst�ncia de Carro e uma inst�ncia de Moto. Chame o m�todo acelerar() para cada uma delas e exiba o resultado. 
 */

class Veiculo {
    public void acelerar() {
        // Implementa��o vazia
    }
}

class Carro extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Velocidade m�xima do carro: 200 km/h");
    }
}

class Moto extends Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Velocidade m�xima da moto: 180 km/h");
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
