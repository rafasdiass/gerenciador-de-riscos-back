package com.example.gerenciador.service;

import org.springframework.stereotype.Service;

@Service
public class MartingaleService {

    public double calculateMartingale(double initialAmount, double payoutPercent, int rounds) {
        double currentAmount = initialAmount;

        for (int i = 1; i <= rounds; i++) {
            currentAmount *= (1 + payoutPercent / 100);
        }

        return currentAmount;
    }
}
