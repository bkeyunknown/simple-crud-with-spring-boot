package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.FakultasEntity;
import com.app.kuliah.dataMahasiswa.services.fakultas.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fakultas")
public class FakultasControllers {

    @Autowired
    FakultasService fakultasService;

//    @RequestMapping("/")
//    public String index(Model model) {
//        model.addAttribute("fakultas", getAllFakultas());
//        return "fakultas_page";
//    }

    @PostMapping("/addNewFakultas")
    public ResponseEntity<FakultasEntity> addNewFakultas(@RequestBody FakultasEntity param) {
        FakultasEntity fakultas = fakultasService.addFakultas(param);
        return new ResponseEntity<>(fakultas, HttpStatus.CREATED);
    }

    @GetMapping("/getAllFakultas")
    public List<FakultasEntity> getAllFakultas() {
        return fakultasService.getAllFakultas();
    }

    @PostMapping("/updateFakultas")
    public ResponseEntity<FakultasEntity> updateFakultas(@RequestBody FakultasEntity param){
        FakultasEntity fakultas = fakultasService.updateFakultas(param);
        return new ResponseEntity<>(fakultas, HttpStatus.OK);
    }

    @DeleteMapping("/deleteFakultas/{id}")
    public ResponseEntity<FakultasEntity> deleteFakultasById(@PathVariable("id") int id) {
        FakultasEntity deleteFakultas = fakultasService.findFakultasById(id);
        fakultasService.deleteFakultasById(id);
//        return "Delete Fakultas id: "+id+" Success";
        return new ResponseEntity<>(deleteFakultas, HttpStatus.OK);
    }
}
