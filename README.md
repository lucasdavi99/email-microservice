# Microserviço de Email com Java Spring Boot e AWS SES

## Descrição do Projeto

Este é um microserviço de email desenvolvido em Java usando o framework Spring Boot. O principal objetivo é facilitar o envio de emails de maneira eficiente e confiável, aproveitando os serviços da Amazon Simple Email Service (SES) da AWS.

## Funcionalidades Principais

- **Envio de Emails:** Utiliza a API do AWS SES para enviar emails de forma rápida e segura.
- **Template de Email:** Suporte para criação de templates de email personalizados.
- **Configuração Dinâmica:** Parâmetros de configuração como credenciais da AWS SES podem ser ajustados dinamicamente.

## Pré-requisitos

- Java 21
- Maven
- Conta na AWS com acesso ao serviço SES
- Credenciais da AWS configuradas localmente (pode ser feito através do AWS CLI ou definindo variáveis de ambiente)

## Configuração

1. Clone o repositório: `git clone https://github.com/lucasdavi99/email-microservice.git`
2. Configure as credenciais da AWS SES no arquivo `application.properties`.
3. Execute o projeto usando Maven: `mvn spring-boot:run`

## Uso

O microserviço expõe endpoints REST para enviar emails. Exemplos de uso:

```bash
curl -X POST http://localhost:8080/api/email'{
  "to": "exemplo@email.com",
  "subject": "Assunto do Email",
  "body": "Corpo do Email"
}'
