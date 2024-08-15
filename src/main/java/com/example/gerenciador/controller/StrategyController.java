package com.example.gerenciador.controller;

import com.example.gerenciador.model.*;
import com.example.gerenciador.service.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        double result = simpleInterestService.calculateSimpleInterest(request.getInitialAmount(),
                request.getInterestRate(), request.getPeriods());
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/soros")
    public ResponseEntity<Double> calculateSoros(@RequestBody SorosRequest request) {
        double result = sorosService.calculateSoros(request.getInitialAmount(), request.getPayoutPercent(),
                request.getRounds());
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/custom-strategy")
    public ResponseEntity<Double> calculateCustomStrategy(@RequestBody CustomStrategyRequest request) {
        double result = customStrategyService.calculateCustomStrategy(request.getInitialAmount(),
                request.getStrategyType());
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/martingale")
    public ResponseEntity<Double> calculateMartingale(@RequestBody MartingaleRequest request) {
        double result = martingaleService.calculateMartingale(request.getInitialAmount(), request.getPayoutPercent(),
                request.getRounds());
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/compound-interest")
    public ResponseEntity<Double> calculateCompoundInterest(@RequestBody CompoundInterestRequest request) {
        double result = compoundInterestService.calculateCompoundInterest(request.getInitialAmount(),
                request.getInterestRate(), request.getPeriods());
        return ResponseEntity.ok(result);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/process-result")
    public ResponseEntity<Void> processResult(@RequestBody ResultRequest request) {
        resultProcessingService.processResult(request);
        return ResponseEntity.ok().build();
    }
}
