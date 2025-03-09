package io.github.isadorabello.arquiteturaspring.telecom.api;

import io.github.isadorabello.arquiteturaspring.telecom.isp.Comando;
import io.github.isadorabello.arquiteturaspring.telecom.isp.Equipamento;
import io.github.isadorabello.arquiteturaspring.telecom.isp.Taishan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servidores")
public class TesteController {

    // @Qualifier("equipamentoSwitch")  // define qual dos beans será escolhido para a injeção
    @Autowired
    @Switch
    private Equipamento equipamento; // injeção de dependência

    @PostMapping
    public ServidorStatus configurarServidor(@RequestBody Comando comandos){
        var servidor = new Taishan(equipamento);
        return servidor.configuracao(comandos);
    }

}
