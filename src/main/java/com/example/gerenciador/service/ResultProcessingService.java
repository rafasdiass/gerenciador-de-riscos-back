package com.example.gerenciador.service;

import com.example.gerenciador.model.OperationRecord;
import com.example.gerenciador.model.ResultRequest;
import com.example.gerenciador.repository.OperationRecordRepository;
import org.springframework.stereotype.Service;

@Service
public class ResultProcessingService {

    private final OperationRecordRepository operationRecordRepository;

    public ResultProcessingService(OperationRecordRepository operationRecordRepository) {
        this.operationRecordRepository = operationRecordRepository;
    }

    public void processResult(ResultRequest request) {
        if ("win".equals(request.getResult())) {
            processWin(request.getBet(), request.getPayout());
        } else if ("loss".equals(request.getResult())) {
            processLoss(request.getBet());
        }
    }

    private void processWin(double bet, double payout) {
        double winAmount = bet * (payout / 100);
        OperationRecord winRecord = new OperationRecord(bet, payout, winAmount, true);
        operationRecordRepository.save(winRecord); // Salva o registro de vitória no banco de dados
    }

    private void processLoss(double bet) {
        double lossAmount = -bet;
        OperationRecord lossRecord = new OperationRecord(bet, 0, lossAmount, false);
        operationRecordRepository.save(lossRecord); // Salva o registro de derrota no banco de dados
    }
}
