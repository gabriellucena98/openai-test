# League of Legends Coach using OpenAI

Este projeto utiliza a API da OpenAI para criar um coach de League of Legends (LoL). O coach é capaz de responder perguntas e fornecer conselhos sobre campeões, estratégias e muito mais.

## Pré-requisitos

- Java 11 ou superior
- Kotlin
- Spring Boot
- Gradle ou Maven
- Conta na OpenAI com uma chave de API válida

## Configuração

1. Clone o repositório para o seu ambiente local:

    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    cd seu-repositorio
    ```

2. Adicione sua chave de API da OpenAI no arquivo `application.yml`:

    ```yaml
    openAI:
      key: SUA_CHAVE_API_AQUI
    ```

3. Construa e execute o projeto usando Gradle ou Maven:

    ```bash
    ./gradlew build
    ./gradlew bootRun
    ```

    ou

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

## Endpoints

### Chat Completion

Endpoint para obter conselhos do coach de LoL.

- **URL**: `/api/openai/v1/test`
- **Método**: `POST`
- **Consome**: `application/json`
- **Produz**: `application/json`

#### Request

O corpo da requisição deve seguir o formato abaixo:

```json
{
  "textRequest": "Seu texto aqui"
}

Response
O corpo da resposta será semelhante ao JSON abaixo:

{
    "id": "chatcmpl-9fwMH3iyIK4ndPArwQbsfJScnZIfh",
    "object": "chat.completion",
    "created": 1719782805,
    "model": "gpt-3.5-turbo-1106",
    "choices": [
        {
            "index": 0,
            "message": {
                "role": "assistant",
                "content": "Os top 5 counters de Teemo no top são..."
            },
            "logprobs": null,
            "finish_reason": "stop"
        }
    ],
    "usage": {
        "prompt_tokens": 33,
        "completion_tokens": 257,
        "total_tokens": 290
    },
    "system_fingerprint": "fp_44132a4de3"
}

Exemplo de Uso
Um exemplo de como enviar uma solicitação para o endpoint usando curl:
curl -X POST http://localhost:8080/api/openai/v1/test \
    -H "Content-Type: application/json" \
    -d '{
          "textRequest": "Como posso jogar melhor com Teemo no top?"
        }'
