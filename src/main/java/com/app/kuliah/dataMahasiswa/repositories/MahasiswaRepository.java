package com.app.kuliah.dataMahasiswa.repositories;

import com.app.kuliah.dataMahasiswa.entities.MahasiswaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MahasiswaRepository extends JpaRepository<MahasiswaEntity, Integer> {
}
