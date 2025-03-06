package io.github.isadorabello.arquiteturaspring.api;

import io.github.isadorabello.arquiteturaspring.isp.Comando;
import io.github.isadorabello.arquiteturaspring.isp.Equipamento;
import io.github.isadorabello.arquiteturaspring.isp.Taishan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servidores")
public class TesteController {

    @Autowired
    private Equipamento equipamento; // injeção de dependência

    @PostMapping
    public ServidorStatus configurarServidor(@RequestBody Comando comandos){
        var servidor = new Taishan(equipamento);
        return servidor.configuracao(comandos);
    }

}
