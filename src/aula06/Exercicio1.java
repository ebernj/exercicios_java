package aula06;

/**
 * Criação de uma classe genérica Pilha<T> que implementa uma pilha utilizando um
array para armazenar elementos do tipo T.
Pilha: Primeiro a entrar último a sair.
Os comentários dos métodos explicam as tarefas a serem realizadas
 */

public class Exercicio1 {

}

class Pilha<T> {
    private T[] elementos;
    private int topo;

    //Construtor que recebe o tamanho do array elementos como parâmetro
    public Pilha(int capacidade) {
    	//coloque o código de inicialização do array elementos aqui, não esqueça de iniciar o topo também
    	elementos = (T[]) new Object[capacidade];
    	topo = 0;
    }

	//recebe um elemento e adiciona na pilha, se a pilha atingiu a capacidade máxima, ou seja o array está completo, lance uma exceção: throw new IllegalStateException("A pilha está cheia.");  
    public void push(T elemento) throws IllegalStateException{
		//chame o método isFull() para testar se a pilha está cheia
		// se não estiver cheia adicione o elemento ao array e atualize o topo
        // …
    	
    	if (isFull()) {
    		throw new IllegalStateException("A pilha está cheia.");
    	}
    	
    	elementos[topo] = elemento;
    	topo++;
    	
    }
	// retira um elemento do topo da pilha, se a pilha estiver vazia lance uma exceção: throw new IllegalStateException("A pilha está vazia.");
    public T pop() throws IllegalStateException{
		// chame o método isEmpty() para verificar se a pilha está vazia
		// se não estiver vazia retorne o elemento do topo, remova o elemento do array e atualize o topo
        // … 

    	if (isEmpty()) {
      	  throw new IllegalStateException("A pilha está vazia.");
      	}
    	
    	T[] novoArray = (T[]) new Object[elementos.length];
    	int index = 0;
    	topo--;
    	
    	do {
    		novoArray[index]=elementos[index];
    		index++;
    	}while(index < topo);
    	
    	T elemento = elementos[topo];
    	
    	elementos = novoArray;
    	
    	return elemento;
    
    }

	//retorna o elemnto do topo sem remover do array, se a pilha estiver vazia lance uma exceção: throw new IllegalStateException("A pilha está vazia."); 
    public T peek() throws IllegalStateException{
      
    	if (isEmpty()) {
    	  throw new IllegalStateException("A pilha está vazia.");
    	}
    	
    	return (T)elementos[topo-1];
    }

    // método que checa se a pilha está vazia
    public boolean isEmpty() {
        if (topo == 0)
        	return true;
        
        return false;
    }
	
    //método que checa se a pilha está cheia
    public boolean isFull() {
    	
    	if (topo == elementos.length)
    		return true;
         
    	return false;
    }
	
    //retorna quantos elementos estão na pilha, não é o tamanho do array 
    public int size() {
    	return topo;
    }
}