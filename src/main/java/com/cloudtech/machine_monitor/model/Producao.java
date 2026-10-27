package com.cloudtech.machine_monitor.model;

public class Producao {

    private Long id;
    private Long maquinaId;
    private double consumoKw;
    private String horarioAcionamento;
    private int pecasProduzidas;

    public Producao() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMaquinaId() {
        return maquinaId;
    }

    public void setMaquinaId(Long maquinaId) {
        this.maquinaId = maquinaId;
    }

    public double getConsumoKw() {
        return consumoKw;
    }

    public void setConsumoKw(double consumoKw) {
        this.consumoKw = consumoKw;
    }

    public String getHorarioAcionamento() {
        return horarioAcionamento;
    }

    public void setHorarioAcionamento(String horarioAcionamento) {
        this.horarioAcionamento = horarioAcionamento;
    }

    public int getPecasProduzidas() {
        return pecasProduzidas;
    }

    public void setPecasProduzidas(int pecasProduzidas) {
        this.pecasProduzidas = pecasProduzidas;
    }
}
