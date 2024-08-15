package com.example.gerenciador.service;

import org.springframework.stereotype.Service;

@Service
public class CompoundInterestService {

    public double calculateCompoundInterest(double initialAmount, double interestRate, int periods) {
        // Lógica de cálculo de juros compostos
        return initialAmount * Math.pow((1 + interestRate / 100), periods);
    }
}
