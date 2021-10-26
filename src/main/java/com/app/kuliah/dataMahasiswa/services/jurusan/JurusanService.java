package com.app.kuliah.dataMahasiswa.services.jurusan;

import com.app.kuliah.dataMahasiswa.entities.JurusanEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface JurusanService {

    JurusanEntity addNew(JurusanEntity param);

    List<JurusanEntity> getAllJurusan();

    JurusanEntity updateJurusan(JurusanEntity param);

    void deleteJurusanById(int id);
}
