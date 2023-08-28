# Padrão de Design Flyweight

O padrão de design Flyweight é um padrão de design estrutural que visa otimizar o uso de memória, compartilhando eficientemente dados que são comuns entre objetos. Ele é especialmente útil quando se lida com um grande número de objetos semelhantes e a economia de memória é uma preocupação.

## Introdução

Ao desenvolver aplicativos, muitas vezes nos deparamos com situações em que múltiplos objetos possuem características idênticas ou semelhantes. Em vez de alocar uma grande quantidade de memória para cada objeto, o padrão Flyweight propõe dividir os atributos em duas categorias:

    Estado Intrínseco: Os atributos que são compartilhados entre vários objetos. Eles geralmente não mudam, ou mudam muito raramente.

    Estado Extrínseco: Os atributos específicos de cada objeto que não podem ser compartilhados.

O padrão Flyweight permite que múltiplos objetos compartilhem o mesmo estado intrínseco, reduzindo assim o consumo de memória.

## Implementação

A implementação do padrão Flyweight envolve a criação de uma fábrica de objetos que gerencia a criação e compartilhamento dos objetos flyweight.

## Conclusão

O padrão de design Flyweight é uma abordagem poderosa para economizar memória quando trabalhamos com uma grande quantidade de objetos semelhantes. Neste exemplo, vimos como implementar o padrão Flyweight usando uma fábrica de objetos para compartilhar o estado intrínseco entre objetos similares, resultando em uma redução significativa no consumo de memória.