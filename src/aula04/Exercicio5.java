package aula04;

/**
 * Processador de Pagamentos Desafio: Crie uma interface chamada
 * ProcessadorPagamento com um método processarPagamento(double valor). Em
 * seguida, crie as classes PagamentoCartao e PagamentoBoleto que implementam a
 * interface e fornecem implementações específicas para o método. Na classe Main,
 * crie objetos dos diferentes tipos de pagamento e invoque o método
 * processarPagamento() para cada um
 */

interface ProcessadorPagamento {
    void processarPagamento(double valor);
}

class PagamentoCartao implements ProcessadorPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de R$" + valor + " via cartão de crédito.");
    }
}

class PagamentoBoleto implements ProcessadorPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Gerando boleto para pagamento de R$" + valor + ".");
    }
}

public class Exercicio5 {
    public static void main(String[] args) {
        ProcessadorPagamento pagamentoCartao = new PagamentoCartao();
        pagamentoCartao.processarPagamento(100.50);

        ProcessadorPagamento pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.processarPagamento(250.75);
    }
}
