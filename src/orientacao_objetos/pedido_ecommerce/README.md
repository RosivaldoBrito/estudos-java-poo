#  Sistema de Pedidos (E-commerce Domain)

##  Sobre o Projeto
Este projeto é uma simulação de um sistema de E-commerce para consolidação de conceitos avançados de Programação Orientada a Objetos (POO). O objetivo principal foi traduzir um Diagrama de Classes UML para código Java, respeitando as cardinalidades e as regras de negócio.

##  Conceitos Aplicados
- **Modelagem de Domínio:** Tradução de entidades do mundo real (Cliente, Produto, Pedido e Itens do Pedido) para classes Java.
- **Composição de Objetos:** Implementação de relações "tem-um" (1:1) e "tem-vários" (1:N) utilizando `List` (ArrayList).
- **Enumerações (Enum):** Controle rigoroso do estado do pedido utilizando a classe `OrderStatus` (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED).
- **Java Time API:** Substituição da biblioteca legada (`java.util.Date`) pelo padrão moderno do Java 8+ (`LocalDate` para data de nascimento e `LocalDateTime` para o instante exato do pedido).
- **Delegação de Lógica:** Os cálculos de subtotal e total não foram feitos na classe principal (`Program`), mas sim delegados para os seus respectivos métodos de domínio (`total()` e `subTotal()`), garantindo o encapsulamento perfeito.