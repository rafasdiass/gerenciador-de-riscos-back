package com.example.gerenciador.model;

public class SorosRequest {
    private double initialAmount;
    private double payoutPercent;
    private int rounds;

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

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
