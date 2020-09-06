package br.com.venustech.vendas.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project vendas
 * Created by vinny
 * on 04/09/2020
 **/
@Configuration
public class DefaultConfig {
    @Bean(name = "applicationName")
    public  String applicationName(){
        return "vendas";
    }

    @Bean
    public CommandLineRunner start(){
        return args -> {
            System.out.println("running new dev configuration");
        };
    }
}
