package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.JurusanEntity;
import com.app.kuliah.dataMahasiswa.services.jurusan.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jurusan")
public class JurusanControllers {

    @Autowired
    JurusanService jurusanService;

    @PostMapping
    public ResponseEntity<JurusanEntity> addNewJurusan(@RequestBody JurusanEntity param) {
        JurusanEntity jurusan = jurusanService.addNew(param);
        return new ResponseEntity<>(jurusan, HttpStatus.CREATED);
    }

    @GetMapping
    public List<JurusanEntity> getAllJurusan() {
        return jurusanService.getAllJurusan();
    }

    @PutMapping("/{id}")
    public ResponseEntity<JurusanEntity> updateJurusan(@PathVariable("id") int id,
                                                       @RequestBody JurusanEntity param) {
        JurusanEntity jurusan = jurusanService.findJurusanById(id);
        jurusan.setJurusanName(param.getJurusanName());
        JurusanEntity edit = jurusanService.updateJurusan(jurusan);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<JurusanEntity> deleteJurusanById(@PathVariable("id") int id) {
        JurusanEntity jurusan = jurusanService.findJurusanById(id);
        jurusanService.deleteJurusanById(id);
        return new ResponseEntity<>(jurusan, HttpStatus.OK);
    }
}
