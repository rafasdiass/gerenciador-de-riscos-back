package com.example.gerenciador.service;

import org.springframework.stereotype.Service;

@Service
public class SorosService {

    public double calculateSoros(double initialAmount, double payoutPercent, int rounds) {
        double amount = initialAmount;
        for (int i = 0; i < rounds; i++) {
            amount += amount * (payoutPercent / 100);
        }
        return amount;
    }
}