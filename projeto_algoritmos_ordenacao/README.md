# Algoritmos de Ordenacao — Estruturas de Dados 2

Projeto educacional sobre **Bubble Sort, Selection Sort e Merge Sort**, desenvolvido em **Java**, para apresentar tres formas de ordenar um vetor de numeros inteiros. O Merge Sort satisfaz o requisito de incluir pelo menos um algoritmo recursivo.

## Informacoes do trabalho

- **Instituicao:** Unipe — Centro Universitario de Joao Pessoa
- **Disciplina:** Estruturas de Dados 2
- **Professor:** Edkallenn (Ed)
- **Tema:** Algoritmos de Ordenacao (tema 9)
- **Responsavel pelo desenvolvimento inicial:** [PREENCHER NOME]
- **Segundo integrante:** [PREENCHER QUANDO DEFINIDO, OU COMBINAR EXCECAO COM O PROFESSOR]
- **Video:** [ADICIONAR LINK DO VIDEO APOS PUBLICACAO]

> O enunciado exige trabalho em dupla, salvo casos excepcionais alinhados previamente com o professor. Ambos os integrantes devem enviar os links no Blackboard.

## Algoritmos e complexidade

| Algoritmo | Ideia principal | Melhor caso | Caso medio | Pior caso | Espaco extra | Estavel? |
|---|---|---|---|---|---|---|
| Bubble Sort (com parada antecipada) | Troca vizinhos fora de ordem | O(n) | O(n²) | O(n²) | O(1) | Sim |
| Selection Sort | Seleciona o menor da parte nao ordenada | O(n²) | O(n²) | O(n²) | O(1) | Nao, em geral |
| Merge Sort | Divide recursivamente e intercala | O(n log n) | O(n log n) | O(n log n) | O(n) | Sim |

**Observacao:** as complexidades de espaco extra desconsideram o vetor de entrada; no Merge Sort, a implementacao utiliza um vetor auxiliar de tamanho `n` e pilha de chamadas recursivas `O(log n)`.

## Estrutura de arquivos

```text
projeto_algoritmos_ordenacao/
├── src/
│   ├── Main.java
│   ├── BubbleSort.java
│   ├── SelectionSort.java
│   ├── MergeSort.java
│   └── TestesOrdenacao.java
└── README.md
```

## Requisitos

- JDK 8 ou superior instalado (inclui `javac` e `java`).
- Terminal, VS Code ou IntelliJ IDEA.
- Nenhuma biblioteca externa e necessaria.

## Compilar e executar (Windows, Linux e macOS)

Abra um terminal **na pasta raiz do projeto**, onde se encontra este README, e execute:

```bash
javac -encoding UTF-8 src/Main.java src/BubbleSort.java src/SelectionSort.java src/MergeSort.java src/TestesOrdenacao.java
java -cp src Main
```

No menu principal:

- `1` — executa os tres algoritmos no vetor `[7, 2, 9, 4, 1, 6]` e mostra as etapas;
- `2` — permite digitar numeros inteiros separados por espacos;
- `3` — executa vetores especiais (vazio, um elemento, ordenado, invertido, repetidos e negativos);
- `0` — encerra o programa.

O programa mostra o resultado de cada algoritmo e confirma se ele esta correto comparando-o com `Arrays.sort` (utilizado apenas para verificacao, nunca para fazer o trabalho dos tres algoritmos).

## Testes automatizados

Depois de compilar, execute:

```bash
java -cp src TestesOrdenacao
```

Sao testados 9 casos fixos e 100 vetores pseudoaleatorios para cada algoritmo, totalizando **327 verificacoes**. Nao depende de JUnit ou de ferramentas externas.

## Exemplo de entrada e saida

Entrada: `[7, 2, 9, 4, 1, 6]`

Saida final de Bubble Sort: `[1, 2, 4, 6, 7, 9]`

Saida final de Selection Sort: `[1, 2, 4, 6, 7, 9]`

Saida final de Merge Sort: `[1, 2, 4, 6, 7, 9]`

## Sugestao para a gravacao do video

1. Introduza o problema: ordenar numeros inteiros em ordem crescente.
2. Ilustre visualmente cada algoritmo com o mesmo vetor.
3. Explique em detalhe os principais lacos de repeticao, trocas, caso base e intercalacao.
4. No terminal, execute `Main` e escolha a opcao `1` para mostrar o passo a passo.
5. Execute a opcao `3` para demonstrar casos especiais.
6. Execute `TestesOrdenacao` para verificar os resultados.
7. Compare as complexidades e mostre o link para o repositorio GitHub.

## Links obrigatorios antes de entregar

- Repositorio GitHub publico: [ADICIONAR URL]
- Video no YouTube (publico ou nao listado), TikTok ou Kwai: [ADICIONAR URL]
- Entrega: enviar **ambos os links** no Blackboard. Na modalidade em dupla, **cada integrante** deve enviar os links.
