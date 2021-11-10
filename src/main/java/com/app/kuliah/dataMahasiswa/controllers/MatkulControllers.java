package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MatkulEntity;
import com.app.kuliah.dataMahasiswa.services.matkul.MatkulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matkul")
public class MatkulControllers {

    @Autowired
    MatkulService matkulService;

    @PostMapping
    public ResponseEntity<MatkulEntity> addNewMatkul(@RequestBody MatkulEntity param) {
        MatkulEntity matkul = matkulService.addNew(param);
        return new ResponseEntity<>(matkul, HttpStatus.CREATED);
    }

    @GetMapping
    public List<MatkulEntity> getAllMatkul() {
        return matkulService.getAllMatkul();
    }

    @PutMapping("/{id}")
    public ResponseEntity<MatkulEntity> updateMatkul(@PathVariable("id") int id,
                                                     @RequestBody MatkulEntity param) {
        MatkulEntity matkul = matkulService.findMatkulById(id);
        matkul.setMatkulName(param.getMatkulName());
        matkul.setMatkulSks(param.getMatkulSks());
        matkul.setMatkulSemester(param.getMatkulSemester());
        MatkulEntity edit = matkulService.updateMatkul(matkul);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MatkulEntity> deleteMatkulById(@PathVariable("id") int id) {
        MatkulEntity matkul = matkulService.findMatkulById(id);
        matkulService.deleteMatkulById(id);
        return new ResponseEntity<>(matkul, HttpStatus.OK);
    }

}
