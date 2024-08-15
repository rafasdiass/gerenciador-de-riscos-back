package com.example.gerenciador.model;

public class CustomStrategyRequest {
    private double initialAmount;
    private String strategyType;

    // Getters and Setters
    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType;
    }
}