package com.example.gerenciador.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gerenciador.model.CompoundInterestRequest;
import com.example.gerenciador.model.CustomStrategyRequest;
import com.example.gerenciador.model.MartingaleRequest;
import com.example.gerenciador.model.ResultRequest;
import com.example.gerenciador.model.SimpleInterestRequest;
import com.example.gerenciador.model.SorosRequest;
import com.example.gerenciador.service.CompoundInterestService;
import com.example.gerenciador.service.CustomStrategyService;
import com.example.gerenciador.service.MartingaleService;
import com.example.gerenciador.service.ResultProcessingService;
import com.example.gerenciador.service.SimpleInterestService;
import com.example.gerenciador.service.SorosService;

import org.springframework.http.ResponseEntity;
@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/strategy")
public class StrategyController {

    private final MartingaleService martingaleService;
    private final CompoundInterestService compoundInterestService;
    private final ResultProcessingService resultProcessingService;
    private final SimpleInterestService simpleInterestService;
    private final SorosService sorosService;
    private final CustomStrategyService customStrategyService;

    public StrategyController(MartingaleService martingaleService,
                              CompoundInterestService compoundInterestService,
                              ResultProcessingService resultProcessingService,
                              SimpleInterestService simpleInterestService,
                              SorosService sorosService,
                              CustomStrategyService customStrategyService) {
        this.martingaleService = martingaleService;
        this.compoundInterestService = compoundInterestService;
        this.resultProcessingService = resultProcessingService;
        this.simpleInterestService = simpleInterestService;
        this.sorosService = sorosService;
        this.customStrategyService = customStrategyService;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/simple-interest")
    public ResponseEntity<Double> calculateSimpleInterest(@RequestBody SimpleInterestRequest request) {
        double result = simpleInterestService.calculateSimpleInterest(request.getInitialAmount(), request.getInterestRate(), request.getPeriods());
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/soros")
    public ResponseEntity<Double> calculateSoros(@RequestBody SorosRequest request) {
        double result = sorosService.calculateSoros(request.getInitialAmount(), request.getPayoutPercent(), request.getRounds());
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/custom-strategy")
    public ResponseEntity<Double> calculateCustomStrategy(@RequestBody CustomStrategyRequest request) {
        double result = customStrategyService.calculateCustomStrategy(request.getInitialAmount(), request.getStrategyType());
        return ResponseEntity.ok(result);
    }
}
