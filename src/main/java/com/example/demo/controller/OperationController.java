package com.example.demo.controller;

import com.example.demo.model.Operation;
import com.example.demo.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/operations")
public class OperationController {

    @Autowired
    private OperationService operationService;

    // Endpoint para calcular Martingale
    @GetMapping("/calculate/martingale")
    public ResponseEntity<BigDecimal> calculateMartingale(
            @RequestParam BigDecimal initialBet,
            @RequestParam int rounds,
            @RequestParam BigDecimal payout) {
        BigDecimal result = operationService.calculateMartingale(initialBet, rounds, payout);
        return ResponseEntity.ok(result);
    }

    // Endpoint para calcular Juros Compostos
    @GetMapping("/calculate/compound-interest")
    public ResponseEntity<BigDecimal> calculateCompoundInterest(
            @RequestParam BigDecimal initialAmount,
            @RequestParam BigDecimal payout,
            @RequestParam int operationsCount) {
        BigDecimal result = operationService.calculateCompoundInterest(initialAmount, payout, operationsCount);
        return ResponseEntity.ok(result);
    }

    // Endpoint para calcular Juros Simples
    @GetMapping("/calculate/simple-interest")
    public ResponseEntity<BigDecimal> calculateSimpleInterest(
            @RequestParam BigDecimal principal,
            @RequestParam BigDecimal rate,
            @RequestParam int time) {
        BigDecimal result = operationService.calculateSimpleInterest(principal, rate, time);
        return ResponseEntity.ok(result);
    }

    // Endpoint para adicionar uma operação
    @PostMapping("/add")
    public ResponseEntity<Void> addOperation(@RequestBody Operation operation) {
        operationService.addOperation(operation);
        return ResponseEntity.ok().build();
    }

    // Endpoint para obter todas as operações
    @GetMapping("/all")
    public ResponseEntity<List<Operation>> getAllOperations() {
        List<Operation> operations = operationService.getAllOperations();
        return ResponseEntity.ok(operations);
    }

    // Endpoint para obter uma operação por ID
    @GetMapping("/{id}")
    public ResponseEntity<Operation> getOperationById(@PathVariable Long id) {
        Operation operation = operationService.getOperationById(id);
        if (operation != null) {
            return ResponseEntity.ok(operation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
