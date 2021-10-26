package com.app.kuliah.dataMahasiswa.services.jurusan;

import com.app.kuliah.dataMahasiswa.entities.JurusanEntity;
import com.app.kuliah.dataMahasiswa.repositories.JurusanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JurusanServiceImpl implements JurusanService{

    @Autowired
    JurusanRepository jurusanRepository;

    @Override
    public JurusanEntity addNew(JurusanEntity param) {
        return jurusanRepository.save(param);
    }

    @Override
    public List<JurusanEntity> getAllJurusan() {
        return jurusanRepository.findAll();
    }

    @Override
    public JurusanEntity updateJurusan(JurusanEntity param) {
        return jurusanRepository.save(param);
    }

    @Override
    public void deleteJurusanById(int id) {
        jurusanRepository.deleteById(id);
    }
}
