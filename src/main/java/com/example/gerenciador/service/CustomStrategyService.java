package com.example.gerenciador.service;

import org.springframework.stereotype.Service;

@Service
public class CustomStrategyService {

    public double calculateCustomStrategy(double initialAmount, String strategyType) {
        // Aqui você pode implementar a lógica personalizada baseada no tipo de estratégia
        switch (strategyType) {
            case "strategy1":
                return initialAmount * 1.1; // Exemplo de cálculo
            case "strategy2":
                return initialAmount * 1.2;
            default:
                return initialAmount;
        }
    }
}