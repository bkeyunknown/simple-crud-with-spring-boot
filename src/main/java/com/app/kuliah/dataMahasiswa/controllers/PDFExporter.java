package com.app.kuliah.dataMahasiswa.controllers;

import com.app.kuliah.dataMahasiswa.entities.MahasiswaEntity;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;
import java.awt.*;
import java.util.List;

public class PDFExporter {
    private List<MahasiswaEntity> listMahasiswa;

    public PDFExporter(List<MahasiswaEntity> listMahasiswa) {
        this.listMahasiswa = listMahasiswa;
    }
}
