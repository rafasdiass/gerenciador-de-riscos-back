// SimpleInterestRequest.java
package com.example.gerenciador.model;

public class SimpleInterestRequest {
    private double initialAmount;
    private double interestRate;
    private int periods;

    // Getters and Setters
    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getPeriods() {
        return periods;
    }

    public void setPeriods(int periods) {
        this.periods = periods;
    }
}