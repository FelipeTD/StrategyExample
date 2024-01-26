# Projeto de exemplo para utilização de Strategy

## Strategy
- Faz parte do GoF
- Padrão de Projeto Comportamental

### Motivação do Pattern Strategy
- Quando precisa encapsular algoritmos similares para tomar alguma decisão
- A classe que usa o algoritmo não é alterada, mesmo com outras opções de algoritmos

### Conceitos básicos
- Context
- Strategy Interface
- Strategy Concreta

### Estrutura
- Contexto
  - Mantém uma referência para uma das estratégias concretas
  - Se comunica com esse objeto através da ‘interface’ da estratégia
- Estratégia (Interface)
  - É comum à todas as estratégias concretas
  - Ela declara um método que o contexto usa para executar uma estratégia
- Estratégias (Concretas)
  - Implementam diferentes variações de um algoritmo que o contexto usa
- Funcionamento
  - O contexto chama o método de execução no objeto (estratégia) ligado cada vez que ele precisa rodar um algoritmo.
  - O contexto não sabe qual estratégia ele trabalha ou como o algoritmo é executado.
- Cliente
  - Cria um objeto (estratégia) específico e passa ele para o contexto
  - O contexto expõe um ‘setter’ que permite o cliente mudar a estratégia associada com o contexto durante a execução

### Prós e Contras
- Prós
  - Não precisamos mais utilizar os `IFs` 
  - A solução ficou mais elegante
  - É mais simples de adicionar mais bancos
  - Pode trocar algoritmos usados dentro de um objeto durante a execução
  - Pode isolar os detalhes de implementação de um algoritmo do código que usa ele
  - Pode substituir a herança por composição
  - Princípio Aberto/Fechado. Pode introduzir novas estratégias sem mudar o contexto
- Contras
  - Se existe somente um par de algoritmos e eles raramente mudam, não há motivo para implementar o `Strategy`
  - Os clientes devem estar cientes das diferenças entre as estratégias para conseguirem selecionar a adequada
  - Linguagens modernas tem suporte funcional que permite que implemente diferente versões de um algoritmo dentro de um conjunto de funções anonimas
  - Poderia usar essas funções como se usasse (objetos) estratégia, mas sem inchar o seu código com classes e ‘interfaces’ adicionais

### Referências utilizadas:
- Design Pattern Strategy: Entendendo na Prática
  - https://www.youtube.com/watch?v=pxmqkzWPW6E&list=PL5aY_NrL1rjtP1GVk1lxifkeob1F09L4p&index=4
- Strategy - Refactoring Guru
  - https://refactoring.guru/pt-br/design-patterns/strategy
