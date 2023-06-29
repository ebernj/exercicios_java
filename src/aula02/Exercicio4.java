package aula02;

/**
 * Cadastro de Alunos
Crie uma classe chamada "Aluno" que represente um aluno de uma instituição de
ensino. O aluno deve possuir os seguintes atributos privados: nome (String),
matricula (String) e curso (String).
Implemente os seguintes construtores na classe "Aluno":
1. Construtor padrão: não recebe nenhum parâmetro e inicializa todos os
atributos com valores padrão.
2. Construtor com parâmetros: recebe os valores para nome, matricula e curso e
inicializa os atributos correspondentes.
Além disso, crie um método para exibir as informações do aluno (nome, matricula e
curso).
Em seguida, crie uma classe "CadastroAlunos" com o método main() para testar a
classe "Aluno". No método main(), crie dois objetos Aluno utilizando os construtores
diferentes e exiba as informações dos alunos criados.

 */
public class Exercicio4 {//Esta classe representa a classe CadastroAlunos solicitada no exercício
	
	public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("João", "2021001", "Engenharia");

        System.out.println("Informações do Aluno 1:");
        aluno1.exibirInformacoes();

        System.out.println("\nInformações do Aluno 2:");
        aluno2.exibirInformacoes();
    }

}

 class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    public Aluno() {
        nome = "N/A";
        matricula = "N/A";
        curso = "N/A";
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}

