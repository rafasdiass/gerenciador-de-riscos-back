package com.example.gerenciador.service;

import org.springframework.stereotype.Service;

@Service
public class MartingaleService {

    public double calculateMartingale(double initialAmount, double payoutPercent) {
        // Lógica de cálculo do Martingale
        return initialAmount * (1 + payoutPercent / 100);
    }
}
