package io.github.isadorabello.arquiteturaspring.telecom.configuration;

import io.github.isadorabello.arquiteturaspring.telecom.isp.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class FornecedorConfiguration {

    @Bean(name = "equipamentoRouter")
    public Equipamento equipamentoRouter (){
        //pode duas dependências em um unico bean?
        var placa = new Placa();
        placa.setNomeModelo("SRU-SN158421184");
        placa.setCapacidade(10000);
        placa.setNumeroPortas(8);
        placa.setTipo(TipoPlaca.SRU);
        var roteador = new Equipamento(placa);
        roteador.setFornecedor(Fornecedor.NOKIA);
        roteador.setTipo(TipoEquipamento.ROUTER);
        return roteador;
    }

    @Bean(name = "equipamentoSwitch")
    @Primary
    public Equipamento equipamentoSwitch (){
        var placa = new Placa();
        placa.setNomeModelo("LPU-SN547821163");
        placa.setCapacidade(40000);
        placa.setNumeroPortas(20);
        placa.setTipo(TipoPlaca.LPU);
        var sw = new Equipamento(placa);
        sw.setFornecedor(Fornecedor.HUAWEI);
        sw.setTipo(TipoEquipamento.SWITCH);
        return sw;
    }

    @Bean(name = "equipamentoAC")
    public Equipamento equipamentoAC (){
        //pode duas dependências em um unico bean?
        var placa = new Placa();
        placa.setNomeModelo("MPU-SN478556219");
        placa.setCapacidade(1000);
        placa.setNumeroPortas(4);
        placa.setTipo(TipoPlaca.MPU);
        var accessPoint = new Equipamento(placa);
        accessPoint.setFornecedor(Fornecedor.ERICSSON);
        accessPoint.setTipo(TipoEquipamento.ACCESS_POINT);
        return accessPoint;
    }

}
