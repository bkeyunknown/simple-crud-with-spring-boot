package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.JurusanEntity;
import com.app.kuliah.dataMahasiswa.services.jurusan.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jurusan")
public class JurusanControllers {

    @Autowired
    JurusanService jurusanService;

//    @RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("jurusan", getAllJurusan());
//        return "jurusan_page";
//    }

    @PostMapping("/addNewJurusan")
    public ResponseEntity<JurusanEntity> addNewJurusan(@RequestBody JurusanEntity param) {
        JurusanEntity jurusan = jurusanService.addNew(param);
        return new ResponseEntity<>(jurusan, HttpStatus.CREATED);
    }

    @GetMapping("/getAllJurusan")
    public List<JurusanEntity> getAllJurusan() {
        return jurusanService.getAllJurusan();
    }

    @PostMapping("/updateJurusan")
    public ResponseEntity<JurusanEntity> updateJurusan(@RequestBody JurusanEntity param) {
        JurusanEntity jurusan = jurusanService.updateJurusan(param);
        return new ResponseEntity<>(jurusan, HttpStatus.OK);
    }

    @DeleteMapping("/deleteJurusan")
    public String deleteJurusanById(@RequestParam int id) {
        jurusanService.deleteJurusanById(id);
        return "Delete Jurusan id: "+id+" Success";
    }
}
