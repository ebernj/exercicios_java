package aula05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dado um lista de strings, implemente um método que retorne um Map que conte a
quantidade de ocorrências de cada string na lista.
public Map<String, Integer> countOccurrences(List<String> strings) {
}

 */
public class Exercicio2 {

    public static void main(String[] args) {
    	List<String> strings = Arrays.asList("a", "a", "a", "a", "b", "b", "c");

        Map<String, Integer> occurrences = countOccurrences(strings);
        System.out.println("Contagem de ocorrências: " + occurrences);
    }

    public static Map<String, Integer> countOccurrences(List<String> strings) {
        Map<String, Integer> occurrences = new HashMap<>();

        // Contar a quantidade de ocorrências de cada string na lista
        for (String str : strings) {
            occurrences.put(str, occurrences.getOrDefault(str, 0) + 1);
        }

        return occurrences;
    }
}
