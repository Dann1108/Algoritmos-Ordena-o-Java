import java.util.Arrays;
import java.util.Objects;

/**
 * Merge Sort: divide o vetor recursivamente e intercala partes ordenadas.
 * Melhor, medio e pior caso: O(n log n). Espaco auxiliar: O(n).
 */
public final class MergeSort {

    private MergeSort() {
        // Impede instanciacao desnecessaria.
    }

    /** Ordena o proprio vetor em ordem crescente, sem imprimir etapas. */
    public static void ordenar(int[] vetor) {
        ordenar(vetor, false);
    }

    /** Ordena o vetor e, se solicitado, exibe as etapas de intercalacao. */
    public static void ordenar(int[] vetor, boolean mostrarPassos) {
        Objects.requireNonNull(vetor, "O vetor nao pode ser nulo.");

        if (vetor.length < 2) {
            return; // Caso base: zero ou um elemento ja esta ordenado.
        }

        int[] auxiliar = new int[vetor.length];
        dividirEOrdenar(vetor, auxiliar, 0, vetor.length - 1, mostrarPassos);
    }

    /** Divide o intervalo em duas metades ate chegar ao caso base. */
    private static void dividirEOrdenar(int[] vetor, int[] auxiliar, int inicio,
                                        int fim, boolean mostrarPassos) {
        if (inicio >= fim) {
            return; // Caso base da recursao: intervalo de um elemento.
        }

        int meio = inicio + (fim - inicio) / 2;
        dividirEOrdenar(vetor, auxiliar, inicio, meio, mostrarPassos);
        dividirEOrdenar(vetor, auxiliar, meio + 1, fim, mostrarPassos);
        intercalar(vetor, auxiliar, inicio, meio, fim);

        if (mostrarPassos) {
            int[] trecho = Arrays.copyOfRange(vetor, inicio, fim + 1);
            System.out.println("  Intercalacao [" + inicio + ".." + fim + "]: "
                    + Arrays.toString(trecho));
        }
    }

    /** Une duas metades ja ordenadas em um unico intervalo ordenado. */
    private static void intercalar(int[] vetor, int[] auxiliar, int inicio,
                                   int meio, int fim) {
        int esquerda = inicio;
        int direita = meio + 1;
        int destino = inicio;

        // Compara o proximo elemento das duas metades.
        while (esquerda <= meio && direita <= fim) {
            // O <= preserva a ordem relativa dos elementos iguais (estabilidade).
            if (vetor[esquerda] <= vetor[direita]) {
                auxiliar[destino++] = vetor[esquerda++];
            } else {
                auxiliar[destino++] = vetor[direita++];
            }
        }

        // Copia os elementos que sobraram em cada metade.
        while (esquerda <= meio) {
            auxiliar[destino++] = vetor[esquerda++];
        }
        while (direita <= fim) {
            auxiliar[destino++] = vetor[direita++];
        }

        // Devolve ao vetor original o intervalo agora ordenado.
        for (int i = inicio; i <= fim; i++) {
            vetor[i] = auxiliar[i];
        }
    }
}
