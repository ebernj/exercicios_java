package aula03;
/**
 * Exerc�cio 5
 * Qual o resultado do programa: 
 */
public class ExercicioPassagemParametros2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Antes da chamada do m�todo: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        modificarArray(array);
        System.out.println("\nAp�s a chamada do m�todo: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void modificarArray(int[] arr) {
        arr = new int[]{10, 20, 30, 40, 50};
        System.out.println("\nDentro do m�todo: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}