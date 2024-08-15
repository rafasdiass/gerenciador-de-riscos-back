package com.example.gerenciador.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "operation_records")
public class OperationRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double bet;
    private double payout;
    private double resultAmount;
    private boolean win;
    private LocalDateTime timestamp;

    // Construtor padrão
    public OperationRecord() {}

    // Construtor com todos os campos
    public OperationRecord(double bet, double payout, double resultAmount, boolean win) {
        this.bet = bet;
        this.payout = payout;
        this.resultAmount = resultAmount;
        this.win = win;
        this.timestamp = LocalDateTime.now(); // Marca o momento da operação
    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBet() {
        return bet;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public double getPayout() {
        return payout;
    }

    public void setPayout(double payout) {
        this.payout = payout;
    }

    public double getResultAmount() {
        return resultAmount;
    }

    public void setResultAmount(double resultAmount) {
        this.resultAmount = resultAmount;
    }

    public boolean isWin() {
        return win;
    }

    public void setWin(boolean win) {
        this.win = win;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
