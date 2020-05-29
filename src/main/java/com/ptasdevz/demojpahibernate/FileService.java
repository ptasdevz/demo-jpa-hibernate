package com.ptasdevz.demojpahibernate;
import com.ptasdevz.demojpahibernate.entites.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Qualifier("child")
@Service
public class FileService implements FileRepo {

    @Autowired
    private FileRepo fileRepo;


    @Override
    public <S extends File> S save(S s) {
        return fileRepo.save(s);
    }

    @Override
    public <S extends File> Iterable<S> saveAll(Iterable<S> iterable) {
        return fileRepo.saveAll(iterable);
    }

    @Override
    public Optional<File> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<File> findAll() {
        return fileRepo.findAll();
    }

    @Override
    public Iterable<File> findAllById(Iterable<Integer> iterable) {
        return fileRepo.findAllById(iterable);
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {
        fileRepo.deleteById(integer);
    }

    @Override
    public void delete(File file) {
        fileRepo.delete(file);
    }

    @Override
    public void deleteAll(Iterable<? extends File> iterable) {
        fileRepo.deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        fileRepo.deleteAll();
    }
}
