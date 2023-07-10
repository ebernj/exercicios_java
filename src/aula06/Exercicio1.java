package aula06;

/**
 * Cria��o de uma classe gen�rica Pilha<T> que implementa uma pilha utilizando um
array para armazenar elementos do tipo T.
Pilha: Primeiro a entrar �ltimo a sair.
Os coment�rios dos m�todos explicam as tarefas a serem realizadas
 */

public class Exercicio1 {

}

class Pilha<T> {
    private T[] elementos;
    private int topo;

    //Construtor que recebe o tamanho do array elementos como par�metro
    public Pilha(int capacidade) {
    	//coloque o c�digo de inicializa��o do array elementos aqui, n�o esque�a de iniciar o topo tamb�m
    	elementos = (T[]) new Object[capacidade];
    	topo = 0;
    }

	//recebe um elemento e adiciona na pilha, se a pilha atingiu a capacidade m�xima, ou seja o array est� completo, lance uma exce��o: throw new IllegalStateException("A pilha est� cheia.");  
    public void push(T elemento) throws IllegalStateException{
		//chame o m�todo isFull() para testar se a pilha est� cheia
		// se n�o estiver cheia adicione o elemento ao array e atualize o topo
        // �
    	
    	if (isFull()) {
    		throw new IllegalStateException("A pilha est� cheia.");
    	}
    	
    	elementos[topo] = elemento;
    	topo++;
    	
    }
	// retira um elemento do topo da pilha, se a pilha estiver vazia lance uma exce��o: throw new IllegalStateException("A pilha est� vazia.");
    public T pop() throws IllegalStateException{
		// chame o m�todo isEmpty() para verificar se a pilha est� vazia
		// se n�o estiver vazia retorne o elemento do topo, remova o elemento do array e atualize o topo
        // � 

    	if (isEmpty()) {
      	  throw new IllegalStateException("A pilha est� vazia.");
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

	//retorna o elemnto do topo sem remover do array, se a pilha estiver vazia lance uma exce��o: throw new IllegalStateException("A pilha est� vazia."); 
    public T peek() throws IllegalStateException{
      
    	if (isEmpty()) {
    	  throw new IllegalStateException("A pilha est� vazia.");
    	}
    	
    	return (T)elementos[topo-1];
    }

    // m�todo que checa se a pilha est� vazia
    public boolean isEmpty() {
        if (topo == 0)
        	return true;
        
        return false;
    }
	
    //m�todo que checa se a pilha est� cheia
    public boolean isFull() {
    	
    	if (topo == elementos.length)
    		return true;
         
    	return false;
    }
	
    //retorna quantos elementos est�o na pilha, n�o � o tamanho do array 
    public int size() {
    	return topo;
    }
}