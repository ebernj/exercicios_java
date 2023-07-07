package aula05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dado uma Lista de números inteiros, implemente um método que retorne a lista dos
 * números que aparecem mais de uma vez na lista.
 * public List<Integer> findDuplicates(List<Integer> numbers) {
 * }
 */

public class Exercicio1 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(22);
        numbers.add(33);
        numbers.add(21);
        numbers.add(44);
        numbers.add(33);
        numbers.add(10);

        List<Integer> duplicates = findDuplicates(numbers);
        System.out.println("Números duplicados: " + duplicates);
    }

    public static List<Integer> findDuplicates(List<Integer> numbers) {
        List<Integer> duplicates = new ArrayList<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Contar a frequência de cada número na lista
        for (int number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        // Adicionar os números duplicados à lista de retorno
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }

        return duplicates;
    }
}
