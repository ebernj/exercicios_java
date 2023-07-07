package aula05;
import java.util.Stack;
/**
 * Dado uma string `s` contendo apenas os caracteres '(', ')', '{', '}', '[' e ']', determine se a
string de entrada � v�lida.
Uma string de entrada � v�lida se:
Os caracteres abertos devem ser fechados pelo mesmo tipo de caracteres.
Os caracteres abertos devem ser fechados na ordem correta.
Cada caracter fechado tem um caracteres aberto correspondente do mesmo tipo.
Exemplo de entrada v�lida:
(){[()]}
()[]{}
Exemplode entrada inv�lida:
(]
[{}())
class Solution {
public boolean isValid(String s) {
}
}

 */

public class Exercicio4 {

    public static void main(String[] args) {
        String input1 = "(){[()]}";
        String input2 = "()[]{";
        String input3 = "[{}())";

        System.out.println("Input 1 � v�lido? " + isValid(input1));
        System.out.println("Input 2 � v�lido? " + isValid(input2));
        System.out.println("Input 3 � v�lido? " + isValid(input3));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')')
                || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
