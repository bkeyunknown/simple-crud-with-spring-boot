package com.app.kuliah.dataMahasiswa.services.fakultas;

import com.app.kuliah.dataMahasiswa.entities.FakultasEntity;
import com.app.kuliah.dataMahasiswa.repositories.FakultasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakultasServiceImpl implements FakultasService{

    @Autowired
    FakultasRepository fakultasRepository;

    @Override
    public FakultasEntity addFakultas(FakultasEntity param) {
        return fakultasRepository.save(param);
    }

    @Override
    public List<FakultasEntity> getAllFakultas() {
        return fakultasRepository.findAll();
    }

    @Override
    public FakultasEntity updateFakultas(FakultasEntity param) {
        return fakultasRepository.save(param);
    }

    @Override
    public void deleteById(int id) {
        fakultasRepository.deleteById(id);
    }
}
