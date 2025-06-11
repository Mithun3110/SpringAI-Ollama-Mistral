package com.omini.ai.spring_ai_deepseek_ollama;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ollama")
public class OllamaController {

    private final ChatClient chatClient;

    public OllamaController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @PostMapping("/ask")
    public String ask(@RequestBody String prompt) {
        System.out.println("PROMPT: " + prompt);

        String response = chatClient.prompt()
                .user(prompt)
                .call()
                .content();

        System.out.println("RESPONSE: " + response);
        return response;
    }
}
