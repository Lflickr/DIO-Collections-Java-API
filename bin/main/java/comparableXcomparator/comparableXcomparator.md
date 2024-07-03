# Comparable X Comparator

## Comparable
- Fornece uma unica sequencia de ordenação ou seja, ordena com base em um unico elemento (id, nome preço etc.)
- Altera a classe original
- Implementar na classe 
    - Ex: `public class Livro implements Comparable<Livro>{}`
- Fornece o metodo `compareTo()` para ordenar os elementos
- Ele esta contido no pacote `java.lang`
- Ordena os elementos da lista de tipo comparable utilizando o metodo `Collections.sort(list)`

## Comparator
- Fornece o metodo `compare()` para ordenara os elementos
- Fornece multiplas sequencias de ordenação, ou seja, pode ordenar a coleção com base em varios elementos ao mesmo tempo
- Não afeta a classe original
- Presente no pacote `java.util`
- Ordena os elementos da lista do tipo comparato utilizando o metodo `Collections.sort(List, Comparator)`

## Collections
- Classe utilitaria do Java para operações comuns de coleções
- Fornece metodos de busca, ordenação, manipulação e sincronização de coleções
