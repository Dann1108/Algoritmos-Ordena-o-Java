import java.util.Arrays;
import java.util.Random;

/**
 * Testes automatizados sem bibliotecas externas.

 */
public class TestesOrdenacao {

    public static void main(String[] args) {
        int[][] casos = {
            {}, {1}, {2, 1}, {1, 2, 3, 4, 5}, {5, 4, 3, 2, 1},
            {4, 2, 4, 1, 2}, {-3, 7, 0, -10, 5}, {0, 0, 0, 0},
            {Integer.MIN_VALUE, Integer.MAX_VALUE, 0, -1, 1}
        };
        int total = 0;
        for (int[] caso : casos) {
            testarTodos(caso);
            total++;
        }

        
        Random sorteio = new Random(2026);
        for (int teste = 0; teste < 100; teste++) {
            int[] vetor = new int[sorteio.nextInt(51)];
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = sorteio.nextInt(201) - 100;
            }
            testarTodos(vetor);
            total++;
        }

        System.out.println("SUCESSO: " + total
                + " vetores testados em cada um dos 3 algoritmos ("
                + (total * 3) + " verificacoes).");
    }

    private static void testarTodos(int[] original) {
        int[] esperado = original.clone();
        Arrays.sort(esperado);

        int[] bubble = original.clone();
        BubbleSort.ordenar(bubble);
        verificar("Bubble Sort", original, esperado, bubble);

        int[] selection = original.clone();
        SelectionSort.ordenar(selection);
        verificar("Selection Sort", original, esperado, selection);

        int[] merge = original.clone();
        MergeSort.ordenar(merge);
        verificar("Merge Sort", original, esperado, merge);
    }

    private static void verificar(String nome, int[] original, int[] esperado, int[] obtido) {
        if (!Arrays.equals(esperado, obtido)) {
            throw new AssertionError(nome + " falhou para " + Arrays.toString(original)
                    + ". Esperado: " + Arrays.toString(esperado)
                    + "; obtido: " + Arrays.toString(obtido));
        }
    }
}
