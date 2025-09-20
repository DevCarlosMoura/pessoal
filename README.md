# API de Biblioteca Pessoal

![Badge de Status](https://img.shields.io/badge/status-conclu%C3%ADdo-brightgreen)

## 📝 Descrição do Projeto

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot para gerenciar uma biblioteca pessoal. A API permite realizar operações CRUD (Create, Read, Update, Delete) completas para as entidades `Autor` e `Livro`. Este foi um projeto de estudo focado em construir uma base sólida de desenvolvimento back-end, seguindo as melhores práticas do mercado para criação de APIs.

## ✨ Funcionalidades

- **CRUD de Autores:**
  - `POST /autores`: Cadastra um novo autor.
  - `GET /autores`: Lista todos os autores cadastrados.
  - `GET /autores/{id}`: Busca um autor específico pelo seu ID.
  - `PUT /autores/{id}`: Atualiza os dados de um autor existente.
  - `DELETE /autores/{id}`: Remove um autor do sistema.
- **CRUD de Livros:** *(Funcionalidade a ser implementada)*
- **Tratamento de Erros:** Retorna códigos de status HTTP apropriados (ex: 404 Not Found).

## 🚀 Tecnologias Utilizadas

Este projeto foi construído utilizando as seguintes tecnologias:

- **Java 17:** Versão da linguagem Java.
- **Spring Boot 3:** Framework principal para criação da aplicação.
- **Spring Data JPA:** Camada de persistência de dados.
- **Hibernate:** Implementação da JPA para mapeamento objeto-relacional.
- **Maven:** Gerenciador de dependências e build do projeto.
- **H2 Database:** Banco de dados em memória para ambiente de desenvolvimento.
- **Lombok:** Biblioteca para reduzir código boilerplate (getters, setters, etc.).

## 💿 Como Executar o Projeto

Siga os passos abaixo para executar a API localmente.

**Pré-requisitos:**
- Java JDK 17 ou superior.
- Maven 3.6 ou superior.

```bash
# 1. Clone o repositório
$ git clone <COLE AQUI A URL DO SEU REPOSITÓRIO GITHUB>

# 2. Navegue até o diretório do projeto
$ cd pessoal

# 3. Execute a aplicação com o Maven
$ ./mvnw spring-boot:run
```

Após a execução, a API estará disponível em `http://localhost:8080`.

## Endpoints da API

Abaixo estão os detalhes dos endpoints disponíveis para a entidade `Autor`.

| Método HTTP | Rota              | Descrição                      | Exemplo de Body (JSON)              |
|-------------|-------------------|--------------------------------|-------------------------------------|
| `POST`      | `/autores`        | Cadastra um novo autor.        | `{ "nome": "Machado de Assis" }`    |
| `GET`       | `/autores`        | Lista todos os autores.        | N/A                                 |
| `GET`       | `/autores/{id}`   | Busca um autor por ID.         | N/A                                 |
| `PUT`       | `/autores/{id}`   | Atualiza um autor existente.   | `{ "nome": "M. de Assis" }`         |
| `DELETE`    | `/autores/{id}`   | Deleta um autor por ID.        | N/A                                 |

---
_Desenvolvido por [Carlos Moura](<https://github.com/DevCarlosMoura>)_