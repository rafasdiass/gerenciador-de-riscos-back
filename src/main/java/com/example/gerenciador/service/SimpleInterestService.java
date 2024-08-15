package com.example.gerenciador.service;

import org.springframework.stereotype.Service;

@Service
public class SimpleInterestService {

    public double calculateSimpleInterest(double initialAmount, double interestRate, int periods) {
        return initialAmount * (1 + (interestRate * periods));
    }
}
