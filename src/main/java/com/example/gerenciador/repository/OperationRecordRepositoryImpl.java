package com.example.gerenciador.repository;

import com.example.gerenciador.model.OperationRecord;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class OperationRecordRepositoryImpl implements  OperationRecordRepository{
    @Override
    public List<OperationRecord> findByWin(boolean win) {
        return null;
    }

    @Override
    public List<OperationRecord> findByTimestampAfter(LocalDateTime timestamp) {
        return null;
    }

    @Override
    public List<OperationRecord> findByTimestampBetween(LocalDateTime start, LocalDateTime end) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends OperationRecord> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends OperationRecord> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<OperationRecord> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public OperationRecord getOne(Long aLong) {
        return null;
    }

    @Override
    public OperationRecord getById(Long aLong) {
        return null;
    }

    @Override
    public OperationRecord getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends OperationRecord> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends OperationRecord> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends OperationRecord> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends OperationRecord> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends OperationRecord> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends OperationRecord> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends OperationRecord, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends OperationRecord> S save(S entity) {
        return null;
    }

    @Override
    public <S extends OperationRecord> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<OperationRecord> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<OperationRecord> findAll() {
        return null;
    }

    @Override
    public List<OperationRecord> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(OperationRecord entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends OperationRecord> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<OperationRecord> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<OperationRecord> findAll(Pageable pageable) {
        return null;
    }
}
