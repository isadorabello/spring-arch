package io.github.isadorabello.arquiteturaspring.telecom.isp;

public class Comando {

    private TipoEquipamento tipo;
    private String comando;

    public TipoEquipamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoEquipamento tipo) {
        this.tipo = tipo;
    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }
}
