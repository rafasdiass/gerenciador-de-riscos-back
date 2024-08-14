package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Operation;

@Service
public class OperationService {

    private final List<Operation> operations = new ArrayList<>();

    // Método para calcular Martingale
    public BigDecimal calculateMartingale(BigDecimal initialBet, int rounds, BigDecimal payout) {
        BigDecimal bet = initialBet;
        BigDecimal totalProfit = BigDecimal.ZERO;

        for (int i = 0; i < rounds; i++) {
            BigDecimal profit = bet.multiply(payout);
            totalProfit = totalProfit.add(profit);
            bet = bet.multiply(new BigDecimal(2)); // Dobra a aposta em cada rodada
        }

        return totalProfit;
    }

    // Método para calcular Juros Compostos
    public BigDecimal calculateCompoundInterest(BigDecimal initialAmount, BigDecimal payout, int operationsCount) {
        BigDecimal currentAmount = initialAmount;

        for (int i = 0; i < operationsCount; i++) {
            BigDecimal profit = currentAmount.multiply(payout);
            currentAmount = currentAmount.add(profit); // Reinveste o lucro
        }

        return currentAmount;
    }

    // Método para calcular Juros Simples
    public BigDecimal calculateSimpleInterest(BigDecimal principal, BigDecimal rate, int time) {
        return principal.multiply(rate).multiply(BigDecimal.valueOf(time));
    }

    // Método para adicionar uma operação
    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    // Método para obter todas as operações
    public List<Operation> getAllOperations() {
        return new ArrayList<>(operations);
    }

    // Método para obter uma operação por ID
    public Operation getOperationById(Long id) {
        return operations.stream()
            .filter(operation -> operation.getId().equals(id))
            .findFirst()
            .orElse(null);
    }
}
