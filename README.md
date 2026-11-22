# 📚 Algoritmos de Ordenação em Java

### Trabalho Acadêmico — Estruturas de Dados 2 | Unipê

Este repositório apresenta a implementação e a análise de três algoritmos de ordenação desenvolvidos na linguagem **Java**: Bubble Sort, Selection Sort e Merge Sort.

O projeto foi desenvolvido para a disciplina de **Estruturas de Dados 2**, do Centro Universitário de João Pessoa (Unipê), sob orientação do professor **Edkallenn (Ed)**.

O objetivo é demonstrar como diferentes algoritmos conseguem ordenar conjuntos de números, explicando seu funcionamento, suas características e suas complexidades computacionais.

---

## 📌 Informações do Projeto

- **Instituição:** Unipê — Centro Universitário de João Pessoa
- **Disciplina:** Estruturas de Dados 2
- **Professor:** Edkallenn (Ed)
- **Tema:** Algoritmos de Ordenação
- **Linguagem:** Java
- **Primeiro integrante:** Daniel Paulo De Oliveira Almeida Filho
- **Segundo integrante:** Ricardo Alexandre Cabral De Godói Filho


**Repositório:** https://github.com/Dann1108/Algoritmos-Ordena-o-Java

---

## 🎯 Objetivo

Demonstrar o funcionamento de três algoritmos de ordenação, utilizando exemplos práticos e implementações em Java.

O projeto busca:

- Compreender os conceitos fundamentais de ordenação.
- Implementar três algoritmos utilizando Java.
- Demonstrar o funcionamento dos algoritmos passo a passo.
- Comparar suas complexidades de tempo e espaço.
- Aplicar conceitos de recursividade por meio do Merge Sort.
- Validar os resultados utilizando testes automatizados.

---

## 🧠 Algoritmos Implementados

### 1. Bubble Sort

O Bubble Sort é um algoritmo de ordenação que compara elementos vizinhos de um vetor e realiza trocas quando eles estão fora da ordem desejada.

Esse processo é repetido até que todos os elementos estejam organizados.

**Características:**

- Implementação simples.
- Utiliza comparações e trocas sucessivas.
- Possui uma otimização para interromper a execução quando nenhuma troca é necessária.
- É estável, preservando a ordem relativa dos elementos com valores iguais.

**Complexidade:**
- Melhor caso: O(n)
- Caso médio: O(n²)
- Pior caso: O(n²)
- Espaço auxiliar: O(1)

**Arquivo:** `BubbleSort.java`

### 2. Selection Sort

O Selection Sort funciona procurando o menor elemento da parte ainda não ordenada do vetor.

Após encontrar esse elemento, ele é colocado na posição correta. O processo continua até que todos os elementos estejam ordenados.

**Características:**

- Algoritmo simples e intuitivo.
- Seleciona o menor elemento a cada iteração.
- Realiza no máximo uma troca por posição.
- Não é estável em sua implementação tradicional.

**Complexidade:**
- Melhor caso: O(n²)
- Caso médio: O(n²)
- Pior caso: O(n²)
- Espaço auxiliar: O(1)

**Arquivo:** `SelectionSort.java`

### 3. Merge Sort

O Merge Sort é um algoritmo de ordenação que utiliza a estratégia de **divisão e conquista**.

Primeiro, divide o vetor em partes menores até que cada parte contenha apenas um elemento. Depois, combina essas partes de forma ordenada.

O algoritmo utiliza recursividade, atendendo ao requisito de implementação de pelo menos um algoritmo recursivo.

**Características:**

- Utiliza chamadas recursivas.
- Divide o problema em partes menores.
- Apresenta bom desempenho para conjuntos grandes.
- Precisa de memória auxiliar para realizar a intercalação.
- É estável nesta implementação.

**Complexidade:**
- Melhor caso: O(n log n)
- Caso médio: O(n log n)
- Pior caso: O(n log n)
- Espaço auxiliar: O(n)

**Arquivo:** `MergeSort.java`

---

## 📊 Comparação dos Algoritmos

| Algoritmo | Melhor caso | Caso médio | Pior caso | Espaço auxiliar |
|---|---|---|---|---|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) |

O **Merge Sort** apresenta melhor complexidade assintótica de tempo para grandes conjuntos de dados.

Já o Bubble Sort e o Selection Sort são úteis para fins educacionais, pois permitem visualizar facilmente os processos de comparação e troca.

---

## 📁 Estrutura do Projeto

O projeto contém os seguintes arquivos:

```text
projeto_algoritmos_ordenacao/
│
├── src/
│   ├── Main.java
│   ├── BubbleSort.java
│   ├── SelectionSort.java
│   ├── MergeSort.java
│   └── TestesOrdenacao.java
│
└── README.md
```

**Descrição dos arquivos:**

- `Main.java`: classe principal responsável pelo menu interativo e execução dos algoritmos.
- `BubbleSort.java`: implementação do Bubble Sort.
- `SelectionSort.java`: implementação do Selection Sort.
- `MergeSort.java`: implementação recursiva do Merge Sort.
- `TestesOrdenacao.java`: testes automatizados para verificar os resultados.
- `README.md`: documentação e instruções do projeto.

---

## 💻 Tecnologias Utilizadas

- **Java:** linguagem utilizada no desenvolvimento.
- **Visual Studio Code:** ambiente de desenvolvimento.
- **JDK:** compilação e execução dos códigos.
- **Git:** versionamento do projeto.
- **GitHub:** hospedagem do repositório.

O programa não depende de bibliotecas externas.

---

## 🚀 Como Executar o Projeto

### 1. Pré-requisitos

Para executar o programa, é necessário possuir:

- Java Development Kit (JDK 8 ou superior).
- Visual Studio Code ou outra IDE compatível.
- Terminal para executar os comandos Java.

### 2. Abrir o projeto

Faça o download do repositório e abra a pasta `projeto_algoritmos_ordenacao` no VS Code.

Abra o terminal integrado utilizando o atalho `Ctrl + '`.

### 3. Compilar os arquivos

No terminal, dentro da pasta `projeto_algoritmos_ordenacao`, execute:

```bash
javac -encoding UTF-8 src/Main.java src/BubbleSort.java src/SelectionSort.java src/MergeSort.java src/TestesOrdenacao.java
```

### 4. Executar o programa

Após compilar, execute:

```bash
java -cp src Main
```

### 5. Utilizar o menu

O programa apresenta as seguintes opções:

```text
=========================================
  ESTRUTURAS DE DADOS 2 - ORDENACAO
=========================================

1 - Demonstracao passo a passo
2 - Digitar meu proprio vetor
3 - Testar casos especiais
0 - Sair
```

**Opção 1:** demonstra os três algoritmos utilizando um vetor de exemplo.

**Opção 2:** permite informar os próprios números para ordenação.

**Opção 3:** executa diferentes casos especiais, incluindo números repetidos, valores negativos e vetores já ordenados.

**Opção 0:** encerra o programa.

---

## 🧪 Testes Automatizados

O projeto contém uma classe dedicada à verificação do funcionamento dos três algoritmos.

Para executar os testes, utilize:

```bash
java -cp src TestesOrdenacao
```

O programa verifica:

- Vetores vazios.
- Vetores com apenas um elemento.
- Vetores previamente ordenados.
- Vetores em ordem inversa.
- Valores repetidos.
- Números negativos.
- Valores inteiros extremos.
- Vetores gerados pseudoaleatoriamente.

São realizados **109 testes por algoritmo**, totalizando **327 verificações automatizadas**.

Os resultados são comparados com a ordenação de referência fornecida pelo Java, utilizando `Arrays.sort()` apenas para validação.

---

## 📝 Exemplo de Execução

Considere o vetor:

```text
[7, 2, 9, 4, 1, 6]
``
