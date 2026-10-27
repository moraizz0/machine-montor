package com.cloudtech.machine_monitor.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of(
            "mensagem", "Bem-vindo ao sistema de monitoramento de máquinas da CloudTech Solutions"
        );
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
            "status", "online",
            "mensagem", "Aplicação de monitoramento em execução"
        );
    }

    @GetMapping("/versao")
    public Map<String, String> versao() {
        return Map.of(
            "versao", "1.0.0",
            "aplicacao", "Machine Monitor"
        );
    }
}

