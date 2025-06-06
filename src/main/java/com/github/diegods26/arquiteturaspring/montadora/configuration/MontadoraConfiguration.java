package com.github.diegods26.arquiteturaspring.montadora.configuration;

import com.github.diegods26.arquiteturaspring.montadora.Motor;
import com.github.diegods26.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motorAspirado(){
        var motor = new Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("CHT-I");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRADO);
        return motor;
    }

    @Bean
    public Motor motorEletrico(){
        var motor = new Motor();
        motor.setCavalos(100);
        motor.setCilindros(3);
        motor.setModelo("e-THZ");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean
    public Motor motorTurbo(){
        var motor = new Motor();
        motor.setCavalos(140);
        motor.setCilindros(4);
        motor.setModelo("IVTECH");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.TURBO);
        return motor;
    }
}
