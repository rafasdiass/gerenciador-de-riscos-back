package com.example.gerenciador.model;

public class MartingaleRequest {
    private double initialAmount;
    private double payoutPercent;

    // Getters and Setters

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public double getPayoutPercent() {
        return payoutPercent;
    }

    public void setPayoutPercent(double payoutPercent) {
        this.payoutPercent = payoutPercent;
    }
}
