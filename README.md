# Projeto Web Services com Spring Boot e JPA / Hibernate

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/seu-usuario/seu-repositorio/blob/main/LICENSE)

# Sobre o Projeto

O Projeto Web Services com Spring Boot e JPA / Hibernate é uma aplicação desenvolvida como parte do curso [DevSuperior](https://devsuperior.com "Site da DevSuperior"). Tem como objetivo demonstrar a implementação de um conjunto de funcionalidades utilizando Spring Boot, JPA / Hibernate e Maven. Este projeto inclui operações CRUD (Create, Retrieve, Update, Delete) para entidades como Usuário, Order, OrderItem, Payment, Product e Category. Além disso, possui tratamento de exceções para lidar com possíveis erros durante as chamadas de API.

## Funcionalidades

- Criar projeto Spring Boot Java
- Implementar modelo de domínio
- Estruturar camadas lógicas: resource, service, repository
- Configurar banco de dados de teste (H2)
- Povoar o banco de dados
- CRUD - Create, Retrieve, Update, Delete
- Tratamento de exceções

## Modelos de Domínio

Para adicionar as fotos do modelo de domínio e instância, siga estas instruções:

### Modelo de Domínio

![Modelo de Domínio](caminho/para/modelo-de-dominio.png)

### Instância de Domínio

![Instância de Domínio](caminho/para/instancia-de-dominio.png)

# Tecnologias Utilizadas

- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2 Database

# Como Executar o Projeto

## Pré-requisitos

- Java
- Maven

## Executando o Projeto

```bash
# clonar repositório
git clone https://github.com/seu-usuario/seu-repositorio

# entrar na pasta do projeto
cd seu-repositorio

# executar o projeto
mvn spring-boot:run
