package aula02;

/**
 * Cadastro de Alunos
Crie uma classe chamada "Aluno" que represente um aluno de uma institui��o de
ensino. O aluno deve possuir os seguintes atributos privados: nome (String),
matricula (String) e curso (String).
Implemente os seguintes construtores na classe "Aluno":
1. Construtor padr�o: n�o recebe nenhum par�metro e inicializa todos os
atributos com valores padr�o.
2. Construtor com par�metros: recebe os valores para nome, matricula e curso e
inicializa os atributos correspondentes.
Al�m disso, crie um m�todo para exibir as informa��es do aluno (nome, matricula e
curso).
Em seguida, crie uma classe "CadastroAlunos" com o m�todo main() para testar a
classe "Aluno". No m�todo main(), crie dois objetos Aluno utilizando os construtores
diferentes e exiba as informa��es dos alunos criados.

 */
public class Exercicio4 {//Esta classe representa a classe CadastroAlunos solicitada no exerc�cio
	
	public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno("Jo�o", "2021001", "Engenharia");

        System.out.println("Informa��es do Aluno 1:");
        aluno1.exibirInformacoes();

        System.out.println("\nInforma��es do Aluno 2:");
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
        System.out.println("Matr�cula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}

