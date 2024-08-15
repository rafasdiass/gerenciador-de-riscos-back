package com.example.gerenciador.service;

import com.example.gerenciador.model.OperationRecord;
import com.example.gerenciador.repository.OperationRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationHistoryService {

    private final OperationRecordRepository operationRecordRepository;

    public OperationHistoryService(OperationRecordRepository operationRecordRepository) {
        this.operationRecordRepository = operationRecordRepository;
    }

    public List<OperationRecord> getAllOperations() {
        return operationRecordRepository.findAll();
    }

    public List<OperationRecord> getWins() {
        return operationRecordRepository.findByWin(true);
    }

    public List<OperationRecord> getLosses() {
        return operationRecordRepository.findByWin(false);
    }
}
