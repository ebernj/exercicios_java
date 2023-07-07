package aula05;
import java.util.LinkedList;
/**
 * Voc� recebe as cabe�as de duas listas encadeadas ordenadas, list1 e list2.
Combine as duas listas em uma �nica lista ordenada. A lista deve ser formada pela
concatena��o dos n�s das duas listas originais.
Retorne a cabe�a da lista encadeada mesclada.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1,
LinkedList<Integer> list2) {
}
a resposta N�O deve utilizar o m�todo Collections.sort(
 */

public class Exercicio5 {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(3);
        list2.add(4);

        LinkedList<Integer> mergedList = mergeTwoLists(list1, list2);
        System.out.println("Lista mesclada: " + mergedList);
    }

    public static LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> mergedList = new LinkedList<>();

        // Percorrer as duas listas e adicionar os elementos � lista mesclada em ordem
        while (!list1.isEmpty() && !list2.isEmpty()) {
            if (list1.getFirst() <= list2.getFirst()) {
                mergedList.add(list1.removeFirst());
            } else {
                mergedList.add(list2.removeFirst());
            }
        }

        // Adicionar os elementos restantes da primeira lista (se houver)
        while (!list1.isEmpty()) {
            mergedList.add(list1.removeFirst());
        }

        // Adicionar os elementos restantes da segunda lista (se houver)
        while (!list2.isEmpty()) {
            mergedList.add(list2.removeFirst());
        }

        return mergedList;
    }
}
