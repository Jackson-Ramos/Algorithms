# Busca Binária

## Descrição

A busca binária é um algoritmo eficiente utilizado para encontrar um elemento em uma lista ordenada.
Ela segue o princípio de "dividir para conquistar", onde a lista é repetidamente dividida ao meio,
e a cada etapa, metade dos elementos é descartada, diminuindo progressivamente o número de 
elementos a serem comparados.

## Funcionamento
A busca binária segue os seguintes passos:

Comece com dois ponteiros, um no início e outro no fim da lista.
Calcule o elemento no meio da lista.
Compare o valor do meio com o valor desejado:
Se forem iguais, o valor foi encontrado.
Se o valor procurado for menor, repita a busca na metade esquerda da lista.
Se o valor procurado for maior, repita a busca na metade direita da lista.
Repita o processo até que o valor seja encontrado ou o intervalo de busca se esgote.
Pré-requisito
A lista deve estar ordenada para que a busca binária funcione corretamente.

## Complexidade
Tempo: O algoritmo tem uma complexidade de tempo de 𝑂(log ⁡ 𝑛)O(logn), onde 𝑛 é o número de
elementos na lista.
Espaço:𝑂(1)O(1) se for implementado de forma iterativa, e 𝑂(log⁡ 𝑛)O(logn) se for implementado
de forma recursiva (devido à pilha de chamadas).

## Exemplo de Implementação em Java

Aqui está uma implementação da busca binária usando uma função genérica em Java:

```java
public class BinarySearch {

    public <T extends Comparable<T>> int binarySearch(T[] array, T value) {
        int head = 0;
        int tail = array.length - 1;

        while (head <= tail) {

            int middle = (head + tail) / 2;
            T middleValue = array[middle];

            if (value.compareTo(middleValue) == 0) {
                return middle;
            } else if (middleValue.compareTo(value) > 0) {
                tail = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        return -1;
    }
}
```

## Explicação
- O método buscaBinaria recebe um array ordenado de qualquer tipo que 
implemente a interface Comparable, permitindo que ele compare elementos.
- O algoritmo percorre o array até encontrar o elemento desejado ou até que o intervalo de busca se torne inválido.
Exemplo de uso com Integer e String.

## Testes
O código inclui exemplos de teste que verificam o funcionamento da busca binária com diferentes tipos de dados (Integer e String). Para testar com outros tipos ou valores, basta modificar os arrays no método main.
## Referências

* CORMEN, Thomas H. et al. Entendendo Algoritmos: Um Guia Prático para Programadores e Estudantes. 3. ed. Rio de Janeiro: Elsevier, 2011.