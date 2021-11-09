package com.app.kuliah.dataMahasiswa.services.fakultas;

import com.app.kuliah.dataMahasiswa.entities.FakultasEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface FakultasService {

    FakultasEntity addFakultas(FakultasEntity param);

    List<FakultasEntity> getAllFakultas();

    FakultasEntity updateFakultas(FakultasEntity param);

    void deleteFakultasById(int id);

    FakultasEntity findFakultasById(int id);
}
