package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MatkulEntity;
import com.app.kuliah.dataMahasiswa.services.matkul.MatkulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matkul")
public class MatkulControllers {

    @Autowired
    MatkulService matkulService;

//    @RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("matkul", getAllMatkul());
//        return "matkul_page";
//    }

    @PostMapping("/addNewMatkul")
    public ResponseEntity<MatkulEntity> addNewMatkul(@RequestBody MatkulEntity param) {
        MatkulEntity matkul = matkulService.addNew(param);
        return new ResponseEntity<>(matkul, HttpStatus.CREATED);
    }

    @GetMapping("/getAllMatkul")
    public List<MatkulEntity> getAllMatkul() {
        return matkulService.getAllMatkul();
    }

    @PostMapping("/updateMatkul")
    public ResponseEntity<MatkulEntity> updateMatkul(@RequestBody MatkulEntity param) {
        MatkulEntity matkul = matkulService.updateMatkul(param);
        return new ResponseEntity<>(matkul, HttpStatus.OK);
    }

    @DeleteMapping("/deleteMatkul")
    public String deleteMatkulById(@RequestParam int id) {
        matkulService.deleteMatkulById(id);
        return "Delete Matkul id: "+id+" Success";
    }

}
