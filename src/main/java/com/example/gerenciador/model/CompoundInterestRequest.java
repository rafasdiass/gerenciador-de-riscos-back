package com.example.gerenciador.model;

public class CompoundInterestRequest {
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

    // Método para calcular o montante final após todos os períodos com juros compostos
    public double calculateCompoundInterest() {
        // Fórmula de juros compostos: A = P * (1 + r/n)^(nt)
        // Onde:
        // A = Montante final
        // P = Valor inicial (principal)
        // r = Taxa de juros
        // n = Número de vezes que os juros são compostos por período (assumido como 1 aqui)
        // t = Tempo (número de períodos)
        
        return initialAmount * Math.pow((1 + interestRate / 100), periods);
    }
}
