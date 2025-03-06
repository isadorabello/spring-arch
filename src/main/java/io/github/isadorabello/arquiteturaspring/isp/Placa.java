package io.github.isadorabello.arquiteturaspring.isp;

public class Placa {
    private String nomeModelo;
    private Integer numeroPortas;
    private Integer capacidade;
    private TipoPlaca tipo;

    @Override
    public String toString() {
        return "Placa{" +
                "Nome do Modelo='" + nomeModelo + '\'' +
                ", N° de Portas=" + numeroPortas +
                ", Capacidade=" + capacidade +
                ", Tipo=" + tipo +
                '}';
    }

    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
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
