
# Machine Monitor

Sistema de Monitoramento de Máquinas Industriais

## Descrição

Aplicação backend desenvolvida em Java com Spring Boot
para a empresa fictícia CloudTech Solutions.

O sistema permite cadastrar máquinas industriais,
registrar dados de produção e consumo de energia
e consultar o histórico das operações.

## Tecnologias

- Java 25
- Spring Boot 4.1.2
- Maven
- JUnit 5
- Thunder Client
- Git e GitHub

## Funcionalidades

- Cadastro de máquinas industriais
- Listagem de máquinas cadastradas
- Registro de dados de produção
- Consulta do histórico de produção
- Verificação do status da aplicação
- Consulta da versão do sistema

## Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | / | Página inicial |
| GET | /status | Status da aplicação |
| GET | /versao | Versão do sistema |
| GET | /maquinas | Listar máquinas |
| POST | /maquinas/cadastro | Cadastrar máquina |
| GET | /producao | Consultar produção |
| POST | /producao | Registrar produção |

## Como executar

Requisitos:
- JDK 25
- Maven

Na pasta do projeto, execute:

```bash
mvn spring-boot:run
```

A aplicação estará disponível em:

http://localhost:8080

## Testes

Para executar os testes automatizados:

```bash
mvn clean test
```

Resultado da última execução:

8 testes executados, 0 falhas e 0 erros.

## Observações

Os dados são armazenados temporariamente em memória.
Ao reiniciar a aplicação, os registros são perdidos.

## Projeto acadêmico

Disciplina: Desenvolvimento Backend
Aula 11 — Exercício 1
