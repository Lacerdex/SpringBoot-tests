# SpringBoot-tests
Repositório dedicado a testes e experimentos com o framework Spring Boot utilizando Java no VS Code.

# 🎯 Objetivo
Espaço para praticar conceitos, testar funcionalidades e explorar recursos do Spring Boot em um ambiente controlado de aprendizado.

# 🛠️ Tecnologias
` 1. Java
  2. Spring Boot
  3. Maven/Gradle
  4. VS Code `

# 📁 Estrutura
Diferentes branches e pastas serão utilizadas para organizar os testes por conceitos:

` 1. APIs REST
  2. Spring Data JPA
  3. Segurança
  4. Validações
  5. Testes unitários `

# 🍃 Spring Boot Hello World API

Uma API REST minimalista construída com **Java 17** e **Spring Boot**, demonstrando a configuração básica de um endpoint Web.

---

## 📋 Sobre o Projeto

Este projeto é um ponto de partida para aplicações web em Java. Ele utiliza o framework Spring Boot para subir um servidor local que responde a requisições HTTP na rota raiz.

### Funcionalidades
* Configuração automática de servidor (Tomcat embutido).
* Endpoint REST que retorna uma mensagem de saudação.
* Estrutura baseada em Maven.

---

## 🚀 Como Rodar a Aplicação (Passo a Passo)

### 1. Pré-requisitos (Instalação do Java)

Para rodar este projeto via CLI (Linha de Comando), você precisa do **JDK 17** ou superior.

#### **No Linux (Distribuições .deb como Ubuntu/Mint)**
Abra o terminal e execute:

# Atualize a lista de pacotes
` sudo apt update `

# Instale o OpenJDK 17
` sudo apt install openjdk-17-jdk -y `

# Verifique se a instalação foi bem-sucedida
` java -version `

### 2. Incializando o Projeto

# **LINUX* 

# Dê permissão de execução ao Maven Wrapper
` chmod +x mvnw `

# Inicie a aplicação
` ./mvnw spring-boot:run `

### **WINDOWS*

# Inicie a aplicação usando o script de comando do Maven
` .\mvnw.cmd spring-boot:run `

📁 Estrutura de Arquivos Principal
` src/main/java/com/example/demo/DemoApplication.java: ` Classe principal com a lógica do controlador.

` pom.xml: ` Arquivo de configuração do Maven com as dependências do projeto

` mvnw / mvnw.cmd: ` Scripts para rodar o Maven sem precisar instalá-lo manualmente.
