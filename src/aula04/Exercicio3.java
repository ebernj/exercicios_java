package aula04;

/**
 * Comparação de Objetos Desafio:
 * Crie uma interface chamada Comparavel com um método comparar(Comparavel
 * outro). Em seguida, crie uma classe abstrata chamada ObjetoComparavel que implemente a interface Comparavel.
 * Por fim, crie uma classe Aluno (atributos nome e idade) que herde de
 * ObjetoComparavel e implemente o método comparar().
 * Na classe Main, crie um array com 10 objetos Aluno e dois métodos com assinaturas
 * public Aluno maxIdade(Aluno[] alunos){...} e public Aluno minIdade(Aluno[]
 * alunos){...} que utilize o método comparar() para retornar os alunos com maior e menor idade
 */

interface Comparavel {
    int comparar(Comparavel outro);
}


abstract class ObjetoComparavel implements Comparavel {
    // Implementação padrão do método comparar para ordenação ascendente
    @Override
    public int comparar(Comparavel outro) {
        if (this == outro) {
            return 0;
        } else if (this.hashCode() < outro.hashCode()) {
            return -1;
        } else {
            return 1;
        }
    }
}

class Aluno extends ObjetoComparavel {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int comparar(Comparavel outro) {
        if (outro instanceof Aluno) {
            Aluno outroAluno = (Aluno) outro;
            return Integer.compare(this.idade, outroAluno.idade);
        }
        return super.comparar(outro);
    }
}

public class Exercicio3 {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[10];
        alunos[0] = new Aluno("João", 20);
        alunos[1] = new Aluno("Maria", 22);
        alunos[2] = new Aluno("Pedro", 19);
        alunos[3] = new Aluno("Ana", 21);
        alunos[4] = new Aluno("Lucas", 25);
        alunos[5] = new Aluno("Julia", 18);
        alunos[6] = new Aluno("Marcos", 23);
        alunos[7] = new Aluno("Carolina", 24);
        alunos[8] = new Aluno("Felipe", 19);
        alunos[9] = new Aluno("Mariana", 20);

        Aluno alunoMaisVelho = maxIdade(alunos);
        Aluno alunoMaisNovo = minIdade(alunos);

        System.out.println("Aluno mais velho: " + alunoMaisVelho.getNome() + " (" + alunoMaisVelho.getIdade() + " anos)");
        System.out.println("Aluno mais novo: " + alunoMaisNovo.getNome() + " (" + alunoMaisNovo.getIdade() + " anos)");
    }

    public static Aluno maxIdade(Aluno[] alunos) {
        Aluno max = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].comparar(max) > 0) {
                max = alunos[i];
            }
        }
        return max;
    }

    public static Aluno minIdade(Aluno[] alunos) {
        Aluno min = alunos[0];
        for (int i = 1; i < alunos.length; i++) {
            if (alunos[i].comparar(min) < 0) {
                min = alunos[i];
            }
        }
        return min;
    }
}
