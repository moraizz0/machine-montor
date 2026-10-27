package com.cloudtech.machine_monitor.controller;

import com.cloudtech.machine_monitor.model.Producao;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/producao")
public class ProducaoController {

    private final List<Producao> producoes = new ArrayList<>();
    private final AtomicLong proximoId = new AtomicLong(1);

    @GetMapping
    public List<Producao> listarProducoes() {
        return producoes;
    }

    @PostMapping
    public Producao registrarProducao(@RequestBody Producao producao) {

        producao.setId(proximoId.getAndIncrement());

        producoes.add(producao);

        return producao;
    }
}
