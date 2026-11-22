import java.util.Arrays;
import java.util.Objects;

/**
 * Selection Sort: seleciona o menor elemento da parte nao ordenada do vetor.

 */
public final class SelectionSort {

    private SelectionSort() {
        // Impede instanciacao desnecessaria.
    }

    /** Ordena o proprio vetor em ordem crescente, sem imprimir etapas. */
    public static void ordenar(int[] vetor) {
        ordenar(vetor, false);
    }

    /** Ordena o proprio vetor; opcionalmente exibe cada selecao. */
    public static void ordenar(int[] vetor, boolean mostrarPassos) {
        Objects.requireNonNull(vetor, "O vetor nao pode ser nulo.");

        for (int i = 0; i < vetor.length - 1; i++) {
            int indiceMenor = i;

            // Procura o indice do menor numero na parte ainda nao ordenada.
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            // Coloca o menor elemento na posicao definitiva da passada.
            if (indiceMenor != i) {
                int temporario = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = temporario;
            }

            if (mostrarPassos) {
                System.out.println("  Selecao " + (i + 1) + ": " + Arrays.toString(vetor));
            }
        }
    }
}
