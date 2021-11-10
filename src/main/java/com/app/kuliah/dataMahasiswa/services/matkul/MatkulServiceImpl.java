package com.app.kuliah.dataMahasiswa.services.matkul;

import com.app.kuliah.dataMahasiswa.entities.MatkulEntity;
import com.app.kuliah.dataMahasiswa.repositories.MatkulRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatkulServiceImpl implements MatkulService{

    @Autowired
    MatkulRepository matkulRepository;

    @Override
    public MatkulEntity addNew(MatkulEntity param) {
        return matkulRepository.save(param);
    }

    @Override
    public List<MatkulEntity> getAllMatkul() {
        return matkulRepository.findAll();
    }

    @Override
    public MatkulEntity updateMatkul(MatkulEntity param) {
        return matkulRepository.save(param);
    }

    @Override
    public void deleteMatkulById(int id) {
        matkulRepository.deleteById(id);
    }

    @Override
    public MatkulEntity findMatkulById(int id) {
        return matkulRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
