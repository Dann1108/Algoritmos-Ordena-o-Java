import java.util.Arrays;
import java.util.Scanner;

/**
 * Programa principal da apresentacao de Estruturas de Dados 2.
 * Permite visualizar, comparar e testar tres algoritmos de ordenacao.
 
 */
public class Main {

    private static final int[] EXEMPLO = {7, 2, 9, 4, 1, 6};

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            if (!entrada.hasNextLine()) {
                break; // Encerra corretamente se a entrada terminar.
            }

            String opcao = entrada.nextLine().trim();
            switch (opcao) {
                case "1":
                    System.out.println("\nDEMONSTRACAO COM PASSO A PASSO");
                    compararAlgoritmos(EXEMPLO, true);
                    break;
                case "2":
                    lerVetorPersonalizado(entrada);
                    break;
                case "3":
                    executarCasosEspeciais();
                    break;
                case "0":
                    continuar = false;
                    System.out.println("Encerrando o programa. Ate mais!");
                    break;
                default:
                    System.out.println("Opcao invalida. Escolha 0, 1, 2 ou 3.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("\n=========================================");
        System.out.println("  ESTRUTURAS DE DADOS 2 - ORDENACAO");
        System.out.println("=========================================");
        System.out.println("1 - Demonstracao passo a passo");
        System.out.println("2 - Digitar meu proprio vetor");
        System.out.println("3 - Testar casos especiais");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opcao: ");
    }

    private static void lerVetorPersonalizado(Scanner entrada) {
        System.out.println("Digite numeros inteiros separados por espacos.");
        System.out.print("Exemplo: 10 5 -2 5 0\nVetor: ");
        if (!entrada.hasNextLine()) {
            return;
        }

        String linha = entrada.nextLine().trim();
        if (linha.isEmpty()) {
            System.out.println("Nenhum numero informado. Tente novamente.");
            return;
        }

        String[] partes = linha.split("\\s+");
        int[] vetor = new int[partes.length];
        try {
            for (int i = 0; i < partes.length; i++) {
                vetor[i] = Integer.parseInt(partes[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada invalida: use apenas numeros inteiros separados por espacos.");
            return;
        }

        compararAlgoritmos(vetor, true);
    }

    /** Usa casos de borda que podem ser comentados na apresentacao do video. */
    private static void executarCasosEspeciais() {
        int[][] testes = {
            {},
            {5},
            {1, 2, 3, 4, 5},
            {5, 4, 3, 2, 1},
            {4, 2, 4, 1, 2},
            {-3, 7, 0, -10, 5}
        };
        String[] nomes = {
            "Vetor vazio", "Um elemento", "Ja ordenado",
            "Ordem inversa", "Valores repetidos", "Numeros negativos"
        };

        for (int i = 0; i < testes.length; i++) {
            System.out.println("\nCASO " + (i + 1) + " - " + nomes[i]);
            compararAlgoritmos(testes[i], false);
        }
    }

    /**
     * Clona o mesmo vetor para que os tres algoritmos recebam entradas iguais.
     * Todos os metodos ordenar modificam o proprio vetor recebido.
     */
    private static void compararAlgoritmos(int[] original, boolean mostrarPassos) {
        int[] bubble = original.clone();
        int[] selection = original.clone();
        int[] merge = original.clone();

        System.out.println("\nEntrada original: " + Arrays.toString(original));

        System.out.println("\n--- BUBBLE SORT ---");
        BubbleSort.ordenar(bubble, mostrarPassos);
        System.out.println("Resultado: " + Arrays.toString(bubble));

        System.out.println("\n--- SELECTION SORT ---");
        SelectionSort.ordenar(selection, mostrarPassos);
        System.out.println("Resultado: " + Arrays.toString(selection));

        System.out.println("\n--- MERGE SORT (RECURSIVO) ---");
        MergeSort.ordenar(merge, mostrarPassos);
        System.out.println("Resultado: " + Arrays.toString(merge));

        boolean iguais = Arrays.equals(bubble, selection) && Arrays.equals(selection, merge);
        System.out.println("\nOs tres resultados sao iguais? " + (iguais ? "SIM" : "NAO"));

        // Checagem adicional usando a ordenacao de referencia do proprio Java.
        int[] esperado = original.clone();
        Arrays.sort(esperado);
        boolean corretos = Arrays.equals(esperado, bubble)
                && Arrays.equals(esperado, selection)
                && Arrays.equals(esperado, merge);
        System.out.println("Resultados corretos? " + (corretos ? "SIM" : "NAO"));
    }
}
