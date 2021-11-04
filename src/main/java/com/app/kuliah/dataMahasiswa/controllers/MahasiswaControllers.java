package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MahasiswaEntity;
import com.app.kuliah.dataMahasiswa.services.mahasiswa.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/mahasiswa")
public class MahasiswaControllers {

    @Autowired
    MahasiswaService mahasiswaService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("mahasiswa", getAllMahasiswa());
        return "mahasiswa_page";
    }

    @PostMapping("/addNewMahasiswa")
    @ResponseBody
    public MahasiswaEntity addNewMahasiswa(@RequestBody MahasiswaEntity param) {
        return mahasiswaService.addNew(param);
    }

    @GetMapping("/getAllMahasiswa")
    @ResponseBody
    public List<MahasiswaEntity> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }

    @PostMapping("/updateMahasiswa")
    @ResponseBody
    public MahasiswaEntity updateMahasiswa(@RequestBody MahasiswaEntity param) {
        return mahasiswaService.updateMahasiswa(param);
    }

    @DeleteMapping("/deleteMahasiswa")
    @ResponseBody
    public String deleteMahasiswaById(@RequestParam int id) {
        mahasiswaService.deleteMahasiswaById(id);
        return "Delete Mahasiswa id: "+id+" Success";
    }
}
