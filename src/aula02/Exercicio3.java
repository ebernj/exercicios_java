package aula02;

/**
 * Exerc�cio 3: Cadastro de funcion�rios com as classes
"Funcionario" e "Gerente"
Crie uma classe "Funcionario" com atributos privados nome (String) e salario
(double), al�m de m�todos getters e setters. Em seguida, crie uma classe "Gerente"
que herde da classe "Funcionario" e tenha um atributo privado departamento (String)
e um m�todo para calcular o b�nus salarial. Utilize o encapsulamento e heran�a
para implementar a funcionalidade.
 */
public class Exercicio3 {
	
	public static void main(String[] args) {
        Gerente gerente = new Gerente("Jo�o", 5000.0, "Vendas");

        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Sal�rio: R$" + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento());
        System.out.println("B�nus: R$" + gerente.calcularBonus());
    }

}

class Funcionario{
	
	private String nome;
	private double salario;
	
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}

class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double calcularBonus() {
        return getSalario() * 0.01; // 1% do sal�rio como b�nus
    }
}