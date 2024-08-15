package com.example.gerenciador.controller;

import com.example.gerenciador.model.*;
import com.example.gerenciador.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/strategy")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS}, allowCredentials = "true")
public class StrategyController {

    private static final Logger logger = LoggerFactory.getLogger(StrategyController.class);

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

        logger.info("StrategyController initialized with the following services:");
        logger.info("MartingaleService: {}", martingaleService);
        logger.info("CompoundInterestService: {}", compoundInterestService);
        logger.info("ResultProcessingService: {}", resultProcessingService);
        logger.info("SimpleInterestService: {}", simpleInterestService);
        logger.info("SorosService: {}", sorosService);
        logger.info("CustomStrategyService: {}", customStrategyService);
    }

    @PostMapping("/simple-interest")
    public ResponseEntity<Double> calculateSimpleInterest(@RequestBody SimpleInterestRequest request) {
        logger.info("Attempting to map endpoint: /api/strategy/simple-interest");
        double result = simpleInterestService.calculateSimpleInterest(request.getInitialAmount(),
                request.getInterestRate(), request.getPeriods());
        logger.info("Endpoint /api/strategy/simple-interest executed successfully");
        return ResponseEntity.ok(result);
    }

    @PostMapping("/soros")
    public ResponseEntity<Double> calculateSoros(@RequestBody SorosRequest request) {
        logger.info("Attempting to map endpoint: /api/strategy/soros");
        double result = sorosService.calculateSoros(request.getInitialAmount(), request.getPayoutPercent(),
                request.getRounds());
        logger.info("Endpoint /api/strategy/soros executed successfully");
        return ResponseEntity.ok(result);
    }

    @PostMapping("/custom-strategy")
    public ResponseEntity<Double> calculateCustomStrategy(@RequestBody CustomStrategyRequest request) {
        logger.info("Attempting to map endpoint: /api/strategy/custom-strategy");
        double result = customStrategyService.calculateCustomStrategy(request.getInitialAmount(),
                request.getStrategyType());
        logger.info("Endpoint /api/strategy/custom-strategy executed successfully");
        return ResponseEntity.ok(result);
    }

    @PostMapping("/martingale")
    public ResponseEntity<Double> calculateMartingale(@RequestBody MartingaleRequest request) {
        logger.info("Attempting to map endpoint: /api/strategy/martingale");
        double result = martingaleService.calculateMartingale(request.getInitialAmount(), request.getPayoutPercent(),
                request.getRounds());
        logger.info("Endpoint /api/strategy/martingale executed successfully");
        return ResponseEntity.ok(result);
    }

    @PostMapping("/compound-interest")
    public ResponseEntity<Double> calculateCompoundInterest(@RequestBody CompoundInterestRequest request) {
        logger.info("Attempting to map endpoint: /api/strategy/compound-interest");
        double result = compoundInterestService.calculateCompoundInterest(request.getInitialAmount(),
                request.getInterestRate(), request.getPeriods());
        logger.info("Endpoint /api/strategy/compound-interest executed successfully");
        return ResponseEntity.ok(result);
    }

    @PostMapping("/process-result")
    public ResponseEntity<Void> processResult(@RequestBody ResultRequest request) {
        logger.info("Attempting to map endpoint: /api/strategy/process-result");
        resultProcessingService.processResult(request);
        logger.info("Endpoint /api/strategy/process-result executed successfully");
        return ResponseEntity.ok().build();
    }
}
