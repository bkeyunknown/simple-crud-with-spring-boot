package com.app.kuliah.dataMahasiswa.services.mahasiswa;

import com.app.kuliah.dataMahasiswa.entities.MahasiswaEntity;
import com.app.kuliah.dataMahasiswa.repositories.MahasiswaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MahasiswaServiceImpl implements MahasiswaService {

    @Autowired
    MahasiswaRepository mahasiswaRepository;

    @Override
    public MahasiswaEntity addNew(MahasiswaEntity param) {
        return mahasiswaRepository.save(param);
    }

    @Override
    public List<MahasiswaEntity> getAllMahasiswa() {
        return mahasiswaRepository.findAll();
    }

    @Override
    public MahasiswaEntity updateMahasiswa(MahasiswaEntity param) {
        return mahasiswaRepository.save(param);
    }

    @Override
    public void deleteMahasiswaById(int id) {
        mahasiswaRepository.deleteById(id);
    }

    @Override
    public MahasiswaEntity findMahasiswaById(int id) {
        return mahasiswaRepository.findById(id).orElseThrow(RuntimeException::new);
    }
}
