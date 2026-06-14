#  Validação de Conta Bancária (Tratamento de Exceções)

##  Sobre o Projeto
Este projeto foca na aplicação de **Programação Defensiva** e no tratamento correto de erros no Java. O objetivo foi criar um sistema de saque bancário que valide as regras de negócio (limite de saque e saldo disponível) sem permitir que o programa seja encerrado de forma abrupta por erros não tratados.

##  Conceitos Aplicados
- **Exceções Personalizadas:** Criação da classe `DomainException` herdando de `RuntimeException` para lançar erros específicos do domínio do negócio.
- **Delegação de Validação (Fail-Fast):** O método `withdraw` (saque) na classe `Account` é o único responsável por validar as regras e lançar (`throw`) a exceção ANTES de alterar o saldo, protegendo a integridade do objeto.
- **Estrutura Try-Catch:** Captura da exceção personalizada na classe principal (`Program`) para exibir mensagens de erro amigáveis ao usuário, garantindo a resiliência do software.
- **Clean Code e Encapsulamento:** Separação clara entre a lógica de negócio (Entidade), que lança o erro, e a interface do usuário (Console), que captura e exibe o erro.