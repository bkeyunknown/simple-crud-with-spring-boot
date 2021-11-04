package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.FakultasEntity;
import com.app.kuliah.dataMahasiswa.services.fakultas.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/fakultas")
public class FakultasControllers {

    @Autowired
    FakultasService fakultasService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("fakultas", getAllFakultas());
        return "fakultas_page";
    }

    @PostMapping("/addNewFakultas")
    @ResponseBody
    public FakultasEntity addNewFakultas(@RequestBody FakultasEntity param) {
        FakultasEntity fakultas = fakultasService.addFakultas(param);
        return fakultas;
    }

    @GetMapping("/getAllFakultas")
    @ResponseBody
    public List<FakultasEntity> getAllFakultas() {
        List<FakultasEntity> fakultasList = fakultasService.getAllFakultas();
        return fakultasList;
    }

    @PostMapping("/updateFakultas")
    @ResponseBody
    public FakultasEntity updateFakultas(@RequestBody FakultasEntity param){
        FakultasEntity fakultas = fakultasService.updateFakultas(param);
        return fakultas;
    }

    @DeleteMapping("/deleteFakultas")
    @ResponseBody
    public String deleteFakultasById(@RequestParam int id) {
        fakultasService.deleteFakultasById(id);
        return "Delete Fakultas id: "+id+" Success";
    }
}
