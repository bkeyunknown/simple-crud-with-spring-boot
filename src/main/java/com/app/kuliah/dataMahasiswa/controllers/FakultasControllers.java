package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.FakultasEntity;
import com.app.kuliah.dataMahasiswa.services.fakultas.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "fakultas")
public class FakultasControllers {

    @Autowired
    FakultasService fakultasService;

    @PostMapping(value = "addNewFakultas")
    public FakultasEntity addNewFakultas(@RequestBody FakultasEntity param) {
        FakultasEntity fakultas = fakultasService.addFakultas(param);
        return fakultas;
    }

    @GetMapping(value = "getAllFakultas")
    public List<FakultasEntity> getFakultas() {
        List<FakultasEntity> fakultasList = fakultasService.getAllFakultas();
        return fakultasList;
    }

    @PostMapping(value = "updateFakultas")
    public FakultasEntity updateFakultas(@RequestBody FakultasEntity param){
        FakultasEntity fakultas = fakultasService.updateFakultas(param);
        return fakultas;
    }

    @GetMapping(value = "deleteFakultas")
    public String deleteFakultas(@RequestParam int id) {
        fakultasService.deleteById(id);
        return "Delete Fakultas id: "+id+" Success";
    }
}
