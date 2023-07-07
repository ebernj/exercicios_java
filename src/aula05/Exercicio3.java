package aula05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Dado um Map que representa uma tabela de pontua��o de times em um
campeonato, implemente um m�todo que retorne o time com a maior pontua��o.
public String getTeamWithHighestScore(Map<String, Integer> scores) {
}
 */

public class Exercicio3 {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Time A", 15);
        scores.put("Time B", 15);
        scores.put("Time C", 8);
        scores.put("Time D", 12);

        //String teamWithHighestScore = getTeamWithHighestScore(scores);
        System.out.println("Time com maior pontua��o: " + getTeamWithHighestScore(scores));
    }

    public static List<String> getTeamWithHighestScore(Map<String, Integer> scores) {
        List<String> teamsWithHighestScore = new ArrayList<String>();
        int highestScore = 0;

        // Encontrar a maior pontua��o
        for (int score : scores.values()) {
            if (score > highestScore) {
                highestScore = score;
            }
        }

        // Adicionar os times com a maior pontua��o � lista
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String team = entry.getKey();
            int score = entry.getValue();

            if (score == highestScore) {
                teamsWithHighestScore.add(team);
            }
        }

        return teamsWithHighestScore;
    }
}
