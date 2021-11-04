package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MatkulEntity;
import com.app.kuliah.dataMahasiswa.services.matkul.MatkulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/matkul")
public class MatkulControllers {

    @Autowired
    MatkulService matkulService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("matkul", getAllMatkul());
        return "matkul_page";
    }

    @PostMapping("/addNewMatkul")
    @ResponseBody
    public MatkulEntity addNewMatkul(@RequestBody MatkulEntity param) {
        return matkulService.addNew(param);
    }

    @GetMapping("/getAllMatkul")
    @ResponseBody
    public List<MatkulEntity> getAllMatkul() {
        return matkulService.getAllMatkul();
    }

    @PostMapping("/updateMatkul")
    @ResponseBody
    public MatkulEntity updateMatkul(@RequestBody MatkulEntity param) {
        return matkulService.updateMatkul(param);
    }

    @DeleteMapping("/deleteMatkul")
    @ResponseBody
    public String deleteMatkulById(@RequestParam int id) {
        matkulService.deleteMatkulById(id);
        return "Delete Matkul id: "+id+" Success";
    }

}
