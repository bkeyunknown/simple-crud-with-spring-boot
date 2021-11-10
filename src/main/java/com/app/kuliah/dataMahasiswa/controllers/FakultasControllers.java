package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.FakultasEntity;
import com.app.kuliah.dataMahasiswa.services.fakultas.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fakultas")
public class FakultasControllers {

    @Autowired
    FakultasService fakultasService;

    @PostMapping
    public ResponseEntity<FakultasEntity> addNewFakultas(@RequestBody FakultasEntity param) {
        FakultasEntity fakultas = fakultasService.addFakultas(param);
        return new ResponseEntity<>(fakultas, HttpStatus.CREATED);
    }

    @GetMapping
    public List<FakultasEntity> getAllFakultas() {
        return fakultasService.getAllFakultas();
    }

    @PutMapping("/{id}")
    public ResponseEntity<FakultasEntity> updateFakultas(@PathVariable("id") int id,
                                                         @RequestBody FakultasEntity param){
        FakultasEntity fakultas = fakultasService.findFakultasById(id);
        fakultas.setFacultyName(param.getFacultyName());
        FakultasEntity edit = fakultasService.updateFakultas(fakultas);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<FakultasEntity> deleteFakultasById(@PathVariable("id") int id) {
        FakultasEntity deleteFakultas = fakultasService.findFakultasById(id);
        fakultasService.deleteFakultasById(id);
//        return "Delete Fakultas id: "+id+" Success";
        return new ResponseEntity<>(deleteFakultas, HttpStatus.OK);
    }
}
