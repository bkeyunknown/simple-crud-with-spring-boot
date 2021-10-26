package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MahasiswaEntity;
import com.app.kuliah.dataMahasiswa.services.mahasiswa.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "mahasiswa")
public class MahasiswaControllers {

    @Autowired
    MahasiswaService mahasiswaService;

    @PostMapping(value = "addNewMahasiswa")
    public MahasiswaEntity addNewMahasiswa(@RequestBody MahasiswaEntity param) {
        return mahasiswaService.addNew(param);
    }

    @GetMapping(value = "getAllMahasiswa")
    public List<MahasiswaEntity> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

    @PostMapping(value = "updateMahasiswa")
    public MahasiswaEntity updateMahasiswa(@RequestBody MahasiswaEntity param) {
        return mahasiswaService.updateMahasiswa(param);
    }

    @GetMapping(value = "deleteMahasiswa")
    public String deleteMahasiswaById(@RequestParam int id) {
        mahasiswaService.deleteMahasiswaById(id);
        return "Delete Mahasiswa id: "+id+" Success";
    }
}
