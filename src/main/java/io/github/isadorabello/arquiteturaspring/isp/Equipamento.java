package io.github.isadorabello.arquiteturaspring.isp;

public class Equipamento {
    private Fornecedor fornecedor;
    private TipoEquipamento tipo;
    private Placa placa;

    @Override
    public String toString() {
        return "Equipamento{" +
                "fornecedor=" + fornecedor +
                ", tipo=" + tipo +
                ", placa=" + placa +
                '}';
    }

    public Equipamento(Placa placa) {
        this.placa = placa;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public TipoEquipamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipamento tipo) {
        this.tipo = tipo;
    }

    public Placa getPlaca() {
        return placa;
    }

    public void setPlaca(Placa placa) {
        this.placa = placa;
    }
}
