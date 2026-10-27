package com.cloudtech.machine_monitor.controller;

import com.cloudtech.machine_monitor.model.Maquina;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/maquinas")

public class MaquinaController {
    private final List<Maquina> maquinas = new ArrayList<>();
    private final AtomicLong proximoId = new AtomicLong(1);

    @GetMapping
    public List<Maquina> listarMaquinas() {
        return maquinas;
    }

    @PostMapping("/cadastro")
    public Maquina cadastrarMaquina(@RequestBody Maquina maquina) {

        maquina.setId(proximoId.getAndIncrement());

        maquinas.add(maquina);

        return maquina;
    }
}
