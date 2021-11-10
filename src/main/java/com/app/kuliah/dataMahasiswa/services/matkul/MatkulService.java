package com.app.kuliah.dataMahasiswa.services.matkul;

import com.app.kuliah.dataMahasiswa.entities.MatkulEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MatkulService {

    MatkulEntity addNew(MatkulEntity param);

    List<MatkulEntity> getAllMatkul();

    MatkulEntity updateMatkul(MatkulEntity param);

    void deleteMatkulById(int id);

    MatkulEntity findMatkulById(int id);
}
