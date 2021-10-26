package com.app.kuliah.dataMahasiswa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeControllers {

    @Autowired
    MahasiswaControllers mahasiswaControllers;

    @Autowired
    FakultasControllers fakultasControllers;

    @Autowired
    JurusanControllers jurusanControllers;

    @Autowired
    MatkulControllers matkulControllers;

    @GetMapping("/")
    public String index() {
        return "home_page";
    }

    @GetMapping("/mahasiswa")
    public String mahasiswa(Model model) {
        model.addAttribute("mahasiswa", mahasiswaControllers.getAllMahasiswa());
        return "mahasiswa_page";
    }

    @GetMapping("/fakultas")
    public String fakultas(Model model) {
        model.addAttribute("fakultas", fakultasControllers.getFakultas());
        return "fakultas_page";
    }

    @GetMapping("/jurusan")
    public String jurusan(Model model) {
        model.addAttribute("jurusan", jurusanControllers.getAllJurusan());
        return "jurusan_page";
    }

    @GetMapping("/matkul")
    public String matkul(Model model) {
        model.addAttribute("matkul", matkulControllers.getAllMatkul());
        return "matkul_page";
    }

}
