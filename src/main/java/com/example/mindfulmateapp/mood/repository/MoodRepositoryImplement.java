package com.example.mindfulmateapp.mood.repository;

import com.example.mindfulmateapp.mood.model.MoodEntry;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Repository
public class MoodRepositoryImplement implements MoodRepository {
    @Override
    public void flush() {
    }

    @Override
    public <S extends MoodEntry> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends MoodEntry> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<MoodEntry> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public MoodEntry getOne(Integer integer) {
        return null;
    }

    @Override
    public MoodEntry getById(Integer integer) {
        return null;
    }

    @Override
    public MoodEntry getReferenceById(Integer integer) {
        return null;
    }

    @Override
    public <S extends MoodEntry> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends MoodEntry> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends MoodEntry> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends MoodEntry> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends MoodEntry> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends MoodEntry> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends MoodEntry, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends MoodEntry> S save(S entity) {
        return null;
    }

    @Override
    public <S extends MoodEntry> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<MoodEntry> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public List<MoodEntry> findAll() {
        return null;
    }

    @Override
    public List<MoodEntry> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(MoodEntry entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends MoodEntry> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<MoodEntry> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<MoodEntry> findAll(Pageable pageable) {
        return null;
    }
}
