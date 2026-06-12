#  Sistema de Etiquetas de Produtos (Polimorfismo e Herança)

##  Sobre o Projeto
Este projeto é uma aplicação prática de **Programação Orientada a Objetos (POO)** desenvolvida em Java. O objetivo principal do sistema é ler dados de diferentes tipos de produtos (Comuns, Importados e Usados) e gerar as etiquetas de preço customizadas para cada um deles, aproveitando o poder do **Polimorfismo**.

##  Conceitos e Tecnologias Aplicadas

Durante o desenvolvimento deste sistema, foram aplicados conceitos fundamentais e avançados de Engenharia de Software:

- **Herança (`extends`):** Criação de classes especializadas (`ImportedProduct` e `UsedProduct`) que herdam características da classe mãe (`Product`).
- **Polimorfismo:** Utilização de uma única lista genérica `List<Product>` (Upcasting) para armazenar diferentes tipos de objetos, permitindo que o Java decida em tempo de execução qual comportamento chamar.
- **Sobrescrita de Métodos (`@Override`):** Customização do método `priceTag()` nas classes filhas para atender a regras de negócio específicas sem quebrar o contrato da classe mãe.
- **Reuso de Código (`super`):** Utilização do construtor da superclasse para evitar repetição de atribuições.
- **Java Time API:** Manipulação de datas utilizando `LocalDate` e formatação segura para o usuário via `DateTimeFormatter`.

##  Estrutura de Classes

* `Product`: Entidade base contendo os atributos genéricos `name` e `price`, além do método padrão de geração de etiqueta.
* `ImportedProduct`: Especialização que adiciona a regra de negócio de taxa de alfândega (`customsFee`) e calcula o preço total.
* `UsedProduct`: Especialização que adiciona a data de fabricação (`manufactureDate`) convertida e formatada corretamente.
* `Program`: Classe principal responsável pela interação com o usuário via `Scanner` e execução do laço de leitura.

##  Exemplo de Saída no Console

```text
Enter the number of products: 3
Product #1 data:
Common, used or imported (c/u/i)? c
Name: Tablet
Price: 260.00
Product #2 data:
Common, used or imported (c/u/i)? u
Name: Iphone
Price: 400.00
Manufacture date (DD/MM/YYYY): 15/03/2017
Product #3 data:
Common, used or imported (c/u/i)? i
Name: Notebook
Price: 1100.00
Customs fee: 20.00

PRICE TAGS:
Tablet $ 260.00
Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)
Notebook $ 1120.00 (Customs fee: $ 20.00)