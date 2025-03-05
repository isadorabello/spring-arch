package io.github.isadorabello.arquiteturaspring.isp;

public class Servidor {

    private String modelo;
    private Equipamento equipamento;
    private Fornecedor fornecedor;

    public Servidor(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
