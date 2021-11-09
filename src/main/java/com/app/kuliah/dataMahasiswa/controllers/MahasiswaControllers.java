package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MahasiswaEntity;
import com.app.kuliah.dataMahasiswa.services.mahasiswa.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaControllers {

    @Autowired
    MahasiswaService mahasiswaService;

//    @RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("mahasiswa", getAllMahasiswa());
//        return "mahasiswa_page";
//    }

    @PostMapping("/addNewMahasiswa")
    public ResponseEntity<MahasiswaEntity> addNewMahasiswa(@RequestBody MahasiswaEntity param) {
        MahasiswaEntity mahasiswa = mahasiswaService.addNew(param);
        return new ResponseEntity<>(mahasiswa, HttpStatus.CREATED);
    }

    @GetMapping("/getAllMahasiswa")
    public List<MahasiswaEntity> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

    @PostMapping("/updateMahasiswa")
    public ResponseEntity<MahasiswaEntity> updateMahasiswa(@RequestBody MahasiswaEntity param) {
        MahasiswaEntity mahasiswa = mahasiswaService.updateMahasiswa(param);
        return new ResponseEntity<>(mahasiswa, HttpStatus.OK);
    }

    @DeleteMapping("/deleteMahasiswa")
    public String deleteMahasiswaById(@RequestParam int id) {
        mahasiswaService.deleteMahasiswaById(id);
        return "Delete Mahasiswa id: "+id+" Success";
    }
}
