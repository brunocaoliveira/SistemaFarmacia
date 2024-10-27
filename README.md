
# Sistema para Farmácia

API de Farmácia, uma solução eficiente e fácil de usar para o gerenciamento de produtos farmacêuticos. Esta API permite o cadastro e a consulta de produtos, proporcionando uma maneira prática de manter um controle preciso sobre o estoque e os preços.


## Documentação da API

#### Retorna todos os itens

```http
  GET /api/items
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `api_key` | `string` | **Obrigatório**. A chave da sua API |

#### Retorna um item

```http
  GET /api/items/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### Incluindo as demais funções como

Criar novo Item 
POST /api/items 

Atualizar Item Existente

PUT /api/items/{id}

Deletar Item existente

DELETE /api/items/{id}










## Autores

- [Bruno Oliveira](https://www.github.com/brunocaoliveira)


## 🔗 Links

[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/brunocaoliveira/)



## Funcionalidades




1. **Cadastro de Produtos**:
   
    Permite adicionar novos produtos ao sistema com informações como nome, descrição, quantidade e preço.

2. **Listagem de Produtos**:
    
    Possibilita listar todos os produtos cadastrados na farmácia, com a opção de paginar ou filtrar resultados.

3. **Consulta de Produtos**:
   
    Permite buscar informações específicas de um produto pelo seu ID ou nome, retornando detalhes como descrição, quantidade disponível e preço.

4. **Atualização de Produtos**:
   
    Oferece a capacidade de atualizar as informações de produtos existentes, permitindo modificar atributos como quantidade e preço.

5. **Exclusão de Produtos**:
   
    Permite remover produtos do sistema pelo ID, garantindo que o estoque esteja sempre atualizado e que itens desnecessários sejam excluídos.

6. **Validação de Dados**:
    
    Implementa validações para garantir que os dados inseridos nos cadastros atendam a critérios específicos, como formato correto de preço e quantidade positiva.

7. **Autenticação e Autorização**:

    (Opcional) Pode ser implementado um sistema básico de autenticação para proteger os endpoints que realizam operações sensíveis.


9. **Tratamento de Erros**:

    Fornece mensagens de erro claras e significativas para diferentes cenários, como produtos não encontrados ou dados inválidos.




## Stack utilizada

**Back-end:** Stacks e Tecnologias Utilizadas


Java: Linguagem de programação utilizada para desenvolver a lógica de negócios da aplicação.

MySQL: Sistema de gerenciamento de banco de dados relacional utilizado para armazenar informações sobre os produtos da farmácia.

Spring Boot: Framework que facilita o desenvolvimento de aplicações web e APIs, proporcionando uma configuração simplificada e uma arquitetura robusta.

JPA (Java Persistence API): Interface que permite mapear objetos Java para tabelas de banco de dados, facilitando a manipulação de dados.

Postman: Ferramenta utilizada para testar e documentar a API, facilitando o desenvolvimento e a depuração.

Swagger: Ferramenta que ajuda na documentação da API, permitindo visualizar e interagir com os endpoints de forma intuitiva.

