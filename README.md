# Spring AI Chatbot using Ollama (Mistral) + Java + Spring Boot

- REST API to send user prompts and receive local LLM responses
- Powered by Ollama’s locally hosted **Mistral** model
- No API key required – works fully offline
- Built entirely with Spring Initializr

---

## Technologies Used

- **Java** – Primary language
- **Spring Boot** – Web framework
- **Spring Web** – REST Controller
- **Spring AI** – AI abstraction for LLMs
- **Ollama** – Local LLM server (Mistral model)

---

## Setup Instructions

### Install Ollama

- Visit: [https://ollama.com/download](https://ollama.com/download)
- Download and install the macOS `.dmg`
- Move `Ollama.app` to your **Applications** folder
- Launch it once using:

```bash
open -a "Ollama"
ollama pull mistral
ollama run mistral
```

### Generate Spring Boot Project

Use Spring Initializr with:


- Project: Maven
- Language: Java
- Spring Boot: 3.5.0
- Group: com.omini.ai
- Artifact: spring-ai-deepseek-ollama
- Java Version: 21
- Dependencies:
    - Spring Web
    - Spring Boot DevTools
    - Spring AI: Ollama


### How It Works

- The Spring Boot app exposes a REST API at /api/ollama/ask
- A prompt is sent in plain text using a POST request
- Spring AI forwards the prompt to Ollama, running the Mistral model locally
- The model generates a response and returns it to the client
- Tested using Postman or curl

