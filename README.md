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

---

## 🧠 Arquitetura do Projeto

```bash
src/
├── model/
├── repository/
├── service/
├── controller/
```

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

## 🚀 Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

---

### 2️⃣ Configurar o banco de dados

```sql
CREATE DATABASE aluno_online;
```

---

### 3️⃣ Configurar o application.properties

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/aluno_online
spring.datasource.username=SEU_USUARIO
spring.datasource.password=SUA_SENHA

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

---

### 4️⃣ Executar o projeto

```bash
./mvnw spring-boot:run
```

---

## 🔄 Exemplos de Requisição (JSON)

### 📌 Criar Aluno
```json
{
  "nome": "Marcelo",
  "email": "marcelo@email.com",
  "cpf": "123.456.789-00"
}
```

---

### 📌 Atualizar Aluno
```json
{
  "nome": "Novo Nome",
  "email": "novo@email.com",
  "cpf": "00000000000"
}
```

---

### 📌 Criar Professor
```json
{
  "nome": "Professor João",
  "email": "joao@email.com",
  "cpf": "123.456.789-00"
}
```

---

### 📌 Atualizar Professor
```json
{
  "nome": "Novo Professor",
  "email": "novo@email.com",
  "cpf": "00000000000"
}
```

---

## 🧪 Testes com Insomnia

### 🔹 Criar Aluno
<img width="1920" height="1040" alt="criarAluno" src="https://github.com/user-attachments/assets/a0eaa9d8-035c-472a-9e7a-bde6bbe9e200" />


### 🔹 Listar Alunos
<img width="1920" height="1043" alt="listarTodosAlunos" src="https://github.com/user-attachments/assets/c3b36798-a21d-4618-abdc-3c05f739fbf9" />


### 🔹 Buscar Aluno por ID
<img width="1920" height="1042" alt="buscarAlunoPorId" src="https://github.com/user-attachments/assets/36b0cb06-bcfc-4c74-92be-e4e1c7c30daf" />


### 🔹 Atualizar Aluno
<img width="1920" height="1042" alt="atualizarAlunoPorId" src="https://github.com/user-attachments/assets/ec050ac8-cf08-4c66-a8bb-651866e74fbd" />


### 🔹 Deletar Aluno
<img width="1920" height="1042" alt="deletarAlunoPorId" src="https://github.com/user-attachments/assets/d81b7c68-30cb-4ff1-9ed1-8160c30a99b8" />


---

### 🔹 Criar Professor
<img width="1920" height="1043" alt="criarProfessor" src="https://github.com/user-attachments/assets/09d2a171-33d3-4697-87a6-0d9b48cf194a" />


### 🔹 Listar Professores
<img width="1920" height="1041" alt="listarTodosProfessores" src="https://github.com/user-attachments/assets/0188b941-7543-4d09-9bc8-7faf290932f4" />


### 🔹 Buscar Professor por ID
<img width="1920" height="1039" alt="buscarProfessorPorId" src="https://github.com/user-attachments/assets/0022fadd-c901-4e43-84c2-01752d921578" />


### 🔹 Atualizar Professor
<img width="1920" height="1040" alt="atualizarProfessorPorId" src="https://github.com/user-attachments/assets/149fa32b-ed0f-40a1-9751-03e5e1863a16" />


### 🔹 Deletar Professor
<img width="1920" height="1043" alt="deletarProfessorPorId" src="https://github.com/user-attachments/assets/9280aede-d421-45c4-935f-edea86bec4d9" />


---

## 🗄️ Banco de Dados

### 🔹 Tabela Aluno
<img width="1920" height="1042" alt="tabela-aluno" src="https://github.com/user-attachments/assets/33cf2d1e-16bc-4f08-83e7-59ae0beea7e0" />


### 🔹 Tabela Professor
<img width="1920" height="1041" alt="tabela-professor" src="https://github.com/user-attachments/assets/84a32ad8-9b21-4c2d-aa0b-075e388b29c9" />


---

## 📊 Diferenciais

- API REST completa  
- CRUD funcional  
- Integração com PostgreSQL  
- Testado com Insomnia  
- Estrutura organizada  

---

## 👨‍💻 Autor

**Marcelo Gomes da Silva Filho**

---

## 📌 Status

✅ Projeto finalizado
