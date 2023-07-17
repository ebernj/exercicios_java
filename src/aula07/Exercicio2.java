package aula07;

public class Exercicio2 {
	public static void main(String args[]) {
		new Exponenciacao().executa(14, 3);
		new Percent().executa(10, 40);
	}
}

class Exponenciacao extends Operacao{

	@Override
	public void executa(int primeiro, int segundo) {
		System.out.println(primeiro+" ^ "+segundo+" = "+(primeiro ^ segundo));
	}
	
}

class Percent extends Operacao{
	
	@Override
	public void executa(int primeiro, int segundo) {
		System.out.println(primeiro+" % "+segundo+" = "+((double)segundo*((double)primeiro/100)));
	}
}
