package aula07;

public class Exercicio1 {
	
	public static void main(String args[]) {
		new Subtracao().executa(10, 5);
		new Multiplicacao().executa(6, 2);
		new Divisao().executa(15, 3);
	}

}

abstract class Operacao{
	
	public abstract void executa(int primeiro, int segundo);
	
}

class Subtracao extends Operacao{
	
	@Override
	public void executa(int primeiro, int segundo) {
		
		System.out.println(primeiro+" - "+segundo+" = "+(primeiro - segundo));
		
	}
}

class Multiplicacao extends Operacao{

	@Override
	public void executa(int primeiro, int segundo) {
		System.out.println(primeiro+" * "+segundo+" = "+(primeiro * segundo));
	}
	
}

class Divisao extends Operacao{

	@Override
	public void executa(int primeiro, int segundo) {
		System.out.println(primeiro+" / "+segundo+" = "+((double)primeiro / (double)segundo));
	}
	
}