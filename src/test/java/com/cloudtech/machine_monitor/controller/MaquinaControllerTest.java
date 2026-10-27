
package com.cloudtech.machine_monitor.controller;

import com.cloudtech.machine_monitor.model.Maquina;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MaquinaControllerTest {

    @Test
    void testarCadastroMaquina() {

        MaquinaController controller = new MaquinaController();

        Maquina maquina = new Maquina();
        maquina.setNome("Máquina CNC 01");
        maquina.setTipo("CNC");
        maquina.setSetor("Usinagem");
        maquina.setStatus("em operação");

        Maquina resultado = controller.cadastrarMaquina(maquina);

        assertEquals(1L, resultado.getId());
        assertEquals("Máquina CNC 01", resultado.getNome());
        assertEquals("CNC", resultado.getTipo());
        assertEquals("Usinagem", resultado.getSetor());
        assertEquals("em operação", resultado.getStatus());
    }

    @Test
    void testarListagemMaquinas() {

        MaquinaController controller = new MaquinaController();

        Maquina maquina = new Maquina();
        maquina.setNome("Máquina CNC 02");
        maquina.setTipo("CNC");
        maquina.setSetor("Produção");
        maquina.setStatus("parada");

        controller.cadastrarMaquina(maquina);

        List<Maquina> maquinas = controller.listarMaquinas();

        assertEquals(1, maquinas.size());
        assertEquals("Máquina CNC 02", maquinas.get(0).getNome());
    }
}
