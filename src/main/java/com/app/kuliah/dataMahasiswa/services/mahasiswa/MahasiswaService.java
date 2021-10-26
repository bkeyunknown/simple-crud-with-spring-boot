package com.app.kuliah.dataMahasiswa.services.mahasiswa;

import com.app.kuliah.dataMahasiswa.entities.MahasiswaEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MahasiswaService {
    
    MahasiswaEntity addNew(MahasiswaEntity param);

    List<MahasiswaEntity> getAllMahasiswa();

    MahasiswaEntity updateMahasiswa(MahasiswaEntity param);

    void deleteMahasiswaById(int id);
}
