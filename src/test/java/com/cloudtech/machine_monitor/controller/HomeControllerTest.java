
package com.cloudtech.machine_monitor.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class HomeControllerTest {

    private final HomeController controller = new HomeController();

    @Test
    void testarPaginaInicial() {
        Map<String, String> resposta = controller.home();

        assertEquals(
            "Bem-vindo ao sistema de monitoramento de máquinas da CloudTech Solutions",
            resposta.get("mensagem")
        );
    }

    @Test
    void testarStatus() {
        Map<String, String> resposta = controller.status();

        assertEquals("online", resposta.get("status"));
        assertEquals(
            "Aplicação de monitoramento em execução",
            resposta.get("mensagem")
        );
    }

    @Test
    void testarVersao() {
        Map<String, String> resposta = controller.versao();

        assertEquals("1.0.0", resposta.get("versao"));
        assertEquals("Machine Monitor", resposta.get("aplicacao"));
    }
}
