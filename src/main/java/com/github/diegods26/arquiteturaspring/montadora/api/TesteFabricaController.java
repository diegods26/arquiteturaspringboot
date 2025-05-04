package com.github.diegods26.arquiteturaspring.montadora.api;

import com.github.diegods26.arquiteturaspring.montadora.CarroStatus;
import com.github.diegods26.arquiteturaspring.montadora.Chave;
import com.github.diegods26.arquiteturaspring.montadora.HondaHRV;
import com.github.diegods26.arquiteturaspring.montadora.Motor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    @Turbo
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }
}
