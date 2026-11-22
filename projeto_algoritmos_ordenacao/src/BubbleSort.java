import java.util.Arrays;
import java.util.Objects;

/**
 * Bubble Sort: compara elementos vizinhos e troca os que estao fora de ordem.
 * Melhor caso: O(n), quando o vetor ja esta ordenado (com a otimizacao de parada).
 * Caso medio e pior caso: O(n^2). Espaco extra: O(1).
 */
public final class BubbleSort {

    private BubbleSort() {
        // Impede a criacao de objetos: esta classe oferece apenas metodos estaticos.
    }

    /** Ordena o proprio vetor em ordem crescente, sem imprimir etapas. */
    public static void ordenar(int[] vetor) {
        ordenar(vetor, false);
    }

    /**
     * Ordena o proprio vetor em ordem crescente.
     * @param vetor numeros que serao ordenados (nao pode ser null)
     * @param mostrarPassos true para imprimir o resultado de cada passada
     */
    public static void ordenar(int[] vetor, boolean mostrarPassos) {
        Objects.requireNonNull(vetor, "O vetor nao pode ser nulo.");

        // A cada passada, o maior numero restante vai para o final.
        for (int i = 0; i < vetor.length - 1; i++) {
            boolean houveTroca = false;

            // As ultimas i posicoes ja estao ordenadas.
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temporario = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temporario;
                    houveTroca = true;
                }
            }

            if (mostrarPassos) {
                System.out.println("  Passada " + (i + 1) + ": " + Arrays.toString(vetor));
            }

            // Se nao houve troca, o vetor ja esta totalmente ordenado.
            if (!houveTroca) {
                if (mostrarPassos) {
                    System.out.println("  Nenhuma troca: vetor ja ordenado.");
                }
                break;
            }
        }
    }
}
