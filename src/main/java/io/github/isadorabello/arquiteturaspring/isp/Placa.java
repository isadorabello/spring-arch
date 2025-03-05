package io.github.isadorabello.arquiteturaspring.isp;

public class Placa {
    private String nomrModelo;
    private Integer numeroPortas;
    private Integer capacidade;
    private TipoPlaca tipo;

    public String getNomrModelo() {
        return nomrModelo;
    }

    public void setNomrModelo(String nomrModelo) {
        this.nomrModelo = nomrModelo;
    }

    public Integer getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(Integer numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public TipoPlaca getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlaca tipo) {
        this.tipo = tipo;
    }
}
