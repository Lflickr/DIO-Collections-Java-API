# Generics type
 - tipo de classe ou interface genérica
 - O exemplo de classe Box será modificado posteriormente para mostrar o conceito de tipo generico
 ```java
 public class Box{
    private Object objeto;

    public void setObjeto(Object objeto){
        this.objeto = objeto;
    }
    public Object getObjeto(){
        return objeto;
    }
 }
 ```
 - O simbolo `<>` é chamado de "diamond operator" é utilizado no contexto de tipos genericos para inferir o tipo com base no contexto de forma automatica
 - Dessa forma, introduzir uma variavel que pode ser de qualquer tipo e utilizada em qualquer lugar dentro da classe, chamaremos de variavel de tipo "T" ou parametro "T"

  ```java
  //agora esta é a versao generica da classe box
  //<T> representa o tipo do valor a ser armazenado
 public class Box<T>{
    private T t;

    public void set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
 }
 ```

 - Assim, todas as ocorrencias de Object foram substituidas pelo parametro "T"
 - A variavel de tipo T pode ser substituida por qualquer outro tipo não primitivo, ou seja, pode ser classes, interfaces, array ou outra variavel de tipo
 - A mesma ideia funciona para criar interfaces genericas
 - Nomes de parametros comuns:
    - E = Elemento (Muito utilizado pelo Java Collections Framework)
    - K = Chave
    - N = Numero
    - T = Tipo (tipo do objeto a ser trabalhado)
    - V = Valor
    - S, U, V, etc. = 2º, 3º, 4º tipos

## Vantagens de usar generics interfaces
1. Segurança do tipo de dado: Garante que apenas objetos de um tipo específico possam ser colocados na coleção, evitando erros de tipo e garantindo que esteja lidando com os dados corretos
2. Codigo mais legivel: Pode especificar o tipo de dado esperado ou o tipo retornado pela coleção, tornando-o mais facil de entender e ler
3. Detecta erros rapidamento: O compilador ja consegue verificar se esta utilizando o tipo certo antes de executar o programa
4. Reutilização de codigo: Usar classes e interfaces genericos que funcionam para diferentes tipos de coleção, evita duplicar codigo para cada tipo específico
5. Melhor desempenho: Evita a necessidade de conversões de tipos desnecessarias