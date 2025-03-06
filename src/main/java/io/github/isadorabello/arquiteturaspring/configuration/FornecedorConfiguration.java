package io.github.isadorabello.arquiteturaspring.configuration;

import io.github.isadorabello.arquiteturaspring.isp.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FornecedorConfiguration {

    @Bean
    public Equipamento roteador (){
        //pode duas dependências em um unico bean?
        var placa = new Placa();
        placa.setNomeModelo("SRU-SN158421184");
        placa.setCapacidade(100);
        placa.setNumeroPortas(8);
        placa.setTipo(TipoPlaca.SRU);
        var roteador = new Equipamento(placa);
        roteador.setFornecedor(Fornecedor.NOKIA);
        roteador.setTipo(TipoEquipamento.ROUTER);
        return roteador;
    }

}
