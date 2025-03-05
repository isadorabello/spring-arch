package io.github.isadorabello.arquiteturaspring.isp;

public class Taishan extends Servidor{

    public Taishan(Equipamento equipamento) {
        super(equipamento);
        setModelo("Taishan Server");
        setFornecedor(Fornecedor.HUAWEI);
    }

}
