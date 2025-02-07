# API de Gerenciamento de Produtos

Esta API permite o cadastro, consulta, atualização e remoção de produtos utilizando Spring Boot.

## Tecnologias Utilizadas
- Java 17
- Spring Boot
- Spring Data JPA
- HATEOAS
- Banco de Dados MySql

## Base URL
`http://localhost:8080/produtos`

## Endpoints Disponíveis

### 1. Criar Produto
**Método:** `POST`  
**URL:** `/produtos`  
**Body (JSON):**
```json
{
  "nome": "Produto Exemplo",
  "preco": 99.90
}
```
**Resposta:** `201 Created`

---

### 2. Listar Todos os Produtos
**Método:** `GET`  
**URL:** `/produtos`  
**Resposta:** `200 OK`

---

### 3. Buscar Produto por ID
**Método:** `GET`  
**URL:** `/produtos/{id}`  
**Resposta:** `200 OK`

---

### 4. Atualizar Produto
**Método:** `PUT`  
**URL:** `/produtos/{id}`  
**Body (JSON):**
```json
{
  "nome": "Produto Atualizado",
  "preco": 109.90
}
```
**Resposta:** `200 OK`

---

### 5. Remover Produto
**Método:** `DELETE`  
**URL:** `/produtos/{id}`  
**Resposta:** `200 OK`

---

## Como Executar o Projeto
1. Clone este repositório:  
   ```sh
   git clone https://github.com/salomaotech/api-cadastro-produto-springboot.git
   ```
2. Navegue até a pasta do projeto:  
   ```sh
   cd api-cadastro-produto-springboot
   ```
3. Execute o projeto com Maven ou sua IDE preferida:  
   ```sh
   mvn spring-boot:run
   ```
4. Acesse a API no navegador ou Postman:  
   `http://localhost:8080/produtos`

---

## Autor
Desenvolvido por **Salomão Silva**

## Contato
**salomao@taimber.com**

## E-book Aprenda lógica de programação
**lp.taimber.com**
