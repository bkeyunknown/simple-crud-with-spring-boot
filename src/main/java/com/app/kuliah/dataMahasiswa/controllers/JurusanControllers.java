package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.JurusanEntity;
import com.app.kuliah.dataMahasiswa.services.jurusan.JurusanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/jurusan")
public class JurusanControllers {

    @Autowired
    JurusanService jurusanService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("jurusan", getAllJurusan());
        return "jurusan_page";
    }

    @PostMapping("/addNewJurusan")
    @ResponseBody
    public JurusanEntity addNewJurusan(@RequestBody JurusanEntity param) {
        return jurusanService.addNew(param);
    }

    @GetMapping("/getAllJurusan")
    @ResponseBody
    public List<JurusanEntity> getAllJurusan() {
        return jurusanService.getAllJurusan();
    }

    @PostMapping("/updateJurusan")
    @ResponseBody
    public JurusanEntity updateJurusan(@RequestBody JurusanEntity param) {
        return jurusanService.updateJurusan(param);
    }

    @DeleteMapping("/deleteJurusan")
    @ResponseBody
    public String deleteJurusanById(@RequestParam int id) {
        jurusanService.deleteJurusanById(id);
        return "Delete Jurusan id: "+id+" Success";
    }
}
