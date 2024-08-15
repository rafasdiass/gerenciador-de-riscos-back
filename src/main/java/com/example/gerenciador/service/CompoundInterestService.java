package com.example.gerenciador.service;

import org.springframework.stereotype.Service;

@Service
public class CompoundInterestService {

    public double calculateCompoundInterest(double initialAmount, double interestRate, int periods) {
        // Lógica de cálculo de juros compostos
        // Fórmula: A = P * (1 + r/n)^(nt)
        return initialAmount * Math.pow((1 + interestRate / 100), periods);
    }
}
