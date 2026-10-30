# Lab Padrões de Projeto com Spring Boot

Projeto desenvolvido como parte do desafio de fortalecimento de portfólio, focado na aplicação prática de Design Patterns em uma arquitetura de API REST com Spring Boot.

## Evolução e Melhorias Implementadas

Além da estrutura original com os padrões **Singleton**, **Strategy** e **Facade**, o projeto foi expandido na camada de domínio:

* **Padrão Builder (`ClienteBuilder`)**: Implementado para encapsular a construção da entidade `Cliente`, promovendo imutabilidade, fluidez e legibilidade no código. A integração foi validada via `CommandLineRunner` no arranque do ecossistema Spring.

## Tecnologias e Ferramentas

* **Java 21**
* **Spring Boot 2.5.4**
* **Spring Data JPA**
* **OpenFeign**
* **H2 Database**

## Instruções de Execução

1. Abra a pasta `lab-padroes-projeto-spring` no VS Code.
2. Certifique-se de que o **Extension Pack for Java** está ativo.
3. Navegue até o ficheiro `src/main/java/one/digitalinnovation/gof/Application.java`.
4. Clique no comando **Run** exibido sobre o método `main`.
5. A aplicação iniciará na porta `8080`, executando a rotina do `ClienteBuilder`.