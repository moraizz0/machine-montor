
package com.cloudtech.machine_monitor.controller;

import com.cloudtech.machine_monitor.model.Producao;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ProducaoControllerTest {

    @Test
    void testarRegistroProducao() {

        ProducaoController controller = new ProducaoController();

        Producao producao = new Producao();
        producao.setMaquinaId(1L);
        producao.setConsumoKw(12.5);
        producao.setHorarioAcionamento("08:30");
        producao.setPecasProduzidas(150);

        Producao resultado = controller.registrarProducao(producao);

        assertEquals(1L, resultado.getId());
        assertEquals(1L, resultado.getMaquinaId());
        assertEquals(12.5, resultado.getConsumoKw());
        assertEquals("08:30", resultado.getHorarioAcionamento());
        assertEquals(150, resultado.getPecasProduzidas());
    }

    @Test
    void testarConsultaProducao() {

        ProducaoController controller = new ProducaoController();

        Producao producao = new Producao();
        producao.setMaquinaId(1L);
        producao.setConsumoKw(15.0);
        producao.setHorarioAcionamento("09:00");
        producao.setPecasProduzidas(200);

        controller.registrarProducao(producao);

        List<Producao> producoes = controller.listarProducoes();

        assertEquals(1, producoes.size());
        assertEquals(200, producoes.get(0).getPecasProduzidas());
        assertEquals(15.0, producoes.get(0).getConsumoKw());
    }
}
