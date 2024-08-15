package com.example.gerenciador.config;

import com.example.gerenciador.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class StrategyConfig {


    @Bean
    @Lazy
    public MartingaleService martingaleService() {
        return new MartingaleService();
    }

    @Bean
    @Lazy
    public CompoundInterestService compoundInterestService() {
        return new CompoundInterestService();
    }

    @Bean
    @Lazy
    public SimpleInterestService simpleInterestService() {
        return new SimpleInterestService();
    }

    @Bean
    @Lazy
    public SorosService sorosService() {
        return new SorosService();
    }

    @Bean
    @Lazy
    public CustomStrategyService customStrategyService() {
        return new CustomStrategyService();
    }
}
