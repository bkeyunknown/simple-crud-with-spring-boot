package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.JurusanEntity;
import com.app.kuliah.dataMahasiswa.services.jurusan.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "jurusan")
public class JurusanControllers {

    @Autowired
    JurusanService jurusanService;

    @PostMapping(value = "addNewJurusan")
    public JurusanEntity addNewJurusan(@RequestBody JurusanEntity param) {
        return jurusanService.addNew(param);
    }

    @GetMapping(value = "getAllJurusan")
    public List<JurusanEntity> getAllJurusan() {
        return jurusanService.getAllJurusan();
    }

    @PostMapping(value = "updateJurusan")
    public JurusanEntity updateJurusan(@RequestBody JurusanEntity param) {
        return jurusanService.updateJurusan(param);
    }

    @GetMapping(value = "deleteJurusan")
    public String deleteJurusan(@RequestParam int id) {
        jurusanService.deleteJurusanById(id);
        return "Delete Jurusan id: "+id+" Success";
    }
}
