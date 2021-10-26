package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MatkulEntity;
import com.app.kuliah.dataMahasiswa.services.matkul.MatkulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "matkul")
public class MatkulControllers {

    @Autowired
    MatkulService matkulService;

    @PostMapping(value = "addNewMatkul")
    public MatkulEntity addNewMatkul(@RequestBody MatkulEntity param) {
        return matkulService.addNew(param);
    }

    @GetMapping(value = "getAllMatkul")
    public List<MatkulEntity> getAllMatkul() {
        return matkulService.getAllMatkul();
    }

    @PostMapping(value = "updateMatkul")
    public MatkulEntity updateMatkul(@RequestBody MatkulEntity param) {
        return matkulService.updateMatkul(param);
    }

    @GetMapping(value = "deleteMatkul")
    public String deleteMatkulById(@RequestParam int id) {
        matkulService.deleteMatkulById(id);
        return "Delete Matkul id: "+id+" Success";
    }

}
