# 🎓 API - Sistema Acadêmico (Aluno Online)

<p align="center">
  <img src="https://img.shields.io/badge/Java-21-blue?style=for-the-badge&logo=java">
  <img src="https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?style=for-the-badge&logo=springboot">
  <img src="https://img.shields.io/badge/PostgreSQL-Database-blue?style=for-the-badge&logo=postgresql">
  <img src="https://img.shields.io/badge/Status-Concluído-success?style=for-the-badge">
</p>

---

## 📌 Sobre o Projeto
Esta API REST foi desenvolvida com Spring Boot com o objetivo de gerenciar dados acadêmicos, permitindo operações completas de CRUD (Create, Read, Update, Delete) para alunos e professores.

O projeto segue boas práticas como separação em camadas, organização modular e integração com banco de dados relacional.

---

## 🧠 Arquitetura do Projeto

```bash
src/
├── model/
├── repository/
├── service/
├── controller/
```

- **Model** → Representa as entidades (Aluno e Professor)  
- **Repository** → Comunicação com o banco (JPA)  
- **Service** → Regras de negócio  
- **Controller** → Endpoints da API  

---

## ⚙️ Tecnologias Utilizadas

- Java 21  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- PostgreSQL  
- DBeaver  
- Insomnia  

---

## 🔄 Endpoints da API

### 📌 Aluno

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | /alunos | Criar aluno |
| GET | /alunos | Listar alunos |
| GET | /alunos/{id} | Buscar por ID |
| PUT | /alunos/{id} | Atualizar |
| DELETE | /alunos/{id} | Deletar |

### 📌 Professor

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| POST | /professores | Criar professor |
| GET | /professores | Listar professores |
| GET | /professores/{id} | Buscar por ID |
| PUT | /professores/{id} | Atualizar |
| DELETE | /professores/{id} | Deletar |

---

## 🧪 Exemplo de Requisição

### 🔹 Criar Aluno
```json
{
  "nome": "Marcelo",
  "email": "marcelo@email.com",
  "cpf": "123.456.789-00"
}
```

---

## 🧪 Testes com Insomnia

### 🔹 Criar Aluno
<img width="1920" height="1039" alt="criarAluno" src="https://github.com/user-attachments/assets/fa8dc9bc-192c-45f4-8336-5242ed931ff0" />


### 🔹 Listar Alunos
<img width="1920" height="1036" alt="listarTodosAlunos" src="https://github.com/user-attachments/assets/2eec3513-1a00-4973-8541-540ae0abbb60" />


### 🔹 Buscar Aluno por ID
<img width="1919" height="1040" alt="buscarAlunoPorId" src="https://github.com/user-attachments/assets/7e6deaee-4189-43fe-bd2d-dae07daa5180" />


### 🔹 Atualizar Aluno
<img width="1920" height="1042" alt="atualizarAlunoPorId" src="https://github.com/user-attachments/assets/4db9ac4e-4a50-49aa-b703-46d6ece0d395" />


### 🔹 Deletar Aluno
<img width="1918" height="1040" alt="deletarAlunoPorId" src="https://github.com/user-attachments/assets/7d3401f9-8e46-47b4-b8dc-086a7bf77a98" />


### 🔹 Criar Professor
<img width="1919" height="1036" alt="criarProfessor" src="https://github.com/user-attachments/assets/a6158e14-0462-40a2-9007-81b45574f137" />


---

## 🗄️ Banco de Dados (DBeaver)

### 🔹 Tabela Aluno
<img width="1920" height="1039" alt="tabela-aluno" src="https://github.com/user-attachments/assets/126794a2-e229-4d9a-ba81-5bcbd2e1f349" />


### 🔹 Tabela Professor
<img width="1920" height="1043" alt="tabela-professor" src="https://github.com/user-attachments/assets/037f2921-34c8-45bd-8b65-259c84f5fd86" />


---

## 📊 Diferenciais do Projeto

- API REST completa (CRUD)  
- Estrutura em camadas bem definida  
- Integração com banco PostgreSQL  
- Testes realizados com Insomnia  
- Persistência de dados real  

---

## 👨‍💻 Autor

**Marcelo Gomes da Silva Filho**

---

## 📌 Status

✅ Projeto finalizado e funcional
