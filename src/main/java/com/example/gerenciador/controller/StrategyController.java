package com.example.gerenciador.controller;

import com.example.gerenciador.model.CompoundInterestRequest;
import com.example.gerenciador.model.MartingaleRequest;
import com.example.gerenciador.model.ResultRequest;
import com.example.gerenciador.service.CompoundInterestService;
import com.example.gerenciador.service.MartingaleService;
import com.example.gerenciador.service.ResultProcessingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/strategy")
public class StrategyController {

    private final MartingaleService martingaleService;
    private final CompoundInterestService compoundInterestService;
    private final ResultProcessingService resultProcessingService;

    public StrategyController(MartingaleService martingaleService,
                              CompoundInterestService compoundInterestService,
                              ResultProcessingService resultProcessingService) {
        this.martingaleService = martingaleService;
        this.compoundInterestService = compoundInterestService;
        this.resultProcessingService = resultProcessingService;
    }

    @PostMapping("/martingale")
    public ResponseEntity<Double> calculateMartingale(@RequestBody MartingaleRequest request) {
        double result = martingaleService.calculateMartingale(request.getInitialAmount(), request.getPayoutPercent());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/compound-interest")
    public ResponseEntity<Double> calculateCompoundInterest(@RequestBody CompoundInterestRequest request) {
        double result = compoundInterestService.calculateCompoundInterest(request.getInitialAmount(), request.getInterestRate(), request.getPeriods());
        return ResponseEntity.ok(result);
    }

    @PostMapping("/process-result")
    public ResponseEntity<Void> processResult(@RequestBody ResultRequest request) {
        resultProcessingService.processResult(request);
        return ResponseEntity.ok().build();
    }
}
