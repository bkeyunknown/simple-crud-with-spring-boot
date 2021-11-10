package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MahasiswaEntity;
import com.app.kuliah.dataMahasiswa.services.mahasiswa.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaControllers {

    @Autowired
    MahasiswaService mahasiswaService;

    @PostMapping
    public ResponseEntity<MahasiswaEntity> addNewMahasiswa(@RequestBody MahasiswaEntity param) {
        MahasiswaEntity mahasiswa = mahasiswaService.addNew(param);
        return new ResponseEntity<>(mahasiswa, HttpStatus.CREATED);
    }

    @GetMapping
    public List<MahasiswaEntity> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

    @PutMapping("/{id}")
    public ResponseEntity<MahasiswaEntity> updateMahasiswa(@PathVariable("id") int id,
                                                           @RequestBody MahasiswaEntity param) {
        MahasiswaEntity mahasiswa = mahasiswaService.findMahasiswaById(id);
        mahasiswa.setMahasiswaNIM(param.getMahasiswaNIM());
        mahasiswa.setMahasiswaName(param.getMahasiswaName());
        mahasiswa.setMahasiswaJurusan(param.getMahasiswaJurusan());
        mahasiswa.setMahasiswaFakultas(param.getMahasiswaFakultas());
        mahasiswa.setPassword(param.getPassword());
        MahasiswaEntity edit = mahasiswaService.updateMahasiswa(mahasiswa);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MahasiswaEntity> deleteMahasiswaById(@PathVariable("id") int id) {
        MahasiswaEntity mahasiswa = mahasiswaService.findMahasiswaById(id);
        mahasiswaService.deleteMahasiswaById(id);
        return new ResponseEntity<>(mahasiswa, HttpStatus.OK);
    }
}
