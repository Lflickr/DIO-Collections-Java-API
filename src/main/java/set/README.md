# Set
- A interface Set é uma coleção que não pode conter elementos repetidos
- Representa o conceito matematico de conjunto
- Implementações de uso geral
    - **HashSet** armazena os elementos em tabela hash. Não mantem ordem específica de elementos. Oferece desempenho alto em busca, poi utiliza funções hash para indexar elementos. A ordem que os elementos são adicionados pode não ser preservada ao percorrer o conjunto
    - **TreeSet** armazena os elementos em uma estrutura de arvore binaria balanceada. Os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. Facilita a obtenção de elementos em uma determinada ordem, porem, a busca e inserção são mais lentas em relação ao HashSet
    - **LinkedHashSet** mantem a ordem de inserção dos elementos, utiliza uma tabelha hash para obter um bom desempenho de busca. Semelhante ao HashSet, porem mantem uma lista duplamente encadeada que preserva a ordem de inserção. Dessa maneira, os elementos podem ser percorridos na ordem em que foram adicionados. Ele pode ser util em situações em que é ncecessario manter a ordem de inserção e ter um bom desempenho de busca 
- Não permite acesso aleatorio a um elemento na coleção
- Para percorrer os elementos de um set, deve-se utilizar um iterador ou um loop foreach